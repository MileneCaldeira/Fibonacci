import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
 
 	System.out.println("Digite um número inteiro para verificar se pertence à sequência de Fibonacci: ");
 	int N = sc.nextInt();
 	
    Fibonacci fibonacci = new Fibonacci();
    if (fibonacci.verificar(N)) {
        System.out.println(N + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println(N + " não pertence à sequência de Fibonacci.");
     
     sc.close();
 }

}
}