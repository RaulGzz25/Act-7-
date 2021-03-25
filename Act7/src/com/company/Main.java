package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            System.out.printf("Cantidad de números deseados: ");
            int num = name.nextInt();
            NumerosPrimos(num);
            Fibonacci(num);
        }

        //Método para sacar los números primos
        public static int[] NumerosPrimos (int num ){
            int[] NumerosPrimos = new int[num];
            int x = 2, j = 2;
            boolean primo = true;

            for(int i = 0; i < num; i++){
                primo = true;
                j = 2;
                while ((primo) && (j != x)){
                    if (x % j == 0){
                        primo = false;
                    }
                    j++;
                }
                if (primo){
                    NumerosPrimos[i] = x;
                }else{
                    i--;
                }
                x++;
            }

            System.out.println("Números Primos:");
            for (int i = 0; i < num; i++){
                System.out.printf(NumerosPrimos[i]+",");
            }
            System.out.println();
            return NumerosPrimos;
        }

        //Método de la sucesión de Fibonacci
        public static int[] Fibonacci (int num ){
            int[] fibonacci = new int[num];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i < num; i++){
                fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]);
            }
            System.out.println("Sucesión de Fibonacci:");
            for (int i = 0; i < num; i++){
                System.out.printf(fibonacci[i]+",");
            }
            return fibonacci;
        }
    }