package com.zomatocrum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomatocrum.enities.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
