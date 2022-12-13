package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Frizer extends Uporabnik {

	@OneToMany(mappedBy = "terminFrizerja")
	private List<Termin> termini;
	@OneToMany(mappedBy = "delovniCasFrizerja")
	private List<DelovniCas> delovniCas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FS_id_frizer")
	private FrizerskiSalon delovnoMesto;

	public Frizer() {};
	public Frizer(String ime, String priimek, String gmail, String geslo, String userName, List<Termin> termini, List<DelovniCas> delovniCas, FrizerskiSalon delovnoMesto) {
		super(ime, priimek, gmail, geslo, userName);
		this.termini = termini;
		this.delovniCas = delovniCas;
		this.delovnoMesto = delovnoMesto;
	}

	public List<Termin> getTermini() {
		return termini;
	}

	public void setTermini(List<Termin> termini) {
		this.termini = termini;
	}

	public List<DelovniCas> getDelovniCas() {
		return delovniCas;
	}

	public void setDelovniCas(List<DelovniCas> delovniCas) {
		this.delovniCas = delovniCas;
	}

	public FrizerskiSalon getDelovnoMesto() {
		return delovnoMesto;
	}

	public void setDelovnoMesto(FrizerskiSalon delovnoMesto) {
		this.delovnoMesto = delovnoMesto;
	}

	/**
	 * 
	 * @param termin
	 * @param stranka
	 */
	public boolean potrditevTermina(Termin termin, RegistriranaStranka stranka) {
		// TODO - implement Frizer.potrditevTermina
		throw new UnsupportedOperationException();
	}


	@Override
	public String toString() {
		return "Frizer{" +
				super.toString() +
				"termini=" + termini +
				", delovniCas=" + delovniCas +
				", delovnoMesto=" + delovnoMesto +
				'}';
	}
}