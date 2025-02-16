public class Usuario {
    int numeroCuenta;
    double retiros;
    String usuario;
    Usuario emisor;

    private double fondos;
    private static String nombreUsuario;

    public Usuario(Cuenta cuenta, String nombreUsuario) {
        this.usuario = nombreUsuario;
        this.numeroCuenta = cuenta.numeroCuenta;
        this.fondos = cuenta.fondos;
    }

    public void ingresar(int numeroCuenta) {
        if (existeCuenta(numeroCuenta)) {
            System.out.println("Ingreso exitoso! \n");
        } else {
            System.out.println("No existe la cuenta: " + numeroCuenta + "\n");
            System.exit(-1);
        }
    }

    public void retiro(int numeroCuenta, double cantidad) {
        if (!existenFondos(cantidad)) {
            System.out.println("El valor a retirar no es válido!!" + "\n");
            return;
        }
        retiros += cantidad;
        fondos -= cantidad;
        System.out.println("El retiro a " + usuario + " es de: " + cantidad);
        System.out.println("El saldo de " + usuario + " es: " + fondos + "\n");
    }

    public void deposito(int numeroCuenta, double cantidad) {
        if (!existeCuenta(numeroCuenta)) {
            System.out.println("No existe la cuenta: " + numeroCuenta + "\n");
            return;
        }
        fondos += cantidad;
        System.out.println("El nuevo saldo de " + usuario + " es: " + fondos + "\n");
    }

    public void imprimir(int numeroCuenta) {
        if (!existeCuenta(numeroCuenta)) {
            System.out.println("No existe la cuenta: " + numeroCuenta + "\n");
            return;
        }
        System.out.println("************************\n" +
                "* Nombre: " + usuario + "\n" +
                "* Número de cuenta: " + numeroCuenta + "\n" +
                "* Total disponible: " + fondos + "\n" +
                "* Total retiros: " + retiros + "\n");
    }

    public void transferir(Usuario emisor, Usuario receptor, double cantidad) {
        this.emisor = emisor;

        if (!existenFondos(cantidad)) {
            System.out.println("El valor a retirar no es válido!!" + "\n");
            return;
        }
        receptor.fondos += cantidad;
        fondos -= cantidad;
        retiros += cantidad;
        System.out.println("Se transfirió " + cantidad + " a " + receptor.usuario + " desde " + emisor.usuario + "\n");
    }

    private boolean existenFondos(double cantidad) {
        return (cantidad <= fondos);
    }

    private boolean existeCuenta(int numeroCuenta) {
        return this.numeroCuenta == numeroCuenta;
    }

    private int getNumeroCuenta() {
        return numeroCuenta;
    }

    private double getFondos() {
        return fondos;
    }
}


