/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheatSheet;

/**
 *
 * @author UPatryk
 */
public class ExitOuterLoop {
    public static void main(String[] args) {
        exitOuter1();
    }
    
    public static void exitOuter1(){
        System.out.println("outer inter");
        outerloop:
        for (int i=0; i < 5; i++) {
          for (int j=0; j < 5; j++) {
            if (i * j > 6) {
              System.out.println("Breaking");
              break outerloop;
            }
            System.out.println(i + " " + j);
          }
        }
        System.out.println("Done");
        }
}
