package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
public class Admin extends Uporabnik {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;


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