package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadrantSelection {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String[] input = new String[2];
        int i = 0;
        while(i < 2){
            input[i] = reader.readLine();
            i++;
        }

        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);

        if(first > 0 & second > 0) {
            System.out.println(1);
        } else if(first < 0 & second > 0) {
            System.out.println(2);
        } else if(first < 0 & second < 0) {
            System.out.println(3);
        } else if(first > 0 & second < 0){
            System.out.println(4);
        }
    }
}