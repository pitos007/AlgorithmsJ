/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheatSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author UPatryk
 */
public class Constrain {
    public static void main(String[] args) {
        int n = 105;
        List<Integer> intList = Arrays.asList(1,-2,3,4,105,5,6,7,8,9);
        Integer[] intArr = {41,22,80,80,41,41,41,80,22,80,22,41,41,41,80,80,22,22,22,22,41,80,80,41,22,80,80,80,80,41,22,80,22,22,22,80,22,80,80,41,22,41,41,22,22,41,22,22,80,22,22,80,41};
        List<Integer> intList2 = Arrays.asList(intArr);
        
        System.out.println(getMaxOccur(intList2));
        //chk(n);
        //chkLoop(intList);
    }
    
    public static boolean chk(int n){
        boolean chk = false;
        if ((n>=1)&&(n<=100)) {
            System.out.println(n + " within a large");
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

    public static int getMaxOccur(List<Integer> intList){
        int maxCount = 0;
        int currentCount = 1;
        List<Integer> sil = intList;
        Collections.sort(sil);
        for (int i = 0; i < sil.size()-1; i++) {
            if (sil.get(i+1) == sil.get(i)) {
                currentCount++;
                System.out.println(sil.get(i+1) +" == "+ sil.get(i) + " increasing currentCount to " + currentCount);
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                System.out.println("maxCount is " + maxCount);
            }
            else{
                if (currentCount > maxCount) {
                    System.out.println(currentCount + " > " + maxCount);
                    maxCount = currentCount;
                    currentCount = 1;
                    System.out.println(" maxCount increased to " + maxCount + ". Reset currentCount to 1");
                }
                else{
                    System.out.println(currentCount + " <= " + maxCount + " Reset currentCount to 1");
                    currentCount = 1;
                }
            }
        }
        System.out.println(intList.size() + " - " + maxCount);
        return intList.size() - maxCount;
    }
    
    
    public static int getMaxOccur2(List<Integer> intList){
        int maxCount = 1;
        List<Integer> sil = intList;
        
        return maxCount;
    }
}
