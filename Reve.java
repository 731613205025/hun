/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reve;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reve {

    
    public static void main(String[] args) {
        {
              Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string to reverse=");
        String s1=sc.nextLine();
         String s2 = new StringBuffer(s1).reverse().toString();
         System.out.println("Reverse is="+s2);
    }
}
        }

