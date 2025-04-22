package org.example.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC28 {
    public static void main(String[] args) {
        System.out.println((strStr("abc", "c")));
    }
    public static int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
}
