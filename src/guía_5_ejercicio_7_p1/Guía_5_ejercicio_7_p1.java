package guía_5_ejercicio_7_p1;

import static guía_5_ejercicio_7_p1.ContieneSubmatriz.contieneSubmatriz;
import java.util.Scanner;

public class Guía_5_ejercicio_7_p1 {
   
    public static void main(String[] args) {   //Este ejercicio obviamente no lo hice yo!!

        System.out.println("Este será el primer commit del práctico 1");
        System.out.println("Agregando el segundo commit cómo comentario");
        
        //Creo las Matrices
int[][] M = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 36, 5, 67, 48, 49, 50},
            {51, 52, 53, 54, 89, 90, 75, 58, 59, 60},
            {61, 62, 63, 64, 14, 22, 26, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        int[][] P = {
            {36, 5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };

        //Hago un if, y lo que tiene dentro debe devolverme un boolean, en base a si devuelve V o F va arriba o abajo
        if (contieneSubmatriz(M, P)) {
            System.out.println("La matriz P está contenida en la matriz M.");
        } else {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }
    }
            }
        


