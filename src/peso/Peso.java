package peso;

import acciones.VariablesTextuales;

import static constantes.ConstantesDouble.*;
import static constantes.ConstantesEnteros.*;
import static constantes.ConstantesEnteros.CUARENTA;
import static constantes.ConstantesString.*;

public class Peso extends VariablesTextuales
{
    public double calcularMasa()
    {
        return ( this.getPeso()/(this.getEstatura()*this.getEstatura()));
    }

    public String mostrarMasa() {
        if (this.calcularMasa() <= QUINCE.getNum()) {
            this.setCadena(TEXTO_PESO_UNO.getMensaje());
        } else if (this.calcularMasa() == QUINCE.getNum() || this.calcularMasa() <= QUINCE_PUNTO_NUEVE.getDecimales()) {
            this.setCadena(TEXTO_PESO_DOS.getMensaje());
        } else if (this.calcularMasa() == DIECISEIS.getNum() || this.calcularMasa() <= DIECIOCHO_PUNTO_CUATRO.getDecimales()) {
            this.setCadena(TEXTO_PESO_TRES.getMensaje());
        } else if (this.calcularMasa() == DIECIOCHO_PUNTO_CINCO.getDecimales() || this.calcularMasa() <= VENTICUATRO_NUEVE.getDecimales()) {
            this.setCadena(TEXTO_PESO_CUATRO.getMensaje());
        } else if (this.calcularMasa() == VENTICINCO.getNum() || this.calcularMasa() <= VENTINUEVE_PUNTO_NUEVE.getDecimales()) {
            this.setCadena(TEXTO_PESO_CINCO.getMensaje());
        } else if (this.calcularMasa() == TREINTA.getNum() || this.calcularMasa() <= TREINTAICUATRO_NUEVE.getDecimales()) {
            this.setCadena(TEXTO_PESO_SEIS.getMensaje());
        } else if (this.calcularMasa() == TREINTAICINCO.getNum() || this.calcularMasa() <= TREINTAINUEVE_NUEVE.getDecimales()) {
            this.setCadena(TEXTO_PESO_SIETE.getMensaje());
        } else if (this.calcularMasa() <= CUARENTA.getNum()) {
            this.setCadena(TEXTO_PESO_OCHO.getMensaje());
        } else {
            this.setCadena(CONTRO_DE_ERRORES.getMensaje());
        }
        return this.getCadena();
    }
}
