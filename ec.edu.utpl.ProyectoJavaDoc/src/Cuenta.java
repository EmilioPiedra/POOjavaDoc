/**
 * Clase abstracta Cuenta, tiene herencia con 2 clases, entonces se puede definir como una
 * superClase y esta tiene 2 subclases que la extienden.
 * @author Emilio Piedra
 * @version 0.1, 2022/07/28
 */
public abstract class Cuenta {
    /**
     * La aplicación de este atributo de modificador de acceso público es para definir un orden de registro.
     */
    private String numero;
    /**+
     * La aplicación de este atributo de modificador de acceso público es para definir un valor según el registro.
     */
    private double saldo;
    /**
     *Este método es constructor de la superclase Abstracta cuenta, inicializa los atributos de la clase.
     * @param numero La aplicación de este parámetro es para inicializar el valor del atributo numero.
     * @param saldo  La aplicación de este parámetro es para inicializar el valor del atributo saldo.
     */
    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     *Este método es propio de la clase, su aplicación es para definir si los valores son válidos,
     * que no sean menores a 0.
     * @param monto Valor que será comparado con una constante.
     * @throws IllegalArgumentException Si el valor del parámetro es menor a 0 entonces hay una excepción.
     */
    public void esSaldoValido(double monto) {
        if( monto <= 0 ) {
            throw new IllegalArgumentException("El saldo no es valido");
        }
    }

    /**
     * Método abstracto que será implementado en las subClases donde exista la herencia, el parámetro es para ajustar acciones relacionadas
     * con el nombre de la clase.
     * @param monto  El parámetro del método es para asignar un valor al atributo saldo.
     */
    public  abstract void depositar(double monto);

    /**
     * Este método es para obtener el valor del atributo saldo de la superClase abstracta Cuenta
     * @return saldo El retorno el valor del atributo saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *Este método es para modificar el valor del atributo saldo de la clase abstracta Cuenta
     * @param saldo El parámetro es un valor que modificara el valor del atributo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}