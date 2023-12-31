
package com.soap.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Multiply")
public class Multiply {

    protected int intA;
    protected int intB;

    /**
     * Obtiene el valor de la propiedad intA.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Define el valor de la propiedad intA.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Obtiene el valor de la propiedad intB.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Define el valor de la propiedad intB.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
