package com.usa.nj.gov.uhip.admin.model;

import java.util.Date;



import lombok.Data;
@Data
public class UserAccountModel {
  	protected Long userAccId;
	protected String firstName;
	protected String lastName;
	protected String userEmail;
	protected String userPwd;
	protected String dob;
	protected Long ssn;
	protected String role;
	protected String activeSwitch;
	
	protected Date createdDate;
	
	protected Date updatedDate;
	
	protected String createdBy;
	protected String updatedBy;
}
