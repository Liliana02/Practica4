package practica4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Practica4[] numero;
        int tam = 10;
        double suma = 0;
        double aux = 0;
        double prom;
        
       
        numero = new Practica4[tam];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = new Practica4();
        }
        try{
            System.out.println("----------Entrada estándar----------");
            for (int i = 0; i < numero.length; i++) {
                
                    System.out.print("Ingresa el numero " + (i+1) + ": ");
                    numero[i].setNumero(sc.nextDouble());  
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        
        try{
            System.out.println("----------Salida estándar----------");
            System.out.println("El arreglo original es: ");
            for (int i = 0; i < numero.length; i++) {
                System.out.println((i+1) + "---> " + numero[i].getNumero());
                aux = numero[i].getNumero();
                suma += aux;
                
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        prom = suma/tam;
        System.out.println("El promedio es de: " + prom);
    }
}
