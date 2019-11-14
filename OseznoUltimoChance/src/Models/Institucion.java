/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

//paquete que es necesario importar porque vamos a serializar los objetos de la Clase
import java.io.Serializable;

/**
 *
 * @author daguaman
 */
/*implements Serializable - como se va a usar objetos y operar con 
archivos se usa para formatearlos y poderlos luego leer.
Por ende la clase solo se la deja con los atributos, métodos (solamente get y set)
los otros métodos se utiliza algo que se conoce como Realization.
*/
public class Institucion implements Serializable{
     /*al usar Serializable se debe ubicar esta línea 
        private static final long serialVersionUID = 1L;
    */
    private static final long serialVersionUID = 1L;
    /*Atributos de la clase Usuario, se debe ubicar 
    tal cual se encuentre su definición en el modelo UML*/
    int    intIdinstitucion;
    String strCodigo;
    String strNombre;
    String strDireccion;
    String strFono;
    //Atributo de titpo de dato String
    String strCiudad;

    /*
        Comentarip de Bloque:
    Constructor
    */
    public Institucion(int intIdinstitucion, String strCodigo, String strNombre, String strDireccion, String strFono, String strCiudad) {
        this.intIdinstitucion = intIdinstitucion;
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
        this.strDireccion = strDireccion;
        this.strFono = strFono;
        this.strCiudad = strCiudad;
    }
    
    //Constructor Vacio
    public Institucion(){
    
    }


    public int getIntIdinstitucion() {
        return intIdinstitucion;
    }

    public void setIntIdinstitucion(int intIdinstitucion) {
        this.intIdinstitucion = intIdinstitucion;
    }

    public String getStrCodigo() {
        return strCodigo;
    }

    public void setStrCodigo(String strCodigo) {
        this.strCodigo = strCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrDireccion() {
        return strDireccion;
    }

    public void setStrDireccion(String strDireccion) {
        this.strDireccion = strDireccion;
    }

    public String getStrFono() {
        return strFono;
    }

    public void setStrFono(String strFono) {
        this.strFono = strFono;
    }

    public String getStrCiudad() {
        return strCiudad;
    }

    public void setStrCiudad(String strCiudad) {
        this.strCiudad = strCiudad;
    }
}
