public class cuentaBancaria {

    String nombre;
    String apellido;
    int numeroCuenta;
    String tipoCuenta;
    float saldo;

    // Atributo que represente el procentaje de interes mensual aplicado a la cuenta

    double interes = 0.02;

    // Agregar un atributo a la clase cuentaBancaria que determine si la cuenta esta activa (tipo boolean)

    boolean estado;


    //Constructor
    public cuentaBancaria(String nombre, String apellido, int numeroCuenta, String tipoCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
        this.estado = true;
    }

    // Metodos

    // Imprimir por pantalla los valores de los atributos de una cuenta bancaria.

    public void mostrarDatos(){
        System.out.println("Titular de la cuenta: " + nombre + apellido);
        System.out.println("Numero de la cuenta: " + numeroCuenta);
        System.out.println(" Tipo de cuenta :" + tipoCuenta);
        System.out.println(" Saldo : " + saldo);
    }

    // Consultar el saldo de una cuenta bancaria

    public float consultarSaldo(){
        return saldo;
    }

    // Consignar un determinado valor en la cuenta bancaria, actualizando el saldo correspondiente.

    public void modificarSaldo(float valor){
        saldo += valor;
    }

    //Retirar un determinado valor de la cuenta bancaria, actualizando el saldo correspondiente.

    public boolean retirarDinero( float cantidad){
        if (cantidad > saldo){
            System.out.println(" El valor ingresado es mayor a la cantidad disponible");
            return false;
        } else {
            saldo -= cantidad;
            return true;
        }
    }

    // Metodo que calcule un nuevo saldo aplicando la tasa de interes correspondiente.

    public void saldoInteres(){
        saldo += saldo*interes;
    }

    // Metodo para comparar saldos de cuentas bancarias

    public boolean compararSaldo( cuentaBancaria cuentaAcomparar ){
        return this.saldo >= cuentaAcomparar.saldo;

    }

    // Metodo debe reutilizar el metodo retirar para evaliar si la cantidad a transferir se encuentra en la cuenta de origen.

    public void transferencia( cuentaBancaria cuentaAtransferir, float valor){

        if (retirarDinero(valor) && estado ){
            cuentaAtransferir.saldo += valor;
            // para rectificar estado de cuenta si corresponde
            estadoCuenta();
            System.out.println("Transferencia realizada con exito");
        }else{
            if (!estado){
                System.out.println(" La cuenta no puede realizar transferencias porque se encuentra inactiva");
            }else{
                System.out.println("La cuenta de origen no tiene los fondos suficientes para realizar esa transferencia.");
            }

        }

    }

    public void estadoCuenta(){
        if (saldo<=0){
           estado = false;
        }
    }





}
