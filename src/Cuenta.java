public class Cuenta {
    public static int numeroCuenta;
    public static double fondos;
    String nombreBanco;

    public Cuenta(int numeroCuenta, double fondos, String nombreBanco) {
        Cuenta.numeroCuenta = numeroCuenta;
        Cuenta.fondos = fondos;
        this.nombreBanco = nombreBanco;
    }

    public static int getNumeroCuenta() {
        return numeroCuenta;
    }

    public static double getFondos() {
        return fondos;
    }
}
