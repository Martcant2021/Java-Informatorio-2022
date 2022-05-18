import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("dime tu usuario: ");
        String USUARIO = scan.nextLine();

        System.out.println("HOLA "+ USUARIO +"!!!");
        scan.close();
    }

}