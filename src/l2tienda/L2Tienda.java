/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2tienda;

import java.util.Scanner;

/**
 *
 * @author Pablo López
 */
public class L2Tienda {

    public static void main(String[] args) {
        
        String Usuario,Password;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------Login----------");
        System.out.println("Ingrese usuario: ");
        Usuario = input.next();
        System.out.println("Ingrese contraseña:");
        Password = input.next();
        System.out.println("--Bienvenido al sistema--");
    }
    
}
