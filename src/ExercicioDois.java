
public class ExercicioDois {
	
	public static boolean possoIrBanco(String dia, int hora) {
		/*boolean DiaHora = (dia == "Segunda" && hora >= 8 && hora <= 18 ||  dia == "Ter�a" && hora >= 8 && hora <= 18 || dia == "Quarta" && hora >= 8 && hora <= 18 || dia == "Quinta" && hora >= 8 && hora <= 18 || dia == "Sexta" && hora >= 8 && hora <= 18);
		return DiaHora;*/ //Maneira 1
		/*return !(dia.equalsIgnoreCase("Domingo") ||dia.equalsIgnoreCase("Sabado"))
				&& hora >=10 && hora <= 16;    (Segunda forma:� um ponto de nega��o
		quer dizer que tudo que n�o for Sabado ou Domingo � verdadeiro. porem foca so que no ta entre parenteses
		depois faz a verifica��o da hora*/
		
		return ExercicioUm.ehDiaSemana(dia) && hora >=10 && hora <= 16; /* terceira forma: Ele aproveita a classe 
		ExercicioUm e o metodo dessa classe heDiaSemana(dia)*/
	
		//Private visivel apenas na propria classe
	}
	
	public static void main(String[] args) {
		boolean DiaHora1 = possoIrBanco("Ter�a", 16);
		System.out.println(""+DiaHora1);
	}

}
