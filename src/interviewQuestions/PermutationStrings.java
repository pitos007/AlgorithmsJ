/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewQuestions;

/**
 *
 * Check if two strings have identical character counts (permutation)
 */
public class PermutationStrings {
    public static void main(String[] args) {
        System.out.println(permutation("Piwo", "iPow"));
        System.out.println(permutation("Kufel", "kufel"));
    }
    
    
    public static String sort(String s) {
        char[] content= s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
