package com.usa.nj.gov.uhip.admin.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.nj.gov.uhip.admin.entity.UserAccountEntity;
import com.usa.nj.gov.uhip.admin.model.UserAccountModel;
import com.usa.nj.gov.uhip.admin.repository.UserAccountRepository;
import com.usa.nj.gov.uhip.admin.service.UserAccountService;

/**
 * HERE,THIS IS THE LINK TO USERACCOUNTMODEL AND USERACCOUNTENTITY
 * 
 * @author AVINASH
 *
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {
	@Autowired
	private UserAccountRepository userAccountRepository;

	@Override
	public boolean createUserAccount(UserAccountModel userAccModel) {

		boolean isValid=false;
		try {
			UserAccountEntity userAccEntity = new UserAccountEntity();
		    BeanUtils.copyProperties(userAccModel, userAccEntity);
		    userAccEntity = userAccountRepository.save(userAccEntity);
		    if (userAccEntity.getUserAccId()> 0) {
				isValid = true;
			} else {
                isValid = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
