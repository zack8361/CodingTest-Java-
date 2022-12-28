package Programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringOwn {
    public static void main(String[] args) {
        String[] strings ={"sun","bed","car"};
        int n = 1;
        System.out.println(soultion(strings,n));
    }

    private static String[] soultion(String[] strings, int n) {


        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)>o2.charAt(n)){
                    return 1;
                }
                else if(o1.charAt(n)<o2.charAt(n)){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        return strings;
    }
}
