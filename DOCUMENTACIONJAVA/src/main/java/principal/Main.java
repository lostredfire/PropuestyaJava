
package principal;

import metodos.MandarPantalla;

/**
 * Programa principal que eusa los métodos auxiliares para salto de ínea de la clase MandarPantalla
 * @author Silvia Ruiz Carrasco
 * @author silvia.ruiz@campusfp.es
 * @version 2.1
 * @see <a href = "http://www.datawalter.com"> datawalter.com - Aptrende </a>
 * 
 */
public class Main {

    /**
     * Punto de entrada único para el proyecto
     * 
     * 
     * <ul>
     *      <li>Utiliza método sinSalto</li>
     *      <li>Utiliza método conSalto</li>
     * </ul>
     * 
     * @param args es un arreglo de tipo String
     * 
     */
    public static void main(String[] args) {
        MandarPantalla mp = new MandarPantalla();
        mp.conSalto("Esto es una línea con salto");
        mp.sinSalto("Esto es una línea sin salto");
    }
    
}
