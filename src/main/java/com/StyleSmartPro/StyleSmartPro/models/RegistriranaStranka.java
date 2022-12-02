package com.StyleSmartPro.StyleSmartPro.models;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.Calendar;

public class RegistriranaStranka extends Uporabnik implements Iskanje {

	private ArrayList<Termin> termini;
	private Location trenutnaLokacija;
	private int krsitve;
	private ArrayList<Komentar> seznamKomentarjev;

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