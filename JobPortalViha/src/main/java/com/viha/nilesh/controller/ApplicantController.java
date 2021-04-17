package com.viha.nilesh.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viha.nilesh.model.Applicant;
import com.viha.nilesh.model.OTP;
import com.viha.nilesh.service.IApplicantService;
import com.viha.nilesh.service.IJobService;
import com.viha.nilesh.util.EmailUtility;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

	@Autowired
	private IApplicantService applicantService;

	@Autowired
	private IJobService jobService;

	@Autowired
	private EmailUtility emailUtility;

//	@Autowired
//	private CustomerValidator validator;

	private String email;

	@GetMapping("/register")
	public String registerGet(@ModelAttribute Applicant applicant, Map<String, Object> model) {
		System.out.println("ApplicantController.registerGet()"+email);
		applicant.setEmailId(email);
		return "applicant_signup";
	}

	@PostMapping("/register")
	public String registerPost(@ModelAttribute @Valid Applicant applicant, Map<String, Object> model,
			BindingResult errors) throws Exception {
		applicant.setEmailId(email);
		System.out.println("ApplicantController.registerPost() --- errors." + errors);
		if (errors.hasErrors()) {
			System.out.println("ApplicantController.registerPost() --- errors." + errors);
			return "applicant_signup";
		}

		//emailUtility.sendEmail("Varification", applicant.getEmailId(), "Your OTP is :");

		return "applicant_signup";
	}

	@GetMapping("/login")
	public String loginGet(@ModelAttribute Applicant applicant) {
		return "applicant_login";
	}

	@PostMapping("/login")
	public String loginPost(@ModelAttribute Applicant applicant, Map<String, Object> model) {
		System.out.println("Applicant : " + applicant);
		Applicant apt = applicantService.findByEmailIdAndPassword(applicant.getEmailId(), applicant.getPassword());
		System.out.println("ApplicantController.loginPost() : " + apt);
		model.put("applicant", apt);
		model.put("jobList",
				(applicant != null) ? jobService.getAllJobs() : jobService.getJobsByLocation(applicant.getLocation()));
		return "applicant_login_success";
	}

	// profile type
	@ModelAttribute("jobLocation")
	public List<String> locations() {
		return Arrays.asList("Pune, Maharashtra", "Banglore, Karnataka", "Hyderabad, Telangana");
	}

	@GetMapping("/email")
	public String generateOtp(@ModelAttribute("otp") OTP otp1) {
		return "otp_page";
	}

	@PostMapping("/email")
	public String sendOTP(@ModelAttribute("otp") OTP otp1, Map<String, Integer> model) throws Exception {
		int otp = emailUtility.generateOTP();
		// otp1.setOtp(emailUtility.generateOTP());
		email = otp1.getEmail();
		model.put("otp", otp1.getOtp());
		emailUtility.sendEmail("Varification", otp1.getEmail(), "Your OTP is : " + otp);
		return "redirect:otp";
	}

	@GetMapping("/otp")
	public String validateOtpGet(@ModelAttribute("otp") OTP otp) {
		return "otp_validate";
	}

	@PostMapping("/otp")
	public String validateOtp(@ModelAttribute("otp") OTP otp, @ModelAttribute Applicant applicant) {
		int serverOtp = emailUtility.getOtp();

		if (otp.getOtp() == serverOtp) {
			emailUtility.clearOTP();
			return "redirect:register";
		} else
			return "otp_validate";
	}

}
