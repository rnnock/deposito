package cuentas;

/**
 * Clase CCuenta que es instanciada desde la clase principal Main, con su método
 * constructor por defecto (sin parámetros) y otro con todos sus atributos.
 * Además, cuenta con los métodos getter y setter así como distintos métodos
 * para realizar ingresos y retiradas de saldo.
 *
 * @author Richard Navarro <richardnavarro@paucasesnovescifp.cat>
 * @version 2.0 Esta versión incorpora comentarios de Javadoc
 * @since 1.5
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    //Métodos constructores
    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * @return nombre String con el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre String con el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta String con el IBAN identificativo de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta String con el IBAN para identificar la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo double con el importe del saldo de una cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo double con el saldo para establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés double con el tipo de interés a devolver
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés double con el tipo de interés que se desea establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método público estado que es invocado desde la clase principal y que
     * devuelve el saldo de una cuenta bancaria.
     *
     * @return saldo double con el saldo de la cuenta bancaria
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método público ingresar que es instanciado desde la clase principal y que
     * recibe por parámetro un double con una cantidad para ingresar, que es
     * comprobada para verificar que no es un importe negativo y que establece
     * el nuevo importe del saldo + la cantidad recibida por parámetro.
     *
     * @param cantidad double con el importe a ingresar
     * @throws Exception Esta excepción es lanzada si la cantidad recibida por
     * parámetro es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método público retirar que es llamada desde la clase principal y que
     * recibe por parámetro un double con una cantidad para retirar, que es
     * comprobada para verificar que no es un importe superior a 0 y que
     * establece el nuevo importe del saldo - la cantidad recibida por
     * parámetro.
     *
     * @param cantidad double con el importe a retirar
     * @throws Exception Esta excepción es lanzada si la cantidad recibida por
     * parámetro es menor o igual a 0 o si el saldo de la cuenta es inferior al
     * importe a retirar
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
