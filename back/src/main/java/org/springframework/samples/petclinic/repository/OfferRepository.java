package org.springframework.samples.petclinic.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Serializable>{
	
	public List<Offer> findByExpireDateAfter(Date now);
}
