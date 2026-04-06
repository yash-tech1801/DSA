package Strings;

/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

*/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        
        return (Arrays.equals(st,tt));
    }
}