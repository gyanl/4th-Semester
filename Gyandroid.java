/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gyandroid;

/**
 *
 * @author User
 */
import java.util.*;

public class Gyandroid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,i=0;
        System.out.println("Press 1 for below 7\nPress 2 for 7\nPress 3 for above 7");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        
        Dice d1 = new Dice();
        b=d1.rollDice();
        System.out.println("First dice : " + b);
        c=d1.rollDice();
        System.out.println("Second dice : " + c);
        System.out.println("Total : " + (b+c));

        // TODO code application logic here
        if(a==1){
            if((b+c)<7) 
            {System.out.println("You win!");}
            else 
            {System.out.println("You lose :(");} 
           }
                if(a==2){
            if((b+c)==7) 
            {System.out.println("You win!");}
            else 
            {System.out.println("You lose :(");} 
           }
                        if(a==3){
            if((b+c)>7) 
            {System.out.println("You win!");}
            else 
            {System.out.println("You lose :(");} 
           }
    }
}
