package com.ibm.train.pojo;

public class Train {
	private String name;
	private String source;
	private String destiny;
	private int tcode;
	public Train() {
	}

	public Train(int tcode ,String name, String source, String destiny) {
		super();
		this.tcode=tcode;
		this.name = name;
		this.source = source;
		this.destiny = destiny;
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

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	

}
