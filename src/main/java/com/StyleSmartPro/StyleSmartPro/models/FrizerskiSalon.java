package com.StyleSmartPro.StyleSmartPro.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FrizerskiSalon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	private String naziv;
	@OneToMany(mappedBy = "delovnikFS")
	private List<DelovniCas> delovnik;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "delovnoMesto")
	private List<Frizer> zaposleni;

	public List<Frizer> getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(List<Frizer> zaposleni) {
		this.zaposleni = zaposleni;
	}

	private String telefon;
	private String lokacija;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "fs_id_zaloga")
	private List<Zaloga> zaloge;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<DelovniCas> getDelovnik() {
		return delovnik;
	}

	public void setDelovnik(List<DelovniCas> delovnik) {
		this.delovnik = delovnik;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public List<Zaloga> getZaloge() {
		return zaloge;
	}

	public void setZaloge(List<Zaloga> zaloge) {
		this.zaloge = zaloge;
	}

	@Override
	public String toString() {
		return "FrizerskiSalon{" +
				"id=" + id +
				", naziv='" + naziv + '\'' +
				", delovnik=" + delovnik +
				", telefon='" + telefon + '\'' +
				", lokacija='" + lokacija + '\'' +
				", zaloge=" + zaloge +
				'}';
	}
}