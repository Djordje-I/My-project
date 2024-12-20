package cubes;

public class MainClass {

	public static void main(String[] args) {
		
	    System.out.println("                                       PRVI AUTO");
	    System.out.println("");



		Automobil a1 = new Automobil("BMW  ","520d  ",2019  ,5  ,"Plava ");
		a1.Automobill();
		
		Motor a1M = new Motor (2.0, 150, "Dizel");
		a1M.SpecifikacijeMotora();
		
	    System.out.println("");
		
		a1.ofarbaj("Zuta");
		a1.Automobill();
		
	    System.out.println("");
		
	    Automobil a1R = new Automobil("PN123GL");    
	    a1R.regTablica();
	    
	    System.out.println("");

	    a1.dajMiInformacije();
	    
	    System.out.println("");
	    
	    a1M.povecajSnagu(12);   
	    a1M.SpecifikacijeMotora();
	    
	    System.out.println("");
	    
	    a1M.InformacijeMotora();
	    
	    System.out.println("");
	    System.out.println("                                        DRUGI AUTO");
	    System.out.println("");
	    
	    Automobil a2 = new Automobil ("Toyota ","hybrid C-hr",2015,5,"Siva");
	    a2.Automobill();
	    
	    Motor a2M = new Motor (1.8,113,"Kombinacija benzina, i elektricnog motora");
	    
	    a2M.SpecifikacijeMotora();
	    
	    System.out.println("");
	    
	    a2.ofarbaj("Crna");
	    a2M.povecajSnagu(63);
	    
	    
	    System.out.println("");
	    
	    
	    a2.Automobill();
	    a2M.SpecifikacijeMotora();
	    
	    System.out.println("");

	    
	    Automobil a2R = new Automobil("PN014SS");
	    a2R.regTablica();
	    
	    System.out.println("");
	    
	    a2.dajMiInformacije2();
	    
	    System.out.println("");

	    a2M.InformacijeMotora2();
	    
	    System.out.println("");
	    System.out.println("                                        TRECI AUTO");
	    System.out.println(""); 

	    Automobil a3 = new Automobil ("Tesla","Y",2020,5,"Bela");
	    a3.Automobill();
	    
	    Motor a3M = new Motor (0,300,"Elektricni motor");
	    a3M.SpecifikacijeMotora();
	    
	    System.out.println("");

	    a3.ofarbaj("Crvena");
	    a3M.povecajSnagu(53);
	    
	    System.out.println("");

	    
	    a3.Automobill();
	    a3M.SpecifikacijeMotora();
	    
	    System.out.println("");

	    
	    Automobil a3R = new Automobil("PN513II");
	    
	    System.out.println("");
	    
	    a3.dajMiInformacije3();
	    
	    System.out.println("");

	    a3M.informacijeMotora3();
	    
	    
	    
	    
		
		
	}

}
