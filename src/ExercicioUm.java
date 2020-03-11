
public class ExercicioUm {
	
	public static boolean ehDiaSemana(String dia) {
		boolean edia = (dia == "Segunda" || dia == "Terça" || dia == "Quarta" || dia == "Quinta" || dia == "Sexta"
			||	dia == "Sabado" || dia == "Domingo");
		return edia;
	}
	
	public static void main(String[] args) {
		ehDiaSemana("Segunda");
		boolean dia = ehDiaSemana("Segunda");
		System.out.println(""+ dia );
		boolean dia2 = ehDiaSemana("ano novo");
		System.out.println(""+dia2);
	}


}


