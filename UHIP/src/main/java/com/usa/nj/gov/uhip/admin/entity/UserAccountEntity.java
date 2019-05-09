package com.usa.nj.gov.uhip.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.auditing.CurrentDateTimeProvider;

import lombok.Data;

/**
 * THIS IS THE ENTITY CLASS
 * 
 * @author AVINASH
 *
 */
@Entity
@Table(name = "USER_ACCOUNT_ENTITY")
@Data
public class UserAccountEntity {

	@Id
	@SequenceGenerator(
			 sequenceName="user_acc_seq",
			 initialValue=0,
			 allocationSize=1,
			 name="user_acc_seq_gen"
			)
	@GeneratedValue(generator="user_acc_seq_gen")
	@Column(name="USER_ACC_ID")
  	protected Long userAccId;
	@Column(name="FIRST_NAME")
	protected String firstName;
	@Column(name="LAST_NAME")
	protected String lastName;
	@Column(name="USER_NAME")
	protected String userEmail;
	@Column(name="USER_PWD")
	protected String userPwd;
	@Column(name="DOB")
	protected String dob;
	@Column(name="GENDER")
	protected String gender;
	@Column(name="SSN")
	protected Long ssn;
	@Column(name="ROLE")
	protected String role;
	@Column(name="ACTIVE_SWITCH")
	protected String activeSwitch;
	
	@CreationTimestamp
	@Column(name="CREATE_DATE")
	protected Date createdDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE")
	protected Date updatedDate;
	
	@Column(name="CREATED_BY")
	protected String createdBy;
	@Column(name="UPDATED_BY")
	protected String updatedBy;

}
