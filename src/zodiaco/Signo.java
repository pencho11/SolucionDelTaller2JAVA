package zodiaco;

import acciones.VariablesTextuales;

import static constantes.ConstantesEnteros.*;
import static constantes.ConstantesEnteros.VENTE;
import static constantes.ConstantesString.*;


public class Signo extends VariablesTextuales {
    public String mostrarSigno() {
        if ((this.getMes() == TRES.getNum() && this.getDia() >= VENTIUNO.getNum()) ||
                (this.getMes() == CUATRO.getNum() && this.getDia() <= VENTE.getNum())) {
            this.setCadena(ARIES.getMensaje());
        } else if ((this.getMes() == CUATRO.getNum() && this.getDia() >= VENTIUNO.getNum()) ||
                (this.getMes() == CINCO.getNum() && this.getDia() <= VENTE.getNum())) {
            this.setCadena(TAURO.getMensaje());
        } else if ((this.getMes() == CINCO.getNum() && this.getDia() >= VENTIUNO.getNum()) ||
                (this.getMes() == SEIS.getNum() && this.getDia() <= VENTIUNO.getNum())) {
            this.setCadena(GEMENIS.getMensaje());
        }
        return this.getCadena();
    }

    public String mostrarSigno2() {
        if ((this.getMes() == SEIS.getNum() && this.getDia() >= VENTIDOS.getNum()) ||
                (this.getMes() == SIETE.getNum() && this.getDia() <= VENTIDOS.getNum())) {
            this.setCadena(CANCER.getMensaje());
        } else if ((this.getMes() == SIETE.getNum() && this.getDia() >= VENTITRES.getNum()) ||
                (this.getMes() == OCHO.getNum() && this.getDia() <= VENTITRES.getNum())) {
            this.setCadena(LEO.getMensaje());
        } else if ((this.getMes() == OCHO.getNum() && this.getDia() >= VENTICUATRO.getNum()) ||
                (this.getMes() == NUEVE.getNum() && this.getDia() <= VENTITRES.getNum())) {
            this.setCadena(VIRGO.getMensaje());
        }
        return this.getCadena();
    }

    public String mostrarSigno3() {
        if ((this.getMes() == NUEVE.getNum() && this.getDia() >= VENTICUATRO.getNum()) ||
                (this.getMes() == DIEZ.getNum() && this.getDia() <= VENTIDOS.getNum())) {
            this.setCadena(LIBRA.getMensaje());
        } else if ((this.getMes() == DIEZ.getNum() && this.getDia() >= VENTITRES.getNum()) ||
                (this.getMes() == ONCE.getNum() && this.getDia() <= VENTIDOS.getNum())) {
            this.setCadena(ESCORPIO.getMensaje());
        } else if ((this.getMes() == ONCE.getNum() && this.getDia() >= VENTITRES.getNum()) ||
                (this.getMes() == DOCE.getNum() && this.getDia() <= VENTIDOS.getNum())) {
            this.setCadena(SAGITARIO.getMensaje());
        }
        return this.getCadena();
    }

    public String mostrarSigno4() {
        if ((this.getMes() == DOCE.getNum() && this.getDia() >= VENTIDOS.getNum()) ||
                (this.getMes() == UNO.getNum() && this.getDia() <= DIECINUEVE.getNum())) {
            this.setCadena(CAPRICORNIO.getMensaje());
        } else if ((this.getMes() == UNO.getNum() && this.getDia() >= VENTE.getNum()) ||
                (this.getMes() == DOS.getNum() && this.getDia() <= DIECINUEVE.getNum())) {
            this.setCadena(ACUARIO.getMensaje());
        } else if ((this.getMes() == DOS.getNum() && this.getDia() >= VENTE.getNum()) ||
                (this.getMes() == TRES.getNum() && this.getDia() <= VENTE.getNum())) {
            this.setCadena(PICIS.getMensaje());
        }
        return this.getCadena();
    }

}
