package org.springframework.samples.petclinic.repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Serializable>{
	
	void createOffer(Offer offer);
	
	void deleteOffer(Offer offer);
	
	Collection <Offer> getOffers();
	
	Offer getOfferById(int id);
	
	Collection <Offer> getValidateOffers(Date dateNow);

}
