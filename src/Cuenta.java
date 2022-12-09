public class Cuenta {
    public static int numeroCuenta;
    public static double fondos;
    String nombreBanco;

    public Cuenta(int numeroCuenta, double fondos, String nombreBanco) {
        Cuenta.numeroCuenta = numeroCuenta;
        Cuenta.fondos = fondos;
        this.nombreBanco = nombreBanco;
    }

}
