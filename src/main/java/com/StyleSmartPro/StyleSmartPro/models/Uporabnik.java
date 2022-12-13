package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Uporabnik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	@Column(name="ime")
	private String ime;

	@Column(name="priimek")
	private String priimek;
	@Column(name="gmail")
	private String gmail;

	@Column(name="geslo")
	private String geslo;

	@Column(name="userName")
	private String userName;

	public Uporabnik(){};
	public Uporabnik(String ime, String priimek, String gmail, String geslo, String userName) {
		this.ime = ime;
		this.priimek = priimek;
		this.gmail = gmail;
		this.geslo = geslo;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Uporabnik{" +
				"id=" + id +
				", ime='" + ime + '\'' +
				", priimek='" + priimek + '\'' +
				", gmail='" + gmail + '\'' +
				", geslo='" + geslo + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}