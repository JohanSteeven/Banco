public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(new Cuenta(2270, 0, "Pichincha"), "Johan");
        Usuario usuario1 = new Usuario(new Cuenta(1234, 0, "Pichincha"), "Erick");
        usuario.ingresar(2270);
        usuario.deposito(2270, 200.20);
        usuario.retiro(2270,100);
        usuario.deposito(2270,5100);
        usuario.retiro(2270, 100);
        usuario.imprimir(2270);
       // usuario.transferir(2270,1234,20.1);
    }
}