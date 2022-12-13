package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.Entity;

import java.util.ArrayList;

@Entity
public class Termin extends Cas {

	private ArrayList<Storitev> storitve;

}