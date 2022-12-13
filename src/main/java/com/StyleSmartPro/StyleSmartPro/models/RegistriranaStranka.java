package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
public class RegistriranaStranka implements Iskanje {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;
	private String ime;

	private String priimek;

	private String gmail;

	private String geslo;

	@OneToMany(mappedBy="terminStranke")
	private List<Termin> termini;

	private String trenutnaLokacija;

	private int krsitve;

	@OneToMany(mappedBy = "komentarStranke")
	private List<Komentar> seznamKomentarjev;


	/**
	 * 
	 * @param ocena
	 * @param komentar
	 * @param termin
	 */
	public Komentar ocenjevanjeStoritev(short ocena, String komentar, Termin termin) {
		// TODO - implement RegistriranaStranka.ocenjevanjeStoritev
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param produkt
	 * @param frizerskiSalon
	 */
	public boolean pregledZalog(String produkt, FrizerskiSalon frizerskiSalon) {
		// TODO - implement RegistriranaStranka.pregledZalog
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param frizer
	 * @param datum
	 * @param storitev
	 */
	public Termin narocanje(Frizer frizer, Calendar datum, Storitev storitev) {
		// TODO - implement RegistriranaStranka.narocanje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param frizer
	 * @param datum
	 * @param storitev
	 */
	public Termin lastMinuteBooking(Frizer frizer, Calendar datum, Storitev storitev) {
		// TODO - implement RegistriranaStranka.lastMinuteBooking
		throw new UnsupportedOperationException();
	}

	@Override
	public ArrayList<Termin> pregledProstihTerminov(Frizer frizer) {
		return null;
	}

	@Override
	public ArrayList<Termin> iskanjeTerminov(ArrayList<Termin> prostiTermini, ArrayList<Storitev> filter) {
		return null;
	}
}