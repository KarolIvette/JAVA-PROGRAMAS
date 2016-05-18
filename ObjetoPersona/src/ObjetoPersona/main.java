package ObjetoPersona;

public class main {
	public static void main(String[] args) 
	{
		Persona objeto1 = new Persona("0802708917", "KAROL", "CEDEÑO CEDEÑO", 1995, "0979725724", "ESMERALDAS", 2);
		Persona objeto2 = new Persona("0801167602", "MILER", "TENORIO CEDEÑO", 1971, "0988464352", "QUITO", 1);
		Persona objeto3 = new Persona("0801662164", "ARACELI", "GARCIA CEDEÑO", 1970, "0939587707", "GUAYAQUIL", 1);
		Persona objeto4 = new Persona("0802708917", "AYRTON", "ADAME BERNAL", 1994, "0994375200", "ESMERALDAS", 2);
		
		System.out.println("PERSONA 1");
		System.out.println(objeto1.mostrarDatos(objeto1));
        objeto1.viveEsmeraldas("ESMERALDAS");
        objeto1.mayor30(1995);
        objeto1.esCasado(2);
         
        System.out.println("-----------------------------------------");
        System.out.println("PERSONA 2");
        System.out.println(objeto2.mostrarDatos(objeto2));
        objeto2.viveEsmeraldas("QUITO");
        objeto2.mayor30(1971);
        objeto2.esCasado(1);
         
        System.out.println("-----------------------------------------");
        System.out.println("PERSONA 3");
        System.out.println(objeto3.mostrarDatos(objeto3));
        objeto3.viveEsmeraldas("GUAYAQUIL");
        objeto3.mayor30(1970);
        objeto3.esCasado(1);
        
        System.out.println("-----------------------------------------");
        System.out.println("PERSONA 4");
        System.out.println(objeto4.mostrarDatos(objeto4));
        objeto4.viveEsmeraldas("ESMERALDAS");
        objeto4.mayor30(1994);
        objeto4.esCasado(2);
	}
}
