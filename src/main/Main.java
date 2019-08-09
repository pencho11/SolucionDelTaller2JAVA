package main;

import acciones.EntornoLogico;
import peso.Peso;
import zodiaco.Signo;
import salario.Salario;
import vectores.Vector;
import javax.swing.*;
import java.text.DecimalFormat ;
import java.text.DecimalFormatSymbols ;


import static constantes.ConstantesEnteros.*;
import static constantes.ConstantesString.*;

public class Main
{
    public static void main(String[] args)
    {
        EntornoLogico logico = new EntornoLogico();

        DecimalFormatSymbols simbolo = new DecimalFormatSymbols() ;
        simbolo.setDecimalSeparator(',') ;
        simbolo.setGroupingSeparator('.') ;

        DecimalFormat formateador = new DecimalFormat( "###,###.##", simbolo ) ;
        do
        {
            String opc = JOptionPane.showInputDialog(null, MENU.getMensaje() );
            logico.setOpcion(Integer.parseInt(opc)) ;

            switch ( logico.getOpcion())
            {
                case 0:
                    JOptionPane.showMessageDialog(null, DESPEDIDA.getMensaje());
                    break;

                case 1:
                    Peso peso = new Peso();
                    String nombre = JOptionPane.showInputDialog(null, PEDIR_NOMBRE.getMensaje());
                    peso.setNombre(nombre);

                    String kg = JOptionPane.showInputDialog(null, PESO_KG.getMensaje());
                    peso.setPeso(Double.parseDouble(kg)) ;

                    String estatura = JOptionPane.showInputDialog(null, ESTATURA_MTS.getMensaje());
                    peso.setEstatura(Double.parseDouble(estatura));

                    JOptionPane.showMessageDialog(null, BIENBENIDO.getMensaje() + peso.getNombre()
                            + ESTADO_ACTUAL.getMensaje() + peso.mostrarMasa() + PUNTO.getMensaje());
                    break;

                case 2:
                    Signo signo = new Signo();

                    String nom = JOptionPane.showInputDialog(null, PEDIR_NOMBRE.getMensaje());
                    signo.setNombre(nom);


                    String dia = JOptionPane.showInputDialog(null, DIA_NACIMIENTO.getMensaje());
                    signo.setDia(Byte.parseByte(dia));

                    String mes = JOptionPane.showInputDialog(null, MES_NACIMIENTO.getMensaje());
                    signo.setMes(Byte.parseByte(mes));

                    if(signo.getMes() >= TRES.getNum() && signo.getMes() <= SEIS.getNum()){

                        JOptionPane.showMessageDialog(null,BIENBENIDO.getMensaje() + signo.getNombre() +
                                ESPACIO.getMensaje()+signo.mostrarSigno());
                    }
                    else if(signo.getMes() >= SEIS.getNum() && signo.getMes() <= NUEVE.getNum() ){
                        JOptionPane.showMessageDialog(null,BIENBENIDO.getMensaje() + signo.getNombre() +
                                ESPACIO.getMensaje()+signo.mostrarSigno2());
                    }
                    else if(signo.getMes() >= NUEVE.getNum() && signo.getMes() <=DOCE.getNum() ){
                        JOptionPane.showMessageDialog(null,BIENBENIDO.getMensaje() + signo.getNombre() +
                                ESPACIO.getMensaje()+signo.mostrarSigno3());
                    }
                    else if(signo.getMes() >= DOCE.getNum() && signo.getMes() <=TRES.getNum() ){
                        JOptionPane.showMessageDialog(null,BIENBENIDO.getMensaje() + signo.getNombre() +
                                ESPACIO.getMensaje()+signo.mostrarSigno4());
                    }
                    break;

                case 3:
                    Salario salario = new Salario();
                    salario.setCantidad(Integer.parseInt((JOptionPane.showInputDialog(null, "Obtener promedio\n"+
                            "ingresa cantidad de salarios para analizar")) ) );

                    JOptionPane.showMessageDialog(null, formateador.format(salario.calcularSalario()));
                    break;

                case 4:
                    Vector vector = new Vector();
                    vector.setN(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrse cantidad numeros: ")));

                    JOptionPane.showMessageDialog(null, vector.calcularVector());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, ADVERTENCIA.getMensaje());
                    break;
            }
        }
        while ( logico.getOpcion() != CERO.getNum() );
    }
}