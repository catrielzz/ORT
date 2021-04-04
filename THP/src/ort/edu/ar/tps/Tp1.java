package ort.edu.ar.tps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ort.edu.ar.utils.Utils;

public class Tp1 {

    public void ejercicio1() {
        System.out.printf(Utils.numeroEjercicio, 1);
        System.out.println("Bienvenido " + Utils.checkVariableString("su nombre", "un nombre valido"));
        Utils.closeScanner();
    }

    public void ejercicio2() {
        System.out.printf(Utils.numeroEjercicio, 2);
        int materia1;
        int materia2;
        int materia3;
        materia1 = Utils.checkVariableInt("la calificacion del primer trimestre", "un numero valido");
        materia2 = Utils.checkVariableInt("la calificacion del segundo trimestre", "un numero valido");
        materia3 = Utils.checkVariableInt("la calificacion del tercer trimestre", "un numero valido");
        double promedio = (double) (materia1 + materia2 + materia3) / 3;
        System.out.println("El promedio total es: " + promedio);
        Utils.closeScanner();
    }

    public void ejercicio3() {
        int numeroIngresado;
        System.out.printf(Utils.numeroEjercicio, 3);
        numeroIngresado = Utils.checkVariableInt("un numero", "un numero valido");
        System.out.println("El numero * 5 = " + (numeroIngresado * 5) + "\nEl numero / 2 = " + (numeroIngresado / 2));
        Utils.closeScanner();
    }

    public void ejercicio4() {
        int cantidadHoras;
        double valorHoras;
        double salarioTotal;
        System.out.printf(Utils.numeroEjercicio, 4);
        cantidadHoras = Utils.checkVariableInt("la cantidad de horas trabajadas por día", "un numero valido");
        System.out.println("Ingrese el valor de cada hora: ");
        valorHoras = Utils.scanner.nextInt();
        salarioTotal = ((cantidadHoras * valorHoras) * 5) + (cantidadHoras * (valorHoras / 2));
        System.out.println("El salario semanal del empleado es = " + salarioTotal);
        Utils.closeScanner();
    }

    public void ejercicio5() throws InterruptedException {
        System.out.printf(Utils.numeroEjercicio, 5);
        System.out.println("Ingrese el primer numero: ");
        int num1 = Utils.scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = Utils.scanner.nextInt();
        System.out.println("El primer numero vale: " + num1 + "\nEl segundo numero vale: " + num2);
        System.out.println("Invirtiendo los valores...");
        Thread.sleep(2000);
        int pivot = num1;
        num1 = num2;
        num2 = pivot;
        System.out.println("Ahora primer numero vale: " + num1 + "\nAhora segundo numero vale: " + num2);
        Utils.closeScanner();
    }

    public void ejercicio6() {
        System.out.printf(Utils.numeroEjercicio, 6);
        final int sueldoFijo = 44000;
        final double comision = 0.16;
        System.out.println("Ingrese el monto total de ventas realizadas en el mes: ");
        final double ventasTotales = Utils.scanner.nextDouble();
        System.out.println("El sueldo del empleado es: " + (sueldoFijo + (ventasTotales * comision)));
        Utils.closeScanner();
    }

    public void ejercicio7() {
        System.out.printf(Utils.numeroEjercicio, 7);
        System.out.println("Ingrese el ancho del terreno: ");
        double anchoTerreno = Utils.scanner.nextDouble();
        System.out.println("Ingrese el alto del terreno: ");
        double altoTerreno = Utils.scanner.nextDouble();
        double diametroTerreno = anchoTerreno * altoTerreno;
        double perimetroTerreno = (anchoTerreno * 2) + (altoTerreno) * 2;
        System.out.println("Ingrese el precio por metro cuadrado: ");
        double precioMetroCuadrado = Utils.scanner.nextDouble() * diametroTerreno;
        System.out.println("El precio total del terreno es: " + precioMetroCuadrado);
        System.out.printf("Se necesitan %s metros de alambre para cubrir el terreno.", (perimetroTerreno * 3));
        Utils.closeScanner();
    }

    public void ejercicio8() {
        System.out.printf(Utils.numeroEjercicio, 8);
        System.out.println("Ingrese el primer numero: ");
        double num1 = Utils.scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = Utils.scanner.nextDouble();
        System.out.printf("%s + %s = %s\n", num1, num1, (num1 + num2));
        System.out.printf("%s - %s = %s\n", num1, num1, (num1 - num2));
        System.out.printf("%s * %s = %s\n", num1, num1, (num1 * num2));
        System.out.printf("%s / %s = %s\n", num1, num1, (num1 / num2));
        System.out.println("Quiere terminar la ejecucion? (Si/No)");
        Utils.closeScanner();
    }

    public void ejercicio9() {
        // 1 y 3 no se usan, 2, (4 - 10) se usan
        List<Integer> unindexedList = new ArrayList<Integer>();
        int cant;
        int nota;
        int pivot = 0;
        do {
            System.out.println("Cuantas notas quiere ingresar?");
            cant = Utils.scanner.nextInt();
            if (cant > 0) {
                while (cant > pivot) {
                    System.out.println("Ingrese la nota del examen: ");
                    nota = Utils.scanner.nextInt();
                    if ((nota == 1 || nota == 3 || (nota < 1 || nota > 10))) {
                        System.out.println("Ingrese una nota valida");
                    } else {
                        unindexedList.add(nota);
                        System.out.println("La nota ingrsada es: " + nota);
                        pivot++;
                    }
                }
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }
        while (cant > 0);
        System.out.println(unindexedList);
        Utils.getNumberAndPosition(unindexedList);
    }
}
