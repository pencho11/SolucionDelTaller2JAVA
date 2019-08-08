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

        int numero[] = new int[ this.getN()];
        for (int i = CERO.getNum(); i<this.getN(); i++)
        {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, VALOR_NUMEROS.getMensaje()  +
                    (i+UNO.getNum())) );
            if (numero[i] > CERO.getNum() ) {
                this.setPos(this.getPos() + numero[i]);
                this.setPromedioPos (this.getPromedioPos() + UNO.getNum() );
            }
            else
            {
                this.setNeg(this.getNeg() + numero[i]);
                this.setPromedioNeg(this.getPromedioNeg() + UNO.getNum());
            }
        }
        JOptionPane.showMessageDialog(null, PROMEDIO_POSITIVO.getMensaje() +(this.getPos()/this.getPromedioPos()));
        JOptionPane.showMessageDialog(null,  PROMEDIO_NEGATIVO.getMensaje()+(this.getNeg()/this.getPromedioNeg()));
        return (this.getPos());
    }
}
