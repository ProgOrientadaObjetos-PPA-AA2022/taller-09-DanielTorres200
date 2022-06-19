/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String pA = "";
        String pE = "";
        String preg = "";
        int op;
        do {
            System.out.println("Servicios de Prestamos");
            System.out.println("Que prestamo desea solicitar:\n"
                    + "1. Prestamos para Automoviles\n"
                    + "2. Prestamos para centros Educativo\n"
                    + "3. Salir");

            op = sc.nextInt();
            sc.nextLine();

            if (op == 1 || op == 2) {
                System.out.println("\nIngrese el nombre: ");
                String beneficiario = sc.nextLine();
                System.out.println("Ingrese el apellido: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese el userName: ");
                String username = sc.nextLine();
                System.out.println("Ingrese el numero de meses a pagar el préstamo: ");
                int meses = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese la ciudad: ");
                String ciudad = sc.nextLine();

                Persona persona = new Persona(beneficiario, apellido, username);
                persona.establecerNombre(beneficiario);
                persona.establecerApellido(apellido);
                persona.establecerUsername(username);

                switch (op) {

                    //caso 1 para ingresar e imprimir todo lo referente a prestamos automovilisticos
                    case 1:

                        do {
                            System.out.println("Ingrese el tipo de automovil: ");
                            String tipo = sc.nextLine();
                            System.out.println("Ingrese la marca del automovil: ");
                            String marca = sc.nextLine();
                            System.out.println("Ingrese el nombre del garante: ");
                            String nombreG = sc.nextLine();
                            System.out.println("Ingrese el apellido del garante: ");
                            String apellidoG = sc.nextLine();
                            System.out.println("Ingrese el username del garante: ");
                            String userNameG = sc.nextLine();
                            System.out.println("Ingrese el valor del automovil: ");
                            double valorA = sc.nextDouble();

                            Persona garante = new Persona(nombreG, apellidoG, userNameG);

                            garante.establecerNombre(nombreG);
                            garante.establecerApellido(apellidoG);
                            garante.establecerUsername(userNameG);

                            PrestamoAutomovil prestamoA = new PrestamoAutomovil(persona, meses, ciudad, tipo, marca, garante, valorA);

                            prestamoA.establecerBeneficiario(persona);
                            prestamoA.establecerTiempoPrestamo(meses);
                            prestamoA.establecerCiudadPrestamo(ciudad.toLowerCase());
                            prestamoA.establecerTipoAutomovil(tipo);
                            prestamoA.establecerMarca(marca);
                            prestamoA.establecerGaranteUno(garante);
                            prestamoA.establecerValorAutomovil(valorA);
                            prestamoA.calcularValorMensual();

                            System.out.println("Desea solicitar otro prestamo, ingrese la letra S para continuar o la letra M para volver al menu");
                            sc.nextLine();
                            preg = sc.nextLine();

                            pA = String.format("%s%s\n", pA, prestamoA);

                        } while (preg.equals("S"));
                        System.out.println(pA);
                        break;

                    //caso 2 para ingresar e imprimir todo lo referente a prestamos de centros educativos
                    case 2:
                        do {
                            System.out.println("Ingrese el nivel de estudio:");
                            String nivelE = sc.nextLine();
                            System.out.println("Ingrese el nombre del Centro educativo: ");
                            String nombreCE = sc.nextLine();
                            System.out.println("Ingrese las siglas del mismo: ");
                            String siglas = sc.nextLine();
                            System.out.println("Ingrese el valor a pagar de la carrera: ");
                            double valorC = sc.nextDouble();

                            InstitucionEducativa prestamoE = new InstitucionEducativa(nombreCE,siglas);

                            PrestamoEducativo prestamos = new PrestamoEducativo(persona, meses, ciudad, nivelE, prestamoE, valorC);

                            prestamos.establecerBeneficiario(persona);
                            prestamos.establecerTiempoPrestamo(meses);
                            prestamos.establecerCiudadPrestamo(ciudad.toUpperCase());
                            prestamos.establecerNivelEstudio(nivelE);
                            prestamos.establecerCentroEducativo(prestamoE);
                            prestamos.establecerValorCarrera(valorC);
                            prestamos.calcularValorMensual();

                            System.out.println("Desea solicitar otro prestamo, ingrese la letra S para continuar o la letra M para volver al menu");
                            sc.nextLine();
                            preg = sc.nextLine();

                            pE = String.format("%s%s\n", pE, prestamos);

                        } while (preg.equals("S"));
                        System.out.println(pE);
                        break;

                    default:
                        System.out.println("Debe digitar 1 o 2");
                }

            } else if (op != 3) {
                System.out.println("Debe digitar 1 o 2");
            } else {
                System.out.println("Gracias por solicitar su prestamo");
            }
        } while (op != 3);
    }
}
