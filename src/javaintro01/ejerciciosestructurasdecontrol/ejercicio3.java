/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package javaintro01.ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra que tenga una longitud de 8");
        String palabra = leer.nextLine();
        if (palabra.length()==8 ){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
        
    }
}
