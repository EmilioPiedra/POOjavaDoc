/**
 *Esta clase es para ejecutar las clases Cuenta, Ahorro y Corriente.
 */
public class RunClass {
    public static void main(String[] args) {
        Ahorro aho = new Ahorro("ABC-123", 1000);
        Corriente corr = new Corriente("ACS-123", 200);

        aho.depositar(800);
        System.out.println(aho.getSaldo());

        corr.depositar(800);
        System.out.println(corr.getSaldo());

        aho.Retira(250);
        System.out.println(aho.getSaldo());

        corr.pagarCheque(500);
        System.out.println(corr.getSaldo());
    }
}
