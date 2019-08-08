package constantes;

public enum ConstantesDouble
{
    QUINCE_PUNTO_NUEVE(15.9),
    DIECIOCHO_PUNTO_CUATRO(18.4),
    DIECIOCHO_PUNTO_CINCO(18.5),
    VENTICUATRO_NUEVE(24.9),
    VENTINUEVE_PUNTO_NUEVE(29.9),
    TREINTAICUATRO_NUEVE(34.9),
    TREINTAINUEVE_NUEVE(39.9);

    private double decimales;

    ConstantesDouble(double v) {
        this.decimales = v;
    }

    public double getDecimales() {
        return decimales;
    }
}
