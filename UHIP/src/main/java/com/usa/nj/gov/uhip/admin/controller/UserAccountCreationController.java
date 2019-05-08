package com.usa.nj.gov.uhip.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.usa.nj.gov.uhip.admin.model.UserAccountModel;
import com.usa.nj.gov.uhip.admin.serviceimpl.UserAccountServiceImpl;

/**
 * HERE,THIS IS THE USERACCOUNT CONTROLLER CLASS FORM LOADING AND FORM SUBMITING
 * @author Avinash
 *
 */
@Controller
public class UserAccountCreationController {
    
	@Autowired
	private UserAccountServiceImpl userAccountServiceImpl;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String creationUserAccount(Model model) {
		UserAccountModel userAccountModel = new UserAccountModel();
		model.addAttribute("userAccountModel",userAccountModel);
		return "createUserAccount";
		
	}
}
