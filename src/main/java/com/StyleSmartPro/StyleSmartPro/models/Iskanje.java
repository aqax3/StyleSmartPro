package com.StyleSmartPro.StyleSmartPro.models;

import java.util.ArrayList;

public interface Iskanje {

	/**
	 * 
	 * @param frizer
	 */
	ArrayList<Termin> pregledProstihTerminov(Frizer frizer);

	/**
	 * 
	 * @param prostiTermini
	 * @param filter
	 */
	ArrayList<Termin> iskanjeTerminov(ArrayList<Termin> prostiTermini, ArrayList<Storitev> filter);

}