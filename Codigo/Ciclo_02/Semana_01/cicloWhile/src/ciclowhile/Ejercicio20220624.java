package ciclowhile;

import java.util.Scanner;

public class Ejercicio20220624 {
    public static void main(String[] args) {
       Scanner cap =new Scanner(System.in);
        int num=1, numero, sum=0;
       while(num<5){
           System.out.println("Digite un número");
           numero=cap.nextInt();
           sum=sum+numero;
           num=num+1;
           System.out.println("La sumatoria es: "+sum);
       }
       
               
    }
        
}
