package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{

	@Column(name = "title")
	@NotEmpty
	private String title;
	 	
	@Column(name = "description")
	@NotEmpty
	private String description;
	 
	@Column(name = "discount")
	private Double discount;
	 
	@Column(name = "expire_date")
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date expireDate;

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

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireData) {
		this.expireDate = expireData;
	}

	@Override
	public String toString() {
		return "Offer [title=" + title + ", description=" + description + ", discount=" + discount + ", expireData="
				+ expireDate + ", id=" + id + "]";
	}
	
	
	
	
	 
	 
	
}
