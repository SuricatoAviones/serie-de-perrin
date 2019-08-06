/*
    Serie de Perrin
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Ejercicio10 {
    
    int n;
    public void funcion(){
        Scanner dato=new Scanner(System.in);
        do{
            System.out.println("Cantidad de numeros");
            n=dato.nextInt();
            
        }
        while(n<3);
        int[] perrin=new int[n];
        perrin[0]=3;
        perrin[1]=0;
        perrin[2]=2;
        System.out.println(perrin[0]+","+perrin[1]+","+perrin[2]);
        
        for(int i=3;i<=n;i++){
            perrin[i]=perrin[i-2]+perrin[i-3];
            System.out.println(","+perrin[i]);
        }

    }

    public static void main(String[] args) {
        Ejercicio10 objeto= new Ejercicio10();
        objeto.funcion();
    }
    
}
