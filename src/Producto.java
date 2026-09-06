// EJERCICIO 1
// Se requiere modelar un producto de un depósito, con los siguientes atributos:
//Código del producto.
//Nombre del producto.
//Precio unitario.
//Cantidad en stock.
//a) Definir la clase Producto con estos atributos.
//b) Definir un constructor que reciba por parámetro el código, el nombre y
//el precio, e inicialice la cantidad en stock en cero.
//c) Definir un metodo mostrarDatos que imprima por pantalla los valores de todos los atributos del producto
//de todos los atributos del producto.
//d) Escribir un programa principal (main) que cree dos productos y
//muestre sus datos por pantalla


public class Producto {

    // Atributos

    int codigo;
    String nombre;
    float precio;
    int cantStock;

    // Constructor

    public Producto(int codigo, String nombre, float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantStock = 0;
    }

    // Metodo

    public void mostrarDatos(){
        System.out.println("Codigo Producto:" + codigo);
        System.out.println("Nombre de Producto: " + nombre );
        System.out.println("Precio de producto" + precio );
        System.out.println("Cantidad de stock:" + cantStock );
    }

    // Uso public int porque void es para cuando no tiene que devolver nada
    public int consultarStock(){
        return cantStock;
    }

    //En este caso si es public void
    public void ingresarStock(int cantidad){
        cantStock += cantidad;
    }

    // Ejercicio 3 -

    public void venderProducto (int cantidad){
        if ( cantidad > cantStock){
            System.out.println(" La cantidad ingresada es mayor a la cantidad disponible en stock ");
        }else{
            cantStock -= cantidad;
        }
    }

}

