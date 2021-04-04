package ort.edu.ar.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static Scanner scanner = new Scanner(System.in);
    public static String respuesta;
    public static boolean checkVariable = true;

    public static void returnExerciseNumber(int numeroEjercicio){
        System.out.printf("------Ejercicio numero %s------\n", numeroEjercicio);
    }

    public static void closeScanner() {
        System.out.println("Quiere terminar la ejecucion? (Si/No)");
        respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            scanner.close();
            System.exit(1);
        }
    }

    public static String checkVariableString(String nombreVariable, String valorValido) {
        String valorARetornar = null;
        while (checkVariable) {
            System.out.printf("Ingrese %s: \n", nombreVariable);
            valorARetornar = scanner.nextLine();
            try {
                Integer.parseInt(valorARetornar);
                System.out.printf("Ingrese %s \n", valorValido);
            } catch (NumberFormatException e) {
                checkVariable = false;
            }
        }
        return valorARetornar;
    }

    public static int checkVariableInt(String nombreVariable, String valorValido) {
        String valorARetornar = null;
        int pivot = 0;
        while (checkVariable) {
            System.out.printf("Ingrese %s: \n", nombreVariable);
            valorARetornar = scanner.nextLine();
            try {
                pivot =  Integer.parseInt(valorARetornar);
                checkVariable = false;
            } catch (NumberFormatException e) {
                System.out.printf("Ingrese %s \n", valorValido);
            }
        }
        checkVariable = true;
        return pivot;
    }

    public static double checkVariableDouble(String nombreVariable, String valorValido) {
        String valorARetornar = null;
        int pivot = 0;
        while (checkVariable) {
            System.out.printf("Ingrese %s: \n", nombreVariable);
            valorARetornar = scanner.nextLine();
            try {
                pivot =  Integer.parseInt(valorARetornar);
                checkVariable = false;
            } catch (NumberFormatException e) {
                System.out.printf("Ingrese %s \n", valorValido);
            }
        }
        checkVariable = true;
        return pivot;
    }
    
    public static void getNumberAndPosition(List<Integer> lista){
        int pivot = 0;
        int position = 0;
        for (int number:lista) {
            if (number > pivot){
                pivot = number;
                position = lista.indexOf(number) + 1;
            }
        }
        System.out.printf("Posicion: %s \nNota: %s", position, pivot);
    }
    
}
