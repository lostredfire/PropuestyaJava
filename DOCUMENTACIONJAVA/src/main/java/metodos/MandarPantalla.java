
package metodos;

/**
 * Programa que implementa una clase con métodos auxiliares para salto de línea y línea continua
 * @author Silvia Ruíz Carrasco
 * @author silvia.ruiz@campusfp.es
 * @version 3.1
 * @see <a href = "http://www.datawalter.com"> datawalter.com - Aptrende </a>
 * 
 */
public class MandarPantalla {
    
    
  /**
   * Método para línea continua 
   * 
   * @param s  es un String que se muestra por pantalla sin salto
   */
    public  void sinSalto(String s){
        System.err.println(s);    
    }
    
    
   /**
   * Método para línea continua
   * 
   * @param s  es un String que se muestra por pantalla con salto
   */
    public  void conSalto(String s){
        System.err.println(s);    
    }
    
    
    
    
    
    
    
    
    
    
    
}
