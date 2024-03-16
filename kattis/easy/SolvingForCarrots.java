package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolvingForCarrots {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);

        System.out.println(second);
    }
}