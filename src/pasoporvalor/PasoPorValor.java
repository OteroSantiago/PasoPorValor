/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author Santiago
 */
public class PasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //el paso por valor se aplica a los tipos primitivos
        /*el paso de argumentos por valor lo que hace es crear un copia de su valor a otros métodos, 
        y si en esos nuevos métodos se modifica el valor no lo hará en metodo de origen, ya que se les pasa una copia*/
        var a = 9;
        System.out.println("a = "+a);
        cambioValor(a);
        
    }
    public static void cambioValor(int arg1){
        System.out.println("arg1 = "+arg1);
        arg1 = 15;
        System.out.println("arg1 = "+arg1);
    }
}
