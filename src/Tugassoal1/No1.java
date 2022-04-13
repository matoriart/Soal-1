/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugassoal1;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author user
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X,Y,max;
        System.out.print("Masukkan X : ");
        X = in.nextInt();
        System.out.print("Masukkan Y : ");
        Y = in.nextInt();
         max = Math.max(X,Y);
        if(Y>max){
            max = Y;
        }
        System.out.println("input :"+X+","+Y);
        System.out.println("output :"+max);
    }
    
}
