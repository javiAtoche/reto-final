package org.springframework.samples.petclinic.rest;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Offer;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/offers")
public class OfferRestController {
	
	@Autowired
	private ClinicService clinicService;
	
	
	
	//METODO GET PARA RECIBIR TODAS LAS OFERTAS
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<Collection<Offer>> getOfferList(){
		Collection<Offer> offers = this.clinicService.findAllOffers();
		
		if (offers.isEmpty()) {
			return new ResponseEntity<Collection<Offer>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Collection<Offer>>(offers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/valids", method = RequestMethod.GET)
	public ResponseEntity<Collection<Offer>> getOfferValidList(){
		Collection<Offer> offers = this.clinicService.findAllOffersValids();
		
		if (offers.isEmpty()) {
			return new ResponseEntity<Collection<Offer>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Collection<Offer>>(offers, HttpStatus.OK);
	}
	
	//METODO GET PARA RECIBIR UNA OFERTA DADA UNA ID
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Offer> getOffer(@PathVariable("id") int id){
		Offer offer = null;
		offer = this.clinicService.findOfferById(id);
		if (offer == null) {
			return new ResponseEntity<Offer>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Offer>(offer, HttpStatus.OK);
	}
	
	//METODO POST PARA AÑADIR OFERTAS
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Offer> addOffer(@RequestBody @Valid Offer offer,BindingResult bindingResult,
			UriComponentsBuilder ucBuilder) {
		BindingErrorsResponse errors = new BindingErrorsResponse();
		HttpHeaders headers = new HttpHeaders();
		
		if (bindingResult.hasErrors() || (offer == null)) {
			errors.addAllErrors(bindingResult);
			headers.add("errors", errors.toJSON());
			return new ResponseEntity<Offer>(headers, HttpStatus.BAD_REQUEST);
		}
		
		this.clinicService.saveOffer(offer);
		headers.setLocation(ucBuilder.path("/api/owners/{id}").buildAndExpand(offer.getId()).toUri());
		return new ResponseEntity<Offer>(offer, headers, HttpStatus.CREATED);
		
	}
	
	//METODO QUE BORRA UNA OFERTA
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteOffer(@PathVariable("id") int id) {
		Offer offer = this.clinicService.findOfferById(id);
		if (offer == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		this.clinicService.deleteOffer(offer);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	//METODO QUE ACTUALIZA UNA OFERTA
	
	
	
	

}
