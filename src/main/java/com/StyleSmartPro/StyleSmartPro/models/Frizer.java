package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Frizer extends Uporabnik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	private ArrayList<Termin> termini;
	private ArrayList<DelovniCas> delovniCas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Termin> getTermini() {
		return termini;
	}

	public void setTermini(ArrayList<Termin> termini) {
		this.termini = termini;
	}

	public ArrayList<DelovniCas> getDelovniCas() {
		return delovniCas;
	}

	public void setDelovniCas(ArrayList<DelovniCas> delovniCas) {
		this.delovniCas = delovniCas;
	}

	@Override
	public String toString() {
		return "Frizer{" +
				"id=" + id +
				", termini=" + termini +
				", delovniCas=" + delovniCas +
				'}';
	}

	public boolean potrditevTermina(Termin termin, RegistriranaStranka stranka) {
		// TODO - implement Frizer.potrditevTermina
		throw new UnsupportedOperationException();
	}

}