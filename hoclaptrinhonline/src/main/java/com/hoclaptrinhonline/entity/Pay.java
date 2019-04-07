package com.hoclaptrinhonline.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "PAY")

public class Pay {
	@EmbeddedId PayId payId;
	
	double total ;

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
