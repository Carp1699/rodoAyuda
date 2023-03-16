package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] planets  = {"Mercury", "Venus" , "Tierra","Jupiter","Saturno"," Uranus","Sun", "Neptuno"};
        System.out.println(Arrays.toString(planets));
       System.out.println("Sorted in dictionary order:");
       Arrays.sort(planets);
       System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length :");
        Arrays.sort(planets,(first, second) ->first.length()-second.length());
        System.out.println(Arrays.toString(planets));



    }

}