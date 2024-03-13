/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pares;
import java.util.Scanner;

/**
 *
 * @author PC12
 */
public class operando {
 public int si ()
 {
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese un numero ");
     int num =sc.nextInt();
     if (num%2==0){
         System.out.println("ES PAR");
     }else {
         System.out.println("ES IMPAR");
     }
     return num;
}
}
