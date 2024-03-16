package kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metronome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        double valor = Double.parseDouble(reader.readLine());
        valor = valor/4;
        System.out.println(valor);
    }
}