//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.14 at 10:12:12 AM PDT 
//


package com.marklogic.client.config.search.jaxb;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element ref="{http://marklogic.com/appservices/search}element"/>
 *             &lt;element ref="{http://marklogic.com/appservices/search}attribute"/>
 *             &lt;element ref="{http://marklogic.com/appservices/search}fragment-scope"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://marklogic.com/appservices/search}field"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://marklogic.com/appservices/search}term-option"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "elementOrAttributeOrFragmentScope"
})
public class Value {

    @XmlElementRefs({
        @XmlElementRef(name = "element", namespace = "http://marklogic.com/appservices/search", type = Element.class),
        @XmlElementRef(name = "fragment-scope", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class),
        @XmlElementRef(name = "field", namespace = "http://marklogic.com/appservices/search", type = Field.class),
        @XmlElementRef(name = "term-option", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class),
        @XmlElementRef(name = "attribute", namespace = "http://marklogic.com/appservices/search", type = Attribute.class)
    })
    protected List<Object> elementOrAttributeOrFragmentScope = new Vector<Object>();

    /**
     * Gets the value of the elementOrAttributeOrFragmentScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementOrAttributeOrFragmentScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementOrAttributeOrFragmentScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Element }
     * {@link Attribute }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getElementOrAttributeOrFragmentScope() {
        if (elementOrAttributeOrFragmentScope == null) {
            elementOrAttributeOrFragmentScope = new Vector<Object>();
        }
        return this.elementOrAttributeOrFragmentScope;
    }

    public boolean isSetElementOrAttributeOrFragmentScope() {
        return ((this.elementOrAttributeOrFragmentScope!= null)&&(!this.elementOrAttributeOrFragmentScope.isEmpty()));
    }

    public void unsetElementOrAttributeOrFragmentScope() {
        this.elementOrAttributeOrFragmentScope = null;
    }

}
