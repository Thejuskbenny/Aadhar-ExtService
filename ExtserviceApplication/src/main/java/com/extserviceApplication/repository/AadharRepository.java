package com.extserviceApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extserviceApplication.entity.AadharMaster;

public interface AadharRepository extends JpaRepository<AadharMaster, String> {

	AadharMaster getByPhoneNo(String phoneNo);
}
