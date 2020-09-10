//Alejandro Huerta González
//Grupo 3S11

import javax.swing.JOptionPane;

public class Modularidad {

    public static void main(String[] args) {
        //solicitamos con un cuadro de dialogo en pantalla los numeros
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el Primer Numero: "));
       int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el Segundo Numero: "));
 
 Operacion op = new Operacion();

       // Imprime los Resultados 
 System.out.println("La Suma es igual a: "+op.sumar(n1,n2));
 System.out.println("La Resta es igual a: "+op.restar(n1,n2));
 System.out.println("La Multiplicacion es igual a: "+op.multiplicar(n1,n2));
 System.out.println("La Division es igual a: "+op.dividir(n1,n2));
    
   
    
    }
    
}
