package constantes;

public enum ConstantesEnteros
{
    CERO(0),
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10),
    ONCE(11),
    DOCE(12),
    QUINCE(15),
    DIECISEIS(16),
    DIECINUEVE(19),
    VENTE(20),
    VENTIUNO(21),
    VENTIDOS(22),
    VENTITRES(23),
    VENTICUATRO(24),
    VENTICINCO(25),
    TREINTA(30),
    TREINTAICINCO(35),
    CUARENTA(40);

    private int num ;

    ConstantesEnteros(int i)
    {
        this.num = i;
    }

    public int getNum() {
        return num;
    }

}
