package com.zohocrm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm.entities.contact;
@Repository
public interface contactRepository extends JpaRepository<contact, Long> {

}
