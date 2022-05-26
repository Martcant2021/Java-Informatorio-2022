import java.util.Scanner;

// Se desea una aplicación que solicite 2 números enteros y 
// realice la operación de potencia (sin uso de librerías).

public class Ejercicio6 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt(); //las veces que se multiplica m*m
        int result = 1;
        // ciclo for;
        for(int i=n ; i!=0; i--){
            result = result*m;
        }

        System.out.printf("%d elevado a %d es %d" ,m,n,result);
        scan.close();

    }
}
