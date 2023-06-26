package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primera practica curso reactividad.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escoja la opcion que desee ejecutar:\n" +
                "1: numero mayor de una lista\n" +
                "2: calcular descuenta de venta\n" +
                "3: calcular iva de venta");

        int opcion = scanner.nextInt();

        switch(opcion){
            case 1:
                System.out.print("seleccione el tamanio de la lista: ");
                int tamanioLista = scanner.nextInt();
                List<Integer> lista = new ArrayList<>();
                for (int i = 0; i < tamanioLista; i++){
                    System.out.print("Ingrese el valor numero " + (i + 1) + " para agregarlo a la lista: ");
                    int valor = scanner.nextInt();
                        lista.add(valor);
                }
                System.out.println("El numero mayor de la lista es: " + Collections.max(lista) + "\n" +
                        "El numero menor de la lista es: " + Collections.min(lista));
                break;
            case 2:
                System.out.print("Ingrese el valor de la venta total: ");
                int valorTotal = scanner.nextInt();
                System.out.print("Ingrese el porcentaje de descuento a aplicar, ejemplo: 10,5: ");
                double porcentajeDescuento = scanner.nextDouble();
                double descuento = (valorTotal * porcentajeDescuento) / 100;
                double total = valorTotal - descuento;
                System.out.println("Total a pagar es de: " + total + " con un descuento de: " + descuento);
                break;
            case 3:
                double porcentaje;
                System.out.print("Ingrese el valor de la venta total: ");
                double totalVenta = scanner.nextDouble();
                System.out.print("Desea ingresar el porcentaje de IVA s/n: ");
                String ingresoPorcentaje = scanner.next();
                if (ingresoPorcentaje.equals("s")){
                    System.out.print("Ingrese el valor del porcentaje de iva: ");
                    porcentaje = scanner.nextDouble();
                } else {
                    porcentaje = 21.0;
                }
                double totalIva = (totalVenta * porcentaje) / 100;
                double totalPagar = totalVenta + totalIva;
                System.out.println("total a pagar es de: " + totalPagar + " con un iva de: " + totalIva);
                break;
            default:
                System.err.println("ingreso la opcion incorrecta por favor vuelva a intentarlo");
                main(args);
                System.exit(0);
        }
    }

    /**
     * Haciendo uso de lo aprendido(Expresiones lambda, referencias a métodos y funciones puras) resuelva:
     * */

    /**
     * 1. Con la intención de encontrar el número mayor en una lista y a su vez el número menor, cree un método que le permita
     * estas dos funciones, siguiendo los principios de las funciones puras.
     * */

    /**
     * 2. En una tienda de ropa necesitamos aplicar un descuento a las ventas que se hacen, este descuento
     * es variable por lo que necesitamos que usted cree un método que reciba el total de la venta y el porcentaje a descontar
     * y devuelva el nuevo precio total.
     * */

    /**
     * 3. Necesitamos calcular el iva de una venta, para esto es necesario que usted cree un método
     * Tendremos dos escenarios posibles, en el primero se le pasará únicamente el valor al cual se le debe
     * aplicar el iva, sin especificar el porcentaje, en este caso se debe aplicar un 21% siempre.
     * En el segundo escenario se le pasará tanto el precio de la venta como el porcentaje de iva.
     * Cree una sola función que pueda lograr estos dos propósitos
     * */

}