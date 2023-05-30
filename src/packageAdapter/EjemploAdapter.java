package packageAdapter;

/**
 * Este es un ejemplo de patrón Adapter.
 * El adaptador permite que un objeto existente sea utilizado por otro objeto a través de una interfaz común.
 * En este ejemplo, se adapta un objeto existente al utilizarlo a través de una interfaz objetivo.
 *
 * @author Adminutor: Rodrigo Ojeda Arce
 */

/**
 * Interfaz del objeto objetivo.
 */
interface Objetivo {
    /**
     * Método objetivo a ser implementado por las clases que lo utilicen.
     */
    void metodoObjetivo();
}

/**
 * Clase del objeto existente (a adaptar).
 */
class ObjetoExistente {
    /**
     * Método existente que se desea adaptar.
     */
    void metodoExistente() {
        System.out.println("Método existente llamado");
    }
}

/**
 * Adaptador que implementa la interfaz del objeto objetivo y utiliza el objeto existente.
 */
class Adaptador implements Objetivo {
    private ObjetoExistente objetoExistente;

    /**
     * Constructor del adaptador.
     *
     * @param objetoExistente Objeto existente que se va a adaptar.
     */
    Adaptador(ObjetoExistente objetoExistente) {
        this.objetoExistente = objetoExistente;
    }

    /**
     * Método objetivo adaptado que llama al método existente.
     */
    public void metodoObjetivo() {
        System.out.println("Adaptador: método objetivo llamado");
        objetoExistente.metodoExistente();
    }
}

/**
 * Clase cliente que utiliza la interfaz del objeto objetivo.
 */
class Cliente {
    private Objetivo objetivo;

    /**
     * Constructor del cliente.
     *
     * @param objetivo Objeto objetivo a utilizar.
     */
    Cliente(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * Ejecuta la operación llamando al método objetivo.
     */
    void ejecutarOperacion() {
        System.out.println("Cliente: llamando al método objetivo del adaptador");
        objetivo.metodoObjetivo();
    }
}

/**
 * Ejemplo de uso del patrón Adapter.
 */
public class EjemploAdapter {
    /**
     * Método principal que demuestra el uso del patrón Adapter.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Crear un objeto existente
        ObjetoExistente objetoExistente = new ObjetoExistente();

        // Crear un adaptador y pasarlo al cliente
        Adaptador adaptador = new Adaptador(objetoExistente);
        Cliente cliente = new Cliente(adaptador);

        // Llamar al método objetivo del cliente
        cliente.ejecutarOperacion();
    }
}