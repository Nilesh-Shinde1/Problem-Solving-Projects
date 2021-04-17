package com.viha.nilesh.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viha.nilesh.model.Job;
import com.viha.nilesh.model.Project;
import com.viha.nilesh.model.Recruiter;
import com.viha.nilesh.service.IApplicantService;
import com.viha.nilesh.service.IJobService;
import com.viha.nilesh.service.IProjectService;
import com.viha.nilesh.service.IRecruiterService;

@Controller
@RequestMapping("/recruiter")
public class RecruiterController {
	
	@Autowired
	private IRecruiterService recruiterService;
	
	@Autowired
	private IJobService jobService;

	@Autowired
	private IProjectService projectService;
	
	@Autowired
	private IApplicantService applicantService;
	
	@GetMapping("/register")
	public String registerGet(@ModelAttribute Recruiter recruiter) {
		return "recruiter_signup";
	}
	
	@PostMapping("/register")
	public String registerPost(@ModelAttribute Recruiter recruiter,
			Map<String, String> model) {
		model.put("name", recruiterService.register(recruiter));
		return "recruiter_signup";
	}
	
	@GetMapping("/login")
	public String loginGet(@ModelAttribute Recruiter recruiter) {
		return "recruiter_login";
	}
	
	@PostMapping("/login")
	public String loginPost(@ModelAttribute Recruiter recruiter,
			Map<String, Object> model) {
		model.put("recruiter", recruiterService.findByEmailIdAndPassword(recruiter.getEmailId(), recruiter.getPassword()));
		model.put("jobList", jobService.getAllJobs());
		return "recruiter_login_success";
	}
	
	@GetMapping("/jobPosting")
	public String jobPostingGet(@ModelAttribute Job job) {
		return "job_post";
	}
	
	@PostMapping("/jobPosting")
	public String jobPostingPost(@ModelAttribute Job job, Map<String,String> model) {
//		attrs.addFlashAttribute("job", job);
		model.put("title", jobService.postJob(job));
		return "job_post";
	}
	
	//profile type
	@ModelAttribute("jobLocation")
	public List<String> locations(){
		return Arrays.asList("Pune, Maharashtra","Banglore, Karnataka", "Hyderabad, Telangana");
	}
	
	//add project
	public String addProjectGet() {
		return "project_form";
	}
	
	
	
	
	
	
	@GetMapping("/add")
	public String addProjectGet(@ModelAttribute Project project, Map<String, Object> model) {
		model.put("applicants", applicantService.getAllApplicants());
		return "project_form";
	}
	
	@PostMapping("/add")
	public String addProjectPost(@ModelAttribute Project project, 
			Map<String, String> model) {
		model.put("name", projectService.addProject(project));
		return "project_form";
	}
	
//	@ModelAttribute("/applicants")
//	public Set<Applicant> applicants(){
//		return applicantService.getAllApplicants();
//	}
}
