package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EchoEchoEcho {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
                
        String input = reader.readLine();
        
        System.out.println(input + " " + input + " " + input);
    }
}