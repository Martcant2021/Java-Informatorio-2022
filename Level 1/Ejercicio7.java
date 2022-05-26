import java.util.Scanner;

// Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a 
// mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().


// ASCII a=97 y A=65 => 97-65=32
//Para pasar de nimus a mayus se tiene que restar 32 
public class Ejercicio7 {
    

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char strToArr[] = str.toCharArray();

        for(int i=0; i<strToArr.length; i++){
            if(strToArr[i]>='a' && strToArr[i]<='z'){
                strToArr[i] = (char) ((int) strToArr[i]-32);
            }
        }
        for(int i=0; i<strToArr.length; i++){
            System.out.print(strToArr[i]);
        }


        scan.close();
    }
}
