package com.viha.nilesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.viha.nilesh.model.Project;
import com.viha.nilesh.service.IApplicantService;
import com.viha.nilesh.service.IProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private IProjectService projectService;
	
	@Autowired
	private IApplicantService applicantService;
	
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
	
	//@InitBinder
//	public void myInitBinder(HttpServletRequest req,ServletRequestDataBinder binder) {
//		System.out.println("ProjectController.myInitBinder()");
//		binder.registerCustomEditor(Applicant.class, "name", new PropertyEditorSupport() {
//		@Override
//		public void setAsText(String text) {
//			Applicant app = (Applicant)em.createNamedQuery("A0pplicant.findById")
//					.setParameter("id",Integer.parseInt(text)).getSingleReasult();
//			setValue(type);
//		})
//		//binder.registerCustomEditor(requiredType, field, propertyEditor);
////		SimpleDateFormat sdg = new SimpleDateFormat();
////		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
//	}
	
//	@InitBinder("myForm")
//	public void myInitBinder(WebDataBinder binder) {
//		System.out.println("ProjectController.myInitBinder()");
//		binder.registerCustomEditor(Applicant.class, "name", new PropertyEditorSupport() {
//			//@Override
////			public void setAsText(String text) {
////				Applicant app = (Applicant)em.createNamedQuery("A0pplicant.findById")
////						.setParameter("id",Integer.parseInt(text)).getSingleReasult();
////				setValue(type);
////			})
//		}
//
//	
	
	
}
