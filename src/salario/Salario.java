package salario;

import acciones.VariablesTextuales;

import javax.swing.*;

import static constantes.ConstantesEnteros.CERO;
import static constantes.ConstantesEnteros.UNO;
import static constantes.ConstantesString.*;

public class Salario extends VariablesTextuales
{
    public double calcularSalario()
    {

        for (int i = CERO.getNum();  i < this.getCantidad() ; i++ )
        {
            this.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,INGRESAR_SALARIO.getMensaje()+
                    (i+UNO.getNum()))));
            if (this.getSalario() > this.getMayor() )
            {
                this.setMayor(this.getSalario());
            }
            this.setSumatorio(this.getSumatorio()+this.getSalario());
        }
        JOptionPane.showMessageDialog(null, EL_NUMERO_MAYOR.getMensaje() + this.getMayor());
        JOptionPane.showMessageDialog(null,EL_PROMEDIO.getMensaje()+ this.getSumatorio()/this.getCantidad());
        JOptionPane.showMessageDialog(null,TOTAL_SALARIO.getMensaje()+ this.getSumatorio());
        return this.getCantidad();
    }
}
