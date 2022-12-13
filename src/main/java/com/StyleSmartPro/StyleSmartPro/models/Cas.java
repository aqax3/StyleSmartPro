package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Cas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Calendar datum;
	private int dolzinaIzvajanja;

}