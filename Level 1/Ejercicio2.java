import java.util.Scanner;

// Realizar un programa que solicite por consola 2 números enteros. 
// Para luego imprimir el resultado de la suma, resta, multiplicación, división y 
// módulo (resto de la división) de ambos números.

public class Ejercicio2 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero 1:");
        int i = scan.nextInt();
        System.out.println("Numero 2:");
        int j = scan.nextInt();
        System.out.println(i+ " + " +j +" = "+ (i + j));
        System.out.println(i+ " - " +j +" = "+ (i - j));
        System.out.println(i+ " * " +j +" = "+ (i * j));
        System.out.println(i+ " / " +j +" = "+ (i / j));
        System.out.println(i+ " % " +j +" = "+ (i % j));

        scan.close();
    }
}