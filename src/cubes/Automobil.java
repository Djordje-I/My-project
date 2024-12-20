package cubes;

public class Automobil {
	
	String marka;
	String model;
	int godiste;
	String regTablica;
	int brojVrata;
	String boja;
	Motor motor;
	
	public Automobil () {
		
	}
	
	public Automobil (String nMarka, String nModel,int nGodiste,int nBrojVrata,String nBoja) {
		
		marka = nMarka;
		model = nModel;
		godiste = nGodiste;
		brojVrata = nBrojVrata;
		boja = nBoja;
		
		
	}
	
	public void Automobill() {
		System.out.println("|Marka auta:" + marka + "|  model:" + model + "  |  godiste:" + godiste + "  |  Broj vrata:" + brojVrata + "  |  boja:" + boja+"|");
	}
	
	public void ofarbaj(String novaBoja) {
		boja = novaBoja;
		
		System.out.println("Nova boja automobila je: " + boja);
		
	}
	
	public Automobil(String nRegTablica) {
		regTablica = nRegTablica;
		
	}
	
	public void regTablica () {
		System.out.println("Registarski broj tablica je: "+ regTablica);
	}
	
	public void dajMiInformacije () {
		System.out.println("BMW 520d 2019. godine je srednje veliki luksuzni automobil s dizelskim motorom. Opremljen je sportskim i elegantnim dizajnom,");
		System.out.println("naprednim tehnološkim značajkama, te sigurnosnim sustavima. Tipično nudi dobru ekonomičnost goriva i kombinira udobnost s dinamikom vožnje.");
	}
	
	public void dajMiInformacije2 () {
		System.out.println("Toyota C-HR ima sve što vam je potrebno za životnu avanturu. Izuzetno efikasan, nudi trenutno ubrzanje koje čini preticanje lakšim,");
		System.out.println("izvršavajući lako sve vaše želje u vožnji kako biste mogli da savladate bilo koji put. Otključajte svet uz Toyota C-HR");
	}

	public void dajMiInformacije3 () {
		System.out.println("Tesla Model Y je električni crossover SUV proizvođača Tesla. Dolazi s nekoliko varijanti, uključujući Long Range, Performance i Standard Range,");
		System.out.println(" s različitim rasponima i performansama. Može primiti do pet putnika (mogućnost trećeg reda sjedala). Model Y je po dizajnu sličan Modelu 3,");
		System.out.println("ali je veći i ima povišeni položaj sjedenja. Karakterizira ga snažan električni pogon, impresivna ubrzanja, tehnološki napredne značajke i");
		System.out.println("autonomna vožnja putem sustava Autopilota i Full Self-Driving (FSD)");
		
	}
}
