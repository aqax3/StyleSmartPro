package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Termin extends Cas {

	@OneToMany(mappedBy = "storitevTermina")
	private ArrayList<Storitev> storitve;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "frizer_Id_termin")
	private Frizer terminFrizerja;

}