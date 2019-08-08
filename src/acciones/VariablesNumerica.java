package acciones ;

import static constantes.ConstantesEnteros.CERO;
import static constantes.ConstantesEnteros.CUARENTA;

public class VariablesNumerica
{
    private int opcion;

    private double estatura;

    private double peso;

    private byte dia;

    private byte mes;

    private int anio;

    private int cantidad;

    private double salario;

    private double sumatorio;

    private double mayor ;

    private int n;

    private int pos ;

    private int result;

    private int promedioPos;

    public int getPromedioNeg() {
        return promedioNeg;
    }

    public void setPromedioNeg(int promedioNeg) {
        this.promedioNeg = promedioNeg;
    }

    public int getPromedioPos() {
        return promedioPos;
    }

    public void setPromedioPos(int promedioPos) {
        this.promedioPos = promedioPos;
    }

    private int promedioNeg;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNeg() {
        return neg;
    }

    public void setNeg(int neg) {
        this.neg = neg;
    }

    private int neg ;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }



    private int[]  numeros;

    public VariablesNumerica() {
        this.setPos(CERO.getNum());
        this.setOpcion(CERO.getNum());
        this.setSumatorio(CERO.getNum());
        this.setMayor(CERO.getNum());
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }


    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSumatorio() {
        return sumatorio;
    }

    public void setSumatorio(double sumatorio) {
        this.sumatorio = sumatorio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
