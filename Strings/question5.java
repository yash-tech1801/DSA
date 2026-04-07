package Strings;
/*Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original. */

class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        // phle string ko char array me convert kr diya and and we store the length of the array in n

        for (int start = 0; start < n; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1);
        // isme hum start se k-1 tak ke characters ko reverse krna chahte hai but agar k-1 se zyada characters hai to hum n-1 tak ke characters ko reverse krna chahte hai isliye hum min function ka use krte hai. 

            // reverse from i to j
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}