/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    protected String tipo;
    protected String marca;
    protected Persona garante1;
    protected double valorAutomovil;
    protected double valorMensual;

    public PrestamoAutomovil(Persona b, int tp, String c, String t, String m, 
            Persona g, double vA) {
        super(b, tp, c);
        tipo = t;
        marca = m;
        garante1 = g;
        valorAutomovil = vA;
       
    }

    public void establecerTipoAutomovil(String t) {
        tipo = t;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerGaranteUno(Persona g) {
        garante1 = g;
    }

    public void establecerValorAutomovil(double vA) {
        valorAutomovil = vA;
    }

    public void calcularValorMensual() {
        valorMensual = valorAutomovil / tiempoPrestamo;
    }

    public String obtenerTipoAutomovil() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGaranteUno() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\n\tPrestamos de Vehiculos\n";
        cadenaFinal = String.format("%s\n%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor de automóvil a pagar: %.2f\n"
                + "Valor mensual a pagar: %.2f\n",
                cadenaFinal,
                obtenerTipoAutomovil(),
                obtenerMarca(),
                obtenerGaranteUno(),
                obtenerValorAutomovil(),
                obtenerValorMensual());
        return cadenaFinal;
    }
}
