package programafunción1;

import java.util.Scanner;
import java.util.*;

public class ProgramaFunción1 {

       public static void main(String[] args) {
       
       Scanner Teclado= new Scanner (System.in);
                 
       System.out.println("Número de datos que desea ingresar: ");
       int n = Teclado.nextInt();
       
       double[] X= new double[n];
       double suma=0;    
       
       for (int i = 0; i<n;i++){
       
           System.out.println("Número "+(i+1));
           X[i]= Teclado.nextFloat();
           suma=X[i]+suma;
                    
       }
         
       double Xp=suma/n;
       double Sumatoria=0;
       
       
       for (int i = 0; i<n;i++){
       
           System.out.print("  " +X[i]);  
           Sumatoria= Math.pow((X[i]-Xp),2)+Sumatoria;            
                    
       }
       
       System.out.println(" ");
       double Desviacion=0;
       System.out.println(Sumatoria);
       Desviacion= Math.sqrt(((double)1/(double)(n-1))*Sumatoria);
       System.out.println("La desviación estandar es: " +Desviacion);
       
    }  
    
}
