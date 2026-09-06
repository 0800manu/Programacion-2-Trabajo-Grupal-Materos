//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


        // Ejercicio 1 - Crear productos y muestre datos por pantalla.

        Producto producto1 = new Producto(1, "Termo", 1500);
        Producto producto2 = new Producto(2, "Mate", 2000);


        producto1.mostrarDatos();
        producto2.mostrarDatos();

        // Ejercicio 2 - para modificar cantidad de stock.
        producto1.ingresarStock(25);

        producto1.mostrarDatos();

        // Ejercicio 3  - venta valida y venta superando el stock

        producto1.venderProducto(3);
        producto2.venderProducto(1);
}
