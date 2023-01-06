package com.zomatocrum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomatocrum.enities.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
