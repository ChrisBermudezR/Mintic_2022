package ciclowhile;
import java.util.Scanner;
public class CicloWhile {
    public static void main(String[] args) {
         Scanner cap =new Scanner(System.in);
        /*int x=1;
        while(x <=10){
        System.out.print(x+"\n");
        x=x+1;
        */
       /*
         int num=1, numero, sum=0;
       while(sum<100){
           System.out.println("Digite un número");
           numero=cap.nextInt();
           sum=sum+numero;
           num=num+1;
           System.out.println("La sumatoria es: "+sum);
        */
       /*
         int numero = 1, sum=0;
       while(numero != 0){
           System.out.println("Digite un número");
           numero=cap.nextInt();
           sum=sum+numero;
           System.out.println("La sumatoria es: "+sum);
         */
       int intentos=0;
        String password = "Pedro123**", usuario ="Pepeloco",password1 ="",usuario1="";
       while(intentos<3){
           System.out.println("Digite su Usuario");
           usuario1=cap.nextLine();
           System.out.println("Digite su clave");
           password1=cap.nextLine();
           if(password1.equals(password) && usuario1.equals(usuario1)){
                System.out.println("Bienvenido");
                break;
           } else{
               System.out.println("Digite de nuevo sus datos");
               intentos += 1;
               if(intentos==3){
                    System.out.println("Su cuenta ha sido destruida");    
                }
               }
            
              
          
        }
               
    }
    
}
