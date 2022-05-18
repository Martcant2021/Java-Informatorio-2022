import java.util.Scanner;

// Realizar un programa que calcule el factorial de un número:
// n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
// Sin hacer uso de librerías.

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.print("Digite un numero: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        int result=1 ;
        for(int j=i; j>0; j--) {
            result = result*j;
        }
        System.out.println("El factorial de "+ i +" es: "+ result);

        }
    }

