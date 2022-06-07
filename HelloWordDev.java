/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworddev;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author D'zign
 */
public class HelloWordDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        
        String nome=ler.next();
       Runtime.getRuntime().exec("clear");
        System.out.println("Hello, "+nome+" \nWelcome to Java World!");
    
    }
    
}
