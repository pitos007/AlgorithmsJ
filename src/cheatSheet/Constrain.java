/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheatSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author UPatryk
 */
public class Constrain {
    public static void main(String[] args) {
        int n = 105;
        List<Integer> intList = Arrays.asList(1,-2,3,4,105,5,6,7,8,9);
        
        chk(n);
        chkLoop(intList);
    }
    
    public static boolean chk(int n){
        boolean chk = false;
        if ((n>=1)&&(n<=100)) {
            System.out.println(n + " within a range");
            chk = true;
        }
        else{
            System.out.println(n + " too large or too small");
        }
        return chk;
    }
    
    public static boolean chkLoop(List<Integer> intList){
        boolean chk = true;
        for (Integer i : intList) {
            if (!(i>=1)||!(i<=100)) {
                System.out.println(i + " is too large or too small");
                chk = false;
                break;
            }
            else{
                System.out.println(i + " within a range");
            }
        }
        return chk;
    }
}
