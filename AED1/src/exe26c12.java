import java.util.Scanner;

public class exe26c12 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String frase;
	System.out.print("Informe uma frase: ");
	frase = teclado.nextLine();
    String palavras[] = frase.split(" ");
    for (int aux=0; aux<palavras.length; aux++) {
       System.out.println(palavras[aux]);
    }
    teclado.close();
	}

}
