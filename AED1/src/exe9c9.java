import java.util.Scanner;

public class exe9c9 {

	public static void main(String[] args) {
	double num, den, serie=0;
	   int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
	   for (int aux=1; aux<=termos; aux++) {
	     num = Math.pow(3, aux+1);
	     den = (9+aux)*Math.sqrt(Math.pow(aux, 4));
	     serie += num / den;
	   }
	   serie = 100-Math.pow(serie,3);
	   System.out.print("Valor da S�rie = "+serie);
	   teclado.close();
	}

}
