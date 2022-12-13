package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import javax.xml.stream.Location;
import java.util.ArrayList;

@Entity
public class FrizerskiSalon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	private String naziv;
	@OneToMany(mappedBy = "delovnikFS")
	private ArrayList<DelovniCas> delovnik;
	private String telefon;
	@OneToMany(mappedBy = "delovnoMesto")
	private ArrayList<Frizer> zaposleni;
	private String lokacija;
	@OneToMany(mappedBy = "zalogaVFS")
	private ArrayList<Zaloga> zaloge;

}