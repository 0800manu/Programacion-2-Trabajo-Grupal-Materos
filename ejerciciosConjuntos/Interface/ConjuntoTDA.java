package ejerciciosConjuntos.Interface;

public interface ConjuntoTDA {
    void InicializarConjunto();
    void Agregar(int x, String concepto);
    void Sacar(int x);
    boolean ConjuntoVacio();
    boolean Pertenece(int x);
    int Elegir();
}