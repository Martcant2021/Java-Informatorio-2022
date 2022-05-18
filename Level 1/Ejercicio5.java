import java.util.Scanner;

// Se desea una aplicación que solicite 2 números enteros 
// y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite el primer valor: ");
        int m = scan.nextInt();

        System.out.print("Digite el segundo valor: ");
        int n = scan.nextInt();
        int suma=0;
        for(int i=1; i<=n; i++) {
            suma+=m;
        }
        
        System.out.printf("%d X %d = %d",m,n,suma);


        scan.close();


    }

}
