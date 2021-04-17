//CustomerValidator.java
package com.viha.nilesh.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.viha.nilesh.model.Applicant;

@Component("custValidator")
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerValidator.supports()");
			return clazz.isAssignableFrom(Applicant.class);  //To check wheather correct Model class is coming not
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("CustomerValidator.validate()");
		//type casting
		Applicant applicant=(Applicant)target;
		//form validation logics (server side)
		if(applicant.getFirstName()==null || applicant.getFirstName().isEmpty())  //required rule
			//errors.rejectValue("cname","cname.required");
			errors.reject("firstName", "First Name is Required");
//		else if(cust.getCname().length()<5)  //minlenth rule
//			errors.rejectValue("cname","cname.minlen");
//		
//		if(cust.getCadd()==null || cust.getCadd().isEmpty())  //required rule
//			errors.rejectValue("cadd","cadd.required");
//		else if(cust.getCadd().length()<8)  //minlenth rule
//			errors.rejectValue("cadd","cadd.minlen");
//		
//		if(cust.getBillAmt()==null)  //required rule
//			errors.rejectValue("billAmt","billAmt.required");
//		else  if(cust.getBillAmt()<=0)  //minlenth rule
//			errors.rejectValue("billAmt","billAmt.positive");
	}

}
