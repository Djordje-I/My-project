package cubes;

public class Motor {
	
	//zapremina se izrazava u l
	double zapremina;
	//jacina motora se izrazava u kW
	int jacina;
	String tipGoriva;
	
	public Motor () {
		
	}
	
	public Motor (double nZapremina, int nJacina, String nTipGoriva) {
		
		zapremina = nZapremina;
		jacina = nJacina;
		tipGoriva = nTipGoriva;
		
	}
	
	public void SpecifikacijeMotora() {
		System.out.println("|Zapremina motora je:" + zapremina + "  | Jacina motora je:" + jacina + "  |  tip goriva je:" + tipGoriva+" |");
	}
	
	public void povecajSnagu(int vecaSnaga) {
	jacina = jacina + vecaSnaga;
	System.out.println("Nova snaga motora je:" +jacina);
		
	}
	public void InformacijeMotora () {
		System.out.println("BMW 520d 2019. godine opremljen je četverocilindričnim dizelskim motorom snage od približno 140 kW do 160 kW.Tipično ima automatski prijenos,");
		System.out.println("i pruža dobru ekonomičnost goriva, što ga čini atraktivnim izborom za one koji traže kombinaciju luksuza i učinkovitosti.");
	}
	public void InformacijeMotora2 () {
		System.out.println("Toyota C-HR Hibrid ima hibridni pogonski sustav koji kombinira benzinski četverocilindrični motor s elektromotorom. Ovaj model često koristi,");
		System.out.println("automatski prijenos i ima visoku učinkovitost goriva zahvaljujući sposobnosti vožnje na električni pogon u određenim uvjetima. Točne specifikacije,");
		System.out.println("ovise o konkretnom modelu i godini proizvodnje. Preporučujem konzultaciju tehničkih priručnika ili lokalnog dilera za preciznije informacije.");
	}

	public void informacijeMotora3 () {
		System.out.println("Tesla Model Y koristi električni pogon s varijantama motora, uključujući Long Range i Performance modele. Model Y Long Range ima dva elektromotora,");
		System.out.println(" s ukupnom snagom iznad 300 kW i pogon na sve kotače, dok Performance model pruža dodatne performanse. Model Y Standard Range ima jedan elektromotor,");
		System.out.println(" s manjom snagom. Detalji se mogu razlikovati ovisno o verziji i godini proizvodnje.");
	}
}
