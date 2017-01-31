/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author patry
 */
public class EqualizeArray {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        if (checkInput(n)) {
            for (int i = 0; i < n; i++) {
                intList.add(in.nextInt());
            }
        }
        if (checkList(intList)) {
            System.out.println(getMaxOccur(intList));
        }
        
        //List<Integer> intList = Arrays.asList(3,3,2,7,2,1,6,7,8,3);
        
    }
    
    public static int getMaxOccur(List<Integer> intList){
        int maxCount = 0;
        int currentCount = 1;
        List<Integer> sil = intList;
        Collections.sort(sil);
        for (int i = 0; i < sil.size()-1; i++) {
            if (sil.get(i+1) == sil.get(i)) {
                currentCount++;
                System.out.println(sil.get(i+1) +" == "+ sil.get(i) + " increasing to " + currentCount);
            }
            else{
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    currentCount = 1;
                }
                else{
                    currentCount = 1;
                }
            }
        }
        return maxCount;
    }
    
    public static List<Integer> getList(int inputNum){
        List<Integer> intL = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            
        }
        
        return intL;
    }
    
    public static boolean checkInput(int n){
        boolean chk = true;
        if (!(n>=1)&&!(n<=100)) {
            chk = false;
        }
        return chk;
    }
    
    public static boolean checkList(List<Integer> intList){
        boolean chk = true;
            for (Integer i : intList) {
                if (!(i>=1)&&!(i<=100)) {
                    chk = false;
                    break;
                }
            }
        return chk;
    }
}
