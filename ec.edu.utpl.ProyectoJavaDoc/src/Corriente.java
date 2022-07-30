/**
 * Clase Corriente
 * es una clase que extiende una superClase abstracta Cuenta, entonces implementa los métodos y
 * el constructor de esta, o por la herencia.
 * Se implementa el constructor Ahorro y el método depositar
 * Esta clase implementa un método abstracto que se utilizara dependiendo de lo que requiera.
 * @author Emilio Piedra
 * @version 0.1, 2022/07/28
 */
public class Corriente extends Cuenta {
    /**
     * Constructor Corriente
     * se implementa el constructor de la superClase Ahorro en esta clase por la herencia que existe.
     * @param numero La aplicación de este parámetro es para inicializar el valor de numero.
     * @param saldo  La aplicación de este parámetro es para inicializar el valor del saldo.
     */
    public Corriente(String numero, double saldo) {
        super(numero, saldo);
    }
    /**
     *Este método de la superClase Abstracta se implementa en esta clase, el método es abstracto
     * se puede modificar lo que lleve dentro del mismo y no afectara en ninguna clase por ser abstracto.
     * @param monto El parámetro del método es para asignar un valor al atributo saldo de la superClase Cuenta mediante una comparación del valor del parámetro si este
     * es menor o mayor a cierta condición que en este caso son varias constates entonces realizara cierta acción y ese valor se modificara en el atributo saldo
     * con el método setSaldo.
     */
    @Override
    public void depositar(double monto){
        esSaldoValido(monto);
        if(monto < 500) {
            setSaldo(monto + getSaldo());
        }else if((monto > 500) && (monto < 1000)) {
            monto = monto - (monto * 0.002);
            setSaldo(monto + getSaldo());
        }else if((monto > 1000) && (monto < 5000)) {
            monto = monto - (monto * 0.003);
            setSaldo(monto + getSaldo());
        }else if((monto > 5000)){
            monto = monto - (monto * 0.004);
            setSaldo(monto + getSaldo());
        }
    }

    /**
     * Método que sirve para pagar cheque, tiene una estructura condicional if-esle donde se hace llamado de método getSaldo que ya se encuentra
     * en la superClase por el uso de la herencia entre subClases se puede obtener el valor del mismo, si este valor
     * (getSaldo) es menor que el valor agregado en el parámetro hay una excepción si no, se usa el método
     * (setSaldo) para restar valor a la superClase Cuenta que tienen una relación con Ahorro por la herencia
     * @param cheque Este parámetro modificara valores del atributo Saldo de la superClase Cuenta.
     * @throws IllegalArgumentException Si el saldo es menor al valor del parámetro entonces hay una excepción.
     */
    public void pagarCheque(double cheque){
        if(getSaldo() < cheque) {
            throw new IllegalArgumentException("El cheque es mayor a saldo");
        }else {
            setSaldo(getSaldo() - cheque);
        }
    }

}