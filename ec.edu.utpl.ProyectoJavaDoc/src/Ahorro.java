/**
 * Clase Ahorro
 * es una clase que extiende una superClase abstracta Cuenta, entonces implementa los métodos y
 * el constructor de esta, o por la herencia.
 * Se implementa el constructor Ahorro y el método depositar esta clase implementa un método
 * abstracto que se utilizara dependiendo de lo que requiera.
 * @author Emilio Piedra
 * @version 0.1, 2022/07/28
 */
public class Ahorro extends Cuenta{
    /**
     * Constructor Ahorro
     * Se implementa el constructor de la superClase Ahorro en esta subclase por la herencia que existe.
     * @param numero La aplicación de este parámetro es para inicializar el valor de numero.
     * @param saldo La aplicación de este parámetro es para inicializar el valor del saldo.
     */
    public Ahorro(String numero, double saldo) {
        super(numero, saldo);
    }

    /**
     * Este método la superClase Abstracta Cuenta es implementada en esta clase, el método es abstracto
     * se puede modificar lo que lleve dentro del mismo y no afectara en ninguna clase que este
     * implementado por ser abstracto.
     * @param monto El parámetro del método es para asignar un valor al atributo saldo de la superClase Cuenta mediante
     * una comparación del valor del parámetro si este es menor o mayor a cierta condición que en este caso son varias constates entonces realizara cierta acción y
     * ese valor se modificara en el atributo saldo de la superClase con el método setSaldo.
     */
    @Override
    public void depositar(double monto){
        esSaldoValido(monto);
        if(monto < 500) {
            setSaldo(monto + getSaldo());
        }else if((monto > 500) && (monto < 1000)) {
            monto = monto - (monto * 0.001);
            setSaldo(monto + getSaldo());
        }else if((monto > 1000) && (monto < 5000)) {
            monto = monto - (monto * 0.002);
            setSaldo(monto + getSaldo());
        }else if((monto > 5000)){
            monto = monto - (monto * 0.003);
            setSaldo(monto + getSaldo());
        }
    }

    /**
     * Método tiene una estructura condicional if-esle donde se hace llamado de método getSaldo que ya esta
     * en la superClase Cuenta por el uso de la herencia entre clases se implementa en esta clase y se puede obtener el valor de este, si este valor
     * getSaldo es menor que el valor del parámetro hay una excepción si no, se usa el método
     * setSaldo para restar valor a la superCLase Cuenta que tienen una relación con Ahorro por la herencia
     * @param retirar Este parámetro modificara valores del atributo Saldo de la superClase Cuenta
     * @throws IllegalArgumentException Si el saldo es menor al valor del parámetro entonces hay una excepción.
     */
    public void Retira(double retirar){
        if(getSaldo() < retirar) {
            throw new IllegalArgumentException("El saldo es menor al retiro deseado");
        }else {
            setSaldo(getSaldo() - retirar);
        }
    }
}