package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);

        for(int i = 1; i <= third; i++){
            if(i % first == 0 & i % second == 0){
                System.out.println("FizzBuzz");
            } else if (i % first == 0 & i % second != 0) {
                System.out.println("Fizz");
            } else if((i % first != 0) & (i % second == 0)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}