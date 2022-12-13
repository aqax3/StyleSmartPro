package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
public class Komentar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private short ocena;
	private String komentar;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="stranka_id_komentar")
	private RegistriranaStranka komentarStranke;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public short getOcena() {
		return ocena;
	}

	public void setOcena(short ocena) {
		this.ocena = ocena;
	}

	public String getKomentar() {
		return komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	public RegistriranaStranka getKomentarStranke() {
		return komentarStranke;
	}

	public void setKomentarStranke(RegistriranaStranka komentarStranke) {
		this.komentarStranke = komentarStranke;
	}
}