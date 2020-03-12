
public class ExercicioDois {
	
	public static boolean possoIrBanco(String dia, int hora) {
		/*boolean DiaHora = (dia == "Segunda" && hora >= 8 && hora <= 18 ||  dia == "Terça" && hora >= 8 && hora <= 18 || dia == "Quarta" && hora >= 8 && hora <= 18 || dia == "Quinta" && hora >= 8 && hora <= 18 || dia == "Sexta" && hora >= 8 && hora <= 18);
		return DiaHora;*/ //Maneira 1
		/*return !(dia.equalsIgnoreCase("Domingo") ||dia.equalsIgnoreCase("Sabado"))
				&& hora >=10 && hora <= 16;    (Segunda forma:É um ponto de negação
		quer dizer que tudo que não for Sabado ou Domingo é verdadeiro. porem foca so que no ta entre parenteses
		depois faz a verificação da hora*/
		
		return ExercicioUm.ehDiaSemana(dia) && hora >=10 && hora <= 16; /* terceira forma: Ele aproveita a classe 
		ExercicioUm e o metodo dessa classe heDiaSemana(dia)*/
	
		//Private visivel apenas na propria classe
	}
	
	public static void main(String[] args) {
		boolean DiaHora1 = possoIrBanco("Terça", 16);
		System.out.println(""+DiaHora1);
	}

}
