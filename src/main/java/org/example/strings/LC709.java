package org.example.strings;

public class LC709 {

    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int num = chars[i];
            if(num > 64 && num < 91){
                chars[i] = (char) (num+32);
            }
            sb.append(chars[i]);

        }

        return sb.toString();
    }

}
