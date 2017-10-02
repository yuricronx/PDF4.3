/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.ejemplo03;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author yojar
 */
public class ClassEjemplo03 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        // Definir un HashMap
HashMap global = new HashMap();
// Insertar valores "key"-"value" al HashMap
global.put("Laura", "667895789");
global.put("Pepe", "645895756");
global.put("Abelardo", "55895711");
global.put("Daniel", "667111788");
global.put("Arturo", "667598623");
// Definir Iterator para extraer o imprimir valores 
for( Iterator it = global.keySet().iterator(); it.hasNext();) { 
String s = (String)it.next();
String s1 = (String)global.get(s);
System.out.println("Alumno: "+s + " - " + "Telefono: "+s1);
}

    }
    
}
