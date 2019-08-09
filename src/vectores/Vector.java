package vectores;

import acciones.VariablesTextuales;

import javax.swing.*;

import static constantes.ConstantesEnteros.CERO;
import static constantes.ConstantesEnteros.UNO;
import static constantes.ConstantesString.*;

public class Vector extends VariablesTextuales
{

    public int calcularVector()
    {
         int[]x = new int[ this.getN()];

        for (int i = CERO.getNum(); i<this.getN(); i++)
        {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog(null, VALOR_NUMEROS.getMensaje()  +
                    (i+UNO.getNum())) );
            if (x[i] > CERO.getNum() ) {
                this.setPos(this.getPos() + x[i]);
                this.setPromedioPos (this.getPromedioPos() + UNO.getNum() );
            }
            else
            {
                this.setNeg(this.getNeg() + x[i]);
                this.setPromedioNeg(this.getPromedioNeg() + UNO.getNum());
            }
        }
        JOptionPane.showMessageDialog(null, PROMEDIO_POSITIVO.getMensaje() +(this.getPos()/this.getPromedioPos()));
        JOptionPane.showMessageDialog(null,  PROMEDIO_NEGATIVO.getMensaje()+(this.getNeg()/this.getPromedioNeg()));
        return (this.getPos());
    }
}
