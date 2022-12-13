package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Date;

@MappedSuperclass
public abstract class Cas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	private Long id;

	private Date datum;
	private int dolzinaIzvajanja;

}