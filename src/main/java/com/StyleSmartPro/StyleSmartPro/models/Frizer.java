package com.StyleSmartPro.StyleSmartPro.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Frizer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private String ime;

	private String priimek;

	private String gmail;

	private String geslo;

	private String userName;

	@OneToMany(mappedBy = "terminFrizerja")
	private List<Termin> termini;
	@OneToMany(mappedBy = "delovniCasFrizerja")
	private List<DelovniCas> delovniCas;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FS_id_frizer")
	private FrizerskiSalon delovnoMesto;

	public List<Termin> getTermini() {
		return termini;
	}

	public void setTermini(List<Termin> termini) {
		this.termini = termini;
	}

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


	/*@Override
	public String toString() {
		return "Frizer{" +
				super.toString() +
				"termini=" + termini +
				", delovniCas=" + delovniCas +
				", delovnoMesto=" + delovnoMesto +
				'}';
	}*/
}