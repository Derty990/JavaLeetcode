package org.example.strings;

public class LC5 {
    int start = 0;
    int maxLength = 0;
    public String longestPalindrome(String s) {

        if(s==null || s.isEmpty()){
            return"";
        }

        for (int i = 0; i < s.length(); i++) {
            expandCenter(s, i, i);
            expandCenter(s,i,i+1);
        }
        return s.substring(start, start+maxLength);
    }

    private void expandCenter(String s, int left, int right) {
        while(left>=0 && right<s.length()&&s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        int currentLength = right-left-1;

        if(currentLength>maxLength){
            maxLength = currentLength;
            start = left+1;
        }

    }
}
