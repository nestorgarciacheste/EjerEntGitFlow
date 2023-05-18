/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author DeniseGT
 */
public class ParImpar {

    public static String Par(int[] array) {
        String cad = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                cad += array[i] + ",";
                
            }
        }
        return cad;
    }

    public static String Impar(int[] array) {
        String cad = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                cad += array[i] + ",";
                
            }
        }
        return cad;
    }


    public static int mostrarNumeroMasAlto(int[] numeros) {
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    public static int mostrarNumeroMasBajo(int[] numeros) {
        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    public static String muestraArray(int[] array) {
        String cad = "";
        for (int i = 0; i < array.length; i++) {
            cad += array[i];
        }
        return cad;
    }

}
