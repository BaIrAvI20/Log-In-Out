package com.log.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log.pojo.LoginPojo;

@Repository
public interface Details extends JpaRepository<LoginPojo,String> {

}
