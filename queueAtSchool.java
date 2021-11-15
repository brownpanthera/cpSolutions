package com.company;

import java.util.Scanner;

public class queueAtSchool {
    public static void main(String[] args) {
        int n, t;
        String s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        s = sc.next();
        char c[] = s.toCharArray();

        for (int i = t; i > 0; i--) {
            for (int j = 1; j < n; j++) {
                if (c[j] == 'G' & c[j - 1] == 'B') {
                    c[j] = 'B';
                    c[j - 1] = 'G';
                    j++;
                }
            }
        }
        System.out.println(c);
    }
}
