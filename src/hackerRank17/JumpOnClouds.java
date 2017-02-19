/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank17;

/**
 *
 * @author patry
 */
public class JumpOnClouds {
    public static void main(String[] args) {
        int[] cl = {0,0,1,0,0,1,0};
        
        joc(cl);
    }
    
    public static void joc(int[] cl){
        int pos = 0;
        int count = 0;
        for (pos = 0; pos < cl.length; pos++) {
            if (cl[pos+2] == 1) {
                pos++;
                count++;
                System.out.println("positio+1: " + pos + " ; counter: " + count);
            }
            else{
                pos += 2;
                count++;
                System.out.println("position+2: " + pos + " ; counter: " + count);
            }
        }
        System.out.println(count);
    }
}
