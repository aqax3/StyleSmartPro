package com.StyleSmartPro.StyleSmartPro.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
public class Termin{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private Calendar datum;
	private int dolzinaIzvajanja;

	@OneToMany(mappedBy = "storitevTermina")
	private List<Storitev> storitve;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "frizer_Id_termin")
	private Frizer terminFrizerja;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="stranka_id_termin")
	private RegistriranaStranka terminStranke;

	public List<Storitev> getStoritve() {
		return storitve;
	}

	public void setStoritve(List<Storitev> storitve) {
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


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDatum() {
		return datum;
	}

	public void setDatum(Calendar datum) {
		this.datum = datum;
	}

	public int getDolzinaIzvajanja() {
		return dolzinaIzvajanja;
	}

	public void setDolzinaIzvajanja(int dolzinaIzvajanja) {
		this.dolzinaIzvajanja = dolzinaIzvajanja;
	}

	@Override
	public String toString() {
		return "Termin{" +
				"id=" + id +
				", datum=" + datum +
				", dolzinaIzvajanja=" + dolzinaIzvajanja +
				", storitve=" + storitve +
				", terminFrizerja=" + terminFrizerja +
				", terminStranke=" + terminStranke +
				'}';
	}
}