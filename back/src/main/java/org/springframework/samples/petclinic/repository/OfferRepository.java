package org.springframework.samples.petclinic.repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Serializable>{
	
	void saveOffer(Offer offer);
	
	void deleteOffer(Offer offer);
	
	void updateOffer(Offer offer,int id);
	
	Collection <Offer> findOffers();
	
	Offer findById(int id);
	
	Collection <Offer> findValidateOffers(Date dateNow);

}
