package com.fzf.sfp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 13. 罗马数字转整数
 *
 * @author fanZhiFei
 * @create 2022/7/10
 */
public class test0003 {
    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        test0003 method=new test0003();
        Scanner in=new Scanner(System.in);
        String next = null;
        while (in.hasNext()){
            next = in.next();
            if (next.equals("eq")){
                break;
            }
            int i = method.romanToInt(next);
            System.out.println(i);
        }

    }
}
