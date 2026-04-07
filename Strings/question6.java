package Strings;
/*You are given a string s and an integer k.

Reverse the first k characters of s and return the resulting string.

  */
class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = 0;
        int j = Math.min(k - 1, n - 1);

        while (i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}