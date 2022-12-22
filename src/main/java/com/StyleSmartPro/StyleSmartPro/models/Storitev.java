package com.StyleSmartPro.StyleSmartPro.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Storitev {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private String ime;
	private int priblizenCasTrajanja;
	private String spol;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="termin_id_stortitev")
	private Termin storitevTermina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public Termin getStoritevTermina() {
		return storitevTermina;
	}

	public void setStoritevTermina(Termin storitevTermina) {
		this.storitevTermina = storitevTermina;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getPriblizenCasTrajanja() {
		return priblizenCasTrajanja;
	}

	public void setPriblizenCasTrajanja(int priblizenCasTrajanja) {
		this.priblizenCasTrajanja = priblizenCasTrajanja;
	}

	public String getSpol() {
		return spol;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}

	@Override
	public String toString() {
		return "Storitev{" +
				"id=" + id +
				", ime='" + ime + '\'' +
				", priblizenCasTrajanja=" + priblizenCasTrajanja +
				", spol='" + spol + '\'' +
				", storitevTermina=" + storitevTermina +
				'}';
	}
}