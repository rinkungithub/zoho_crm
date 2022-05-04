package com.zohocrm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm.entities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
