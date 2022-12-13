package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
public class Zaloga {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	private String ime;
	private int kolicina;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FS_id_zaloga")
	private FrizerskiSalon zalogaVFS;

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

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(Integer kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return this.getIme();
	}
}