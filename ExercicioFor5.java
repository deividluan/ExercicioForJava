package ExercicioTeste;

public class ExercicioFor5 {
	public static void main (String[]args) {
		int cont = 0;
		
		for (cont = 0; cont <= 20; cont++) {
			if (cont % 2 == 1) {
				System.out.print(cont + ", ");
			}
		}
	}
}
