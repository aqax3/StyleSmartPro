package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Uporabnik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",nullable = false)
	private long id;

	@Column(name = "ime")
	private String ime;

	@Column(name = "priimek")
	private String priimek;

	@Column(name = "gmail")
	private String gmail;

	@Column(name = "geslo")
	private String geslo;

	@Column(name = "userName")
	private String userName;

}