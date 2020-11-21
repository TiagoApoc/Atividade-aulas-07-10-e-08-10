import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int a = 1, b = 0, i, n;

    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite a quantidade de termos");
   
   n = teclado.nextInt(); 
   for (i = 0; i <= n; i++){
     a = a + b;
            b = a - b;
            System.out.println(a);
    }
   
  }
}