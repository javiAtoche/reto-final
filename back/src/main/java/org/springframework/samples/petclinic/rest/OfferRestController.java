package org.springframework.samples.petclinic.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/offers")
public class OfferRestController {
	
	@Autowired
	private ClinicService clinicService;
	

}
