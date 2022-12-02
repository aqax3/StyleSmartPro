public class RegistriranaStranka extends Uporabnik implements Iskanje {

	private arrayList<Termin> termini;
	private Location trenutnaLokacija;
	private int krsitve;
	private arrayList<Komentar> seznamKomentarjev;

	/**
	 * 
	 * @param ocena
	 * @param komentar
	 * @param termin
	 */
	public Komentar ocenjevanjeStoritev(short ocena, string komentar, Termin termin) {
		// TODO - implement RegistriranaStranka.ocenjevanjeStoritev
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param produkt
	 * @param frizerskiSalon
	 */
	public boolean pregledZalog(string produkt, FrizerskiSalon frizerskiSalon) {
		// TODO - implement RegistriranaStranka.pregledZalog
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param frizer
	 * @param datum
	 * @param storitev
	 */
	public Termin narocanje(Frizer frizer, Calendar datum, Storitev storitev) {
		// TODO - implement RegistriranaStranka.narocanje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param frizer
	 * @param datum
	 * @param storitev
	 */
	public Termin lastMinuteBooking(Frizer frizer, Calendar datum, Storitev storitev) {
		// TODO - implement RegistriranaStranka.lastMinuteBooking
		throw new UnsupportedOperationException();
	}

}