package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{

	@Column(name = "title")
	@NotEmpty
	private String title;
	 	
	@Column(name = "desscription")
	@NotEmpty
	private String description;
	 
	@Column(name = "discount")
	@NotEmpty
	private String discount;
	 
	@Column(name = "expiredata")
	@NotEmpty
	private String expireData;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getExpireData() {
		return expireData;
	}

	public void setExpireData(String expireData) {
		this.expireData = expireData;
	}

	@Override
	public String toString() {
		return "Offer [title=" + title + ", description=" + description + ", discount=" + discount + ", expireData="
				+ expireData + ", id=" + id + "]";
	}
	
	
	
	
	 
	 
	
}
