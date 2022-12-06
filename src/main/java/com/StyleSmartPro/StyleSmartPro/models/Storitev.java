package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
public class Storitev {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private String ime;
	private int priblizenCasTrajanja;
	private String spol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getPriblizenCasTrajanja() {
		return priblizenCasTrajanja;
	}

	public void setPriblizenCasTrajanja(int priblizenCasTrajanja) {
		this.priblizenCasTrajanja = priblizenCasTrajanja;
	}

	public String getSpol() {
		return spol;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}

}