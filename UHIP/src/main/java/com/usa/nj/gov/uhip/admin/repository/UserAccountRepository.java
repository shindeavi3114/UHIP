package com.usa.nj.gov.uhip.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usa.nj.gov.uhip.admin.entity.UserAccountEntity;

/**
 * HERE,USERSERVICE REPOSITORY
 * @author AVINASH
 *
 */
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountEntity, String>{

}
