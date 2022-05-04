package com.zohocrm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm.entities.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
