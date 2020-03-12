
public class ExercicioDois {
	
	public static boolean possoIrBanco(String dia, int hora) {
		boolean DiaHora = (dia == "Segunda" && hora >= 8 && hora <= 18 ||  dia == "Terça" && hora >= 8 && hora <= 18 || dia == "Quarta" && hora >= 8 && hora <= 18 || dia == "Quinta" && hora >= 8 && hora <= 18 || dia == "Sexta" && hora >= 8 && hora <= 18);
		return DiaHora;
	
		
	}
	
	public static void main(String[] args) {
		boolean DiaHora1 = possoIrBanco("Quinta", 18);
		System.out.println(""+DiaHora1);
	}

}
