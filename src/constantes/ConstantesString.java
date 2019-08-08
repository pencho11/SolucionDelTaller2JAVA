package constantes ;

public enum ConstantesString
{
    MENU("Menu \n 0 salir \n 1 Peso corporal.\n  2 Signo Zodiacal. \n 3 Salario. \n 4 Vectores. "),
    DESPEDIDA("Gracias por usar el sistema. Buena suerte."),
    PEDIR_NOMBRE("ingrese su nombre: "),
    PESO_KG("ingrese peso en Kilogramos (Kg)"),
    ESTATURA_MTS("Ingrese su estatura en Metros (mts)"),
    BIENBENIDO("Bienvenido "),
    ESTADO_ACTUAL(".\n actualmente su estado es  "),
    PUNTO("."),
    DIA_NACIMIENTO("ingrese día de nacimiento"),
    MES_NACIMIENTO("ingrese mes de nacimiento"),
    ANIO_NACIMIENTO("ingrese año de nacimiento"),
    ESPACIO(" "),
    ADVERTENCIA("Por favor ingrese el numero correspondiente."),
    CONTRO_DE_ERRORES("No Existe clasificacion"),
    ARIES("Signo Aries\nAstro: Marte y Plutón | Elemento: Fuego"),
    TAURO("Signo Tauro\nAstro: Venus y Tierra | Elemento: Tierra"),
    GEMENIS("Signo Gémenis\nAstro: Mercurio | Elemento: Aire"),
    CANCER("Signo Cáncer\nAstro: Luna | Elemento: Agua"),
    LEO("Signo Leo\nAstro: Sol | Elemento: Fuego"),
    VIRGO("Signo Virgo\nAstro: Mercurio | Elemento: Tierra"),
    LIBRA("Signo Libra\nAstro: Venus | Elemento: Aire"),
    ESCORPIO("Signo Escorpio\nAstro: Plutón y Marte | Elemento: Agua"),
    SAGITARIO("Signo Sagitario\n Astro: Júpiter | Elemento: Fuego"),
    CAPRICORNIO("Signo Capricornio\n Astro: Saturno | Elemento: Tierra"),
    ACUARIO("Signo Acuario\n Astro: Urano y Saturno | Elemento: Aire"),
    PICIS("Signo Piscis\n Astro: Neptuno y Júpiter | Elemento: Agua"),
    ERROR_DE_DATOS("¡ERROR!\nIngresar los datos correctamente."),
    TEXTO_PESO_UNO("Delgadez muy cevera"),
    TEXTO_PESO_DOS("Delgadez cevera"),
    TEXTO_PESO_TRES("Delgadez"),
    TEXTO_PESO_CUATRO("Peso saludable"),
    TEXTO_PESO_CINCO("Sobre peso"),
    TEXTO_PESO_SEIS("Obesidad moderada"),
    TEXTO_PESO_SIETE("Obesidad severa"),
    TEXTO_PESO_OCHO("Obesidad muy severa"),
    INGRESAR_SALARIO("ingresa salario "),
    EL_NUMERO_MAYOR("El numero mayor es $"),
    EL_PROMEDIO("El promedio es $"),
    TOTAL_SALARIO("El total de salarios es:  $"),
    VALOR_NUMEROS("introduce el valor numero"),
    PROMEDIO_POSITIVO("promedio de valores ingresados positivos: "),
    PROMEDIO_NEGATIVO("promedio de valores ingresados negativos: ");

    private String mensaje ;

     ConstantesString(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }


}
