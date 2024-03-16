package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ladder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int height = Integer.parseInt(input[0]);
        double degree = Double.parseDouble(input[1]);

        double radian = Math.toRadians(degree);
        double sen = Math.sin(radian);

        double ladder = (height / sen);
        System.out.println((int) Math.ceil(ladder));
    }
}