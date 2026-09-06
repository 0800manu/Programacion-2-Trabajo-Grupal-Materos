package ejerciciosConjuntos;
import ejerciciosConjuntos.Interface.ConjuntoTDA;
import ejerciciosConjuntos.Implementacion.ConjuntoEstatico;

public class Main{
    public static void main(String[] args){

        //Ejercicio 1 : Padron electoral - Registro de alumnos para votar en el centro de estudiantes

        //Modificamos implementacion de Agregar para que indique que si el legajo ya voto entonces
        //No puede volver a votar y por tanto no lo agrega a el conjunto.


        ConjuntoTDA alumnos = new ConjuntoEstatico();

        //Conjunto vacio
        alumnos.InicializarConjunto();

        //Agregamos alumnos

        alumnos.Agregar(2345, "votacion");
        alumnos.Agregar(5678, "Votacion");

        //Alumno repetido
        alumnos.Agregar(5678, "Votacion");

        //Ejercio 2 : Invitados a la fiesta de fin de cursada.
        // No cambia el tamaño del conjunto ya que agregar verifica primero que no este en el conjunto

        ConjuntoTDA invitados = new ConjuntoEstatico();

        invitados.InicializarConjunto();

        invitados.Agregar(222, "Fiesta");
        invitados.Agregar(222,"Fiesta");


        //Ejercicio 3 : Filtro de Spam . Verificar si un mail entrante tiene palabra prohibida

        /* Hacemos una conjunto vacio de con las palabras prohibidas, como el tda toma como variable un int entonces
        usamos la funcion de hashcode y pasamos el concepto para saber a que palabra la asociamos.
         */

        ConjuntoTDA spam = new ConjuntoEstatico();

        spam.InicializarConjunto();

        spam.Agregar("Crypto".hashCode(), "Crypto");
        spam.Agregar("Gana".hashCode(), "Gana");
        spam.Agregar("Premio".hashCode(), "Premio");

        String mail = "Ganá un Premio";
        // prueba
         boolean esSpam = false;
         //Recorre las palabras del mail y se fija si alguna pertenece al conjunto spam

        for (String palabra : mail.toLowerCase().split("\\W+")) {

            if (spam.Pertenece(palabra.hashCode())) {
                esSpam = true;
                break;
            }
        }
       if (esSpam){
           System.out.print("El mail es spam");
       }else{
           System.out.print("El mail no es spam");
       }

        //Ejercicio 4: Tags de un blog de ingenieria . ( #Programacion, #java, #oop)

        //Mismo concepto que ejercicio 3. Hacemos un conjunto que contenga el hash de esas palabras

        ConjuntoTDA tags = new ConjuntoEstatico();

        tags.InicializarConjunto();

        tags.Agregar("#Programacion".hashCode(), "#Programacion");
        tags.Agregar("#Java".hashCode(), "#Java");
        tags.Agregar("#OOP".hashCode(), "#OPP");

       //Ejercicio 5 : Operacion Elegir vs sacar
        // Si llamas a Elegir dos veces seguidas sin llamar a Sacar te devuelve el mismo elemento?

        /* Respuesta : basados en la interfaz no sabriamos si devuelve el mismo elemnto ya que eso
        depende de la implementacion, que se le haya dado, en este caso si lo devolveria ya que la implementacion no tiene niguna
         condicion especifica */




    }
}
