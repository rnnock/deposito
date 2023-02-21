package cuentas;

/**
 * Este programa se ha realizado para la práctica de la unidad y simula
 * a un gestor de cuentas bancarias, donde se realizan ingresos y retiradas
 * y se pueden realizar consultas de saldos.
 * @author Richard Navarro <richardnavarro@paucasesnovescifp.cat>
 * @version 2.0 Esta versión incorpora comentarios de Javadoc
 * @since 1.5
 */

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(1000);
    }
/**
 * Método estático que recibe por parámetro un float con una cantidad y que realiza
 * varias operaciones sobre la clase CCuenta.
 * @param cantidad Este parámetro de tipo float no tiene funcionalidad, únicamente
 * se ha creado a modo de ejemplo para practicar en la tarea.
 */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
