/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Method3 {
   public static int bil (int bil1, int bil2, int bil3, int bilmaks){
       if (bil1 > bil2 && bil2 > bil3){
           bilmaks = bil1; }
       else if (bil2 >  bil1 && bil1 > bil3) {
           bilmaks = bil2; }
       else {
           bilmaks = bil3; }
       return bilmaks;
       }
   
       
     
   
   public static void main(String[] args){
       Scanner bil = new Scanner(System.in);
         System.out.print("Masukan bilI: ");
         int bil1=bil.nextInt();
         System.out.print("Masukan bilII: ");
         int bil2=bil.nextInt();
         System.out.print("Masukkan bilIII:");
         int bil3=bil.nextInt();
         System.out.print("Bilangan terbesar adalah:");
         int bilmaks = 0;
         
      int compare;
      compare = bil(bil1, bil2, bil3, bilmaks);
      System.out.println("Nilai terbesar adalah" + compare);
       
       
   } 
}
