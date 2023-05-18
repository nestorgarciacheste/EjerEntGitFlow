/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.Arrays;

public class OrdenaArray {
    public static int[] ordenar(String[] args) throws Maex {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                array[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                throw new Maex("Se introdujo un valor no numérico.");
            }
            
            if (array[i] < 0) {
                throw new Maex("Tiene valores negativos");
            }
        }
        
        Arrays.sort(array);
        
        return array;
    }
}

