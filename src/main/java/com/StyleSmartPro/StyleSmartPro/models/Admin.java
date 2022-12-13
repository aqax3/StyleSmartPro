package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
public class Admin {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	private String ime;

	private String priimek;

	private String gmail;

	private String geslo;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPriimek() {
		return priimek;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getGeslo() {
		return geslo;
	}

	public void setGeslo(String geslo) {
		this.geslo = geslo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String userName;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}




	/**
	 * 
	 * @param uporabnik
	 */
	public void izbrisKrsitve(RegistriranaStranka uporabnik) {
		// TODO - implement Admin.izbrisKrsitve
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stranka
	 */
	public void odstranitevStranke(RegistriranaStranka stranka) {
		// TODO - implement Admin.odstranitevStranke
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stranka
	 * @param komentar
	 */
	public void izbrisKomentarja(RegistriranaStranka stranka, Komentar komentar) {
		// TODO - implement Admin.izbrisKomentarja
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param stranka
	 */
	public void dodajanjeKrsitev(RegistriranaStranka stranka) {
		// TODO - implement Admin.dodajanjeKrsitev
		throw new UnsupportedOperationException();
	}

}