public class Usuario {
    int numeroCuenta;
    double retiros;
    String usuario;

    public Usuario(Cuenta cuenta, String nombreUsuario) {
        this.usuario = nombreUsuario;
        this.numeroCuenta = this.getNumeroCuenta();
    }

    public void ingresar(int numeroCuenta) {
        if (existeCuenta(numeroCuenta)) {
            System.out.println("Ingreso exitoso! \n");
        } else {
            System.out.println("No existe la cuenta: " + numeroCuenta + "\n");
            return;
        }
    }


    public void retiro(int numeroCuenta, double cantidad) {
        if (!existenFondos(cantidad)) {
            System.out.println("El valor a retirar no es válido!!" + "\n");
            return;
        }
        retiros += cantidad;
        Cuenta.fondos -= cantidad;
        System.out.println("El retiro a " + usuario + " es de: " + cantidad);
        System.out.println("El saldo de " + usuario + " es: " + Cuenta.fondos + "\n");

    }

    public void deposito(int numeroCuenta, double cantidad) {
        Cuenta.fondos += cantidad;
        System.out.println("El nuevo saldo de " + usuario + " es: " + Cuenta.fondos + "\n");
    }

    public void imprimir(int numeroCuenta) {
        if (!existeCuenta(numeroCuenta)) {
            System.out.println("No existe la cuenta: " + numeroCuenta + "\n");
            return;
        }
        System.out.println("************************\n" +
                "* Nombre: " + usuario + "\n" +
                "* Número de cuenta: " + numeroCuenta + "\n" +
                "* Total disponible: " + Cuenta.fondos + "\n" +
                "* Total retiros: " + retiros + "\n");

    }

    public void transferir(int numeroCuenta, int numeroReceptor, double cantidad) {
        if (!existenFondos(cantidad)) {
            System.out.println("El valor a retirar no es válido!!" + "\n");
            return;
        }

    }

    private boolean existenFondos(double cantidad) {
        return (cantidad < getFondos());
    }

    private boolean existeCuenta(int numeroCuenta) {
        return this.getNumeroCuenta() == Cuenta.numeroCuenta;
    }

    private int getNumeroCuenta() {
        return Cuenta.numeroCuenta;
    }

    private double getFondos() {
        return Cuenta.fondos;
    }


}


