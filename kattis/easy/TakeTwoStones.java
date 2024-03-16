package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeTwoStones {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
                
        int valor = Integer.parseInt(reader.readLine());
        
        if(valor % 2 == 0){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}