
package pila;

import java.util.Scanner;

public class Pila {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables de la pila 
        int tope = 0, opt, tam;
        
        
        int pila [] = new int[tam=27];

        //menu
        do {
            System.out.println("\n 1- Llenar\n"
                    + "2- Mostrar\n"
                    + "3- Eliminar\n"
                    + "4- Agregar\n"
                    + "5- Salir\n");
            switch (opt = sc.nextInt()) {

                case 1:
                 if(tope<=tam)
                      for(int j='a'; j<='z'; j++){
                         pila[tope] = j; 
                    
                         tope ++;
                     
                    
                 }
                 
                 else {
                     System.out.println("Pila llena");
                 }
                break;
                case 2:
                    if (tope > 0) {
                        // Mostrar los elementos
                        System.out.println("Los elementos son:");
                        // Iniciamos con tope-1, porque el vector inicia en posición 0
                        for (int j = tope - 1; j >= 0; j--) {
                            System.out.println( pila[j]);
                        }
                    } else {
                        System.out.println("La Pila esta vacía...");
                    }
                    break;

                case 3:
                    if (tope != 0) {
                        // Tope nos indica la posición en la que vamos a guardar un valor
                        // Por eso le restamos una unidad para sobreescribir un elemento
                        System.out.println("Eliminando el último valor de la pila...");
                        tope--;
                    } else {
                        System.out.println("No hay elementos para eliminar.");
                    }
                    break;
            
                case 4:
                    if (tope < tam) {
                        // Pedir dato
                        System.out.println("Ingrese el dato: ");
                        // Dato se guarda en la posición de la variable tope
                        pila[tope] = sc.nextInt();
                        // Aumentamos una unidad a tope para guardar el siguiente valor en la siguiente posición
                        tope++;
                    } else {
                        System.out.println("No hay mas espacio en la pila");
                    }
                    break;

            }

        } while (opt != 5);
    }

}

 