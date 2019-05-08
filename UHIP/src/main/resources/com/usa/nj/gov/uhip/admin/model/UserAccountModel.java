package com.usa.nj.gov.uhip.admin.model;

import java.util.Date;

import lombok.Data;
@Data
public class UserAccountModel {
	private Long userAccId;
	private String firstName;
	private String lastName;
	private String userEmail;
	private String userPwd;
	private String dob;
	private Long ssn;
	private String role;
	private String activeSwitch;
	
	private Date createdDate;
	
	private Date updatedDate;
	
	private String createdBy;
	private String updatedBy;
}
