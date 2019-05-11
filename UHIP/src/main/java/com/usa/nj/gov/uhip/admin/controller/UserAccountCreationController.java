package com.usa.nj.gov.uhip.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usa.nj.gov.uhip.admin.constant.AppConstant;
import com.usa.nj.gov.uhip.admin.model.UserAccountModel;
import com.usa.nj.gov.uhip.admin.serviceimpl.UserAccountServiceImpl;

/**
 * HERE,THIS IS THE USERACCOUNT CONTROLLER CLASS FORM LOADING AND FORM SUBMITING
 * 
 * @author Avinash
 *
 */
@Controller
public class UserAccountCreationController {
	private static final Logger logger = LoggerFactory.getLogger(UserAccountCreationController.class);

	@Autowired
	private UserAccountServiceImpl userAccountServiceImpl;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loadAccountCreationForm(Model model) {
		logger.debug(" *** loadAccountCreationForm() started***");
		UserAccountModel userAccountModel = new UserAccountModel();
		model.addAttribute(AppConstant.USER_ACCOUNT_MODEL, userAccountModel);
		initializeFormValue(model);
		logger.debug(" *** loadAccountCreationForm() completed***");
		logger.debug(" *** loadAccountCreationForm() Successfully. ***");
		return AppConstant.USER_ACCOUNT_CREATION_VIEW;

	}

	public void initializeFormValue(Model model) {
		List<String> genderList = new ArrayList();
		genderList.add("Male");
		genderList.add("Female");
		model.addAttribute("gender", genderList);
		
		List<String> roleList = new ArrayList();
		roleList.add("Admin");
		roleList.add("Case Worker");
		model.addAttribute("role", roleList);
	 
	}
	@RequestMapping(value = "/createUserAccount", method = RequestMethod.POST)
	public String createUserAccount(@ModelAttribute("userAccountModel") UserAccountModel userAccountModel,Model model) {
		
		boolean isValue=userAccountServiceImpl.createUserAccount(userAccountModel);
		if(isValue){
			//sucess
			model.addAttribute("sucess", "Account Created Successfully");
		}else {
			//failure
			model.addAttribute("failure", "Account Created Failure ..!! Try again...");
		}
		initializeFormValue(model);
		return AppConstant.USER_ACCOUNT_CREATION_VIEW;
		
	}
}
