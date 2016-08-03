/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gyandroid;
import java.util.*;

/**
 *
 * @author User
 */
public class Dice {
    
    public int rollDice() {
  // body
    int a;
    Random r1;
    r1 = new Random();
    a = r1.nextInt(5);
    return a+1;
    }
}
