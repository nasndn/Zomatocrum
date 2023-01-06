package com.zomatocrum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zomatocrum.enities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
