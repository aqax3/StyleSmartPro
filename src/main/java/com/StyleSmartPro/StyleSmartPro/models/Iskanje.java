public interface Iskanje {

	/**
	 * 
	 * @param frizer
	 */
	arrayList<Termin> pregledProstihTerminov(Frizer frizer);

	/**
	 * 
	 * @param prostiTermini
	 * @param filter
	 */
	arrayList<Termin> iskanjeTerminov(arrayList<Termin> prostiTermini, arrayList<Storitev> filter);

}