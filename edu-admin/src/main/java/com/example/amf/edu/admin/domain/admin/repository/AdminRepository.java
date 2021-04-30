package com.example.amf.edu.admin.domain.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amf.edu.admin.domain.admin.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findAdminByEmail(String email);
}