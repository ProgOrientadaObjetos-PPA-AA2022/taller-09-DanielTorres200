/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
     protected String nivelEstudio;
    protected InstitucionEducativa centroEducativo;
    protected double valorCarrera;
    protected double valorMensual;

    public PrestamoEducativo(Persona b, int t, String cp, String ne,
            InstitucionEducativa ce, double vc) {
        super(b, t, cp);
        nivelEstudio = ne;
        centroEducativo = ce;
        valorCarrera = vc;
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void establecerValorCarrera(double v) {
        valorCarrera = v;
    }

    public void calcularValorMensual() {
        valorMensual = (valorCarrera / tiempoPrestamo)- 
                ((valorCarrera / tiempoPrestamo) * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\n\tPrestamos de Intituciones Educativos\n";
        cadenaFinal = String.format("%s%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor a pagar de la carrera: %.2f\n"
                + "Valor mensual a pagar: %.2f\n",
                cadenaFinal,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());
        return cadenaFinal;
    }
}
