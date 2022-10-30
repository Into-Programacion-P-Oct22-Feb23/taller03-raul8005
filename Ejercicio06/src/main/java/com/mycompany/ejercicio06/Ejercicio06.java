/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio06;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6= 1;
        
        // System.out.println(Math.sqrt(var1) + var2 / var3) == var4 || (var5 > var6);
        
        boolean valor = ((Math.sqrt(var1) + var2) / var3) == var4 || (var5 > var6);
        
        System.out.println(valor);
    }
}
