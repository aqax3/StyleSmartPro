package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Calendar;

@Entity
public class Termin{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private Calendar datum;
	private int dolzinaIzvajanja;

	@OneToMany(mappedBy = "storitevTermina")
	private ArrayList<Storitev> storitve;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "frizer_Id_termin")
	private Frizer terminFrizerja;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="stranka_id_termin")
	private RegistriranaStranka terminStranke;

	public ArrayList<Storitev> getStoritve() {
		return storitve;
	}

	public void setStoritve(ArrayList<Storitev> storitve) {
		this.storitve = storitve;
	}

	public Frizer getTerminFrizerja() {
		return terminFrizerja;
	}

	public void setTerminFrizerja(Frizer terminFrizerja) {
		this.terminFrizerja = terminFrizerja;
	}

	public RegistriranaStranka getTerminStranke() {
		return terminStranke;
	}

	public void setTerminStranke(RegistriranaStranka terminStranke) {
		this.terminStranke = terminStranke;
	}
}