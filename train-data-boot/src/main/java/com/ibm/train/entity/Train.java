package com.ibm.train.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	@GeneratedValue
	@Column(name="train_no")
	private int tcode;
	@Column(name="train_name",length=20)
	private String name;
	@Column(length=20)
	private String source;
	@Column(length=20)
	private String desinty;
	
	public Train() {
		// TODO Auto-generated constructor stub
	}

	public Train(int tcode, String name, String source, String desinty) {
		super();
		this.tcode = tcode;
		this.name = name;
		this.source = source;
		this.desinty = desinty;
	}

	public int getTcode() {
		return tcode;
	}

	public void setTcode(int tcode) {
		this.tcode = tcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDesinty() {
		return desinty;
	}

	public void setDesinty(String desinty) {
		this.desinty = desinty;
	}

}
