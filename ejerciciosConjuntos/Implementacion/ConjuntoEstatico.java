package ejerciciosConjuntos.Implementacion;

import ejerciciosConjuntos.Interface.ConjuntoTDA;

public class ConjuntoEstatico implements ConjuntoTDA {

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void InicializarConjunto() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(int x, String concepto) {
        if (cantidad < MAX && !Pertenece(x)) {
            datos[cantidad] = x;
            cantidad++;
            System.out.println("La persona  " + x + " ha sido agregada al conjunto" + concepto);
        }else{
            System.out.println("La persona  " + x + " no es valida porque ya esta en el conjunto " + concepto);
        }
    }

    @Override
    public void Sacar(int x) {
        int i = 0;
        while (i < cantidad && datos[i] != x) {
            i++;
        }

        if (i < cantidad) {
            datos[i] = datos[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public boolean Pertenece(int x) {
        int i = 0;

        while (i < cantidad) {
            if (datos[i] == x) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public int Elegir() {
        return datos[0];
    }
}