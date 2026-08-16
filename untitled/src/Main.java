// EJERCICIO INTEGRADOR


void main() {

    // Ejemplos hechos para probar

    cuentaBancaria cuenta1 = new cuentaBancaria( "Carmela", "Porta", 1234,
            "cuenta corriente");
    cuentaBancaria cuenta2 = new cuentaBancaria( "Camila", "algo", 3421,
            "cuenta de ahorros");

    // Metodo de mostrar datos

    cuenta1.mostrarDatos();
    cuenta2.mostrarDatos();

    // Metodo de modificar saldo

    cuenta1.modificarSaldo(12000);
    cuenta2.modificarSaldo(1300);

    // Metodo de retirar dinero

    cuenta1.retirarDinero(12);
    cuenta2.retirarDinero(12000);

    //Metodo de saldo

    cuenta1.saldoInteres();

    //Comparar saldo
    cuenta1.compararSaldo(cuenta2);

    //Transferencia

    cuenta1.transferencia(cuenta2, 13);




}
