//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.14 at 10:12:12 AM PDT 
//


package com.marklogic.client.config.search.jaxb;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://marklogic.com/appservices/search}term-option"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}empty"/>
 *       &lt;/choice>
 *       &lt;attribute name="apply" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="at" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "termOptionOrEmpty"
})
@XmlRootElement(name = "term")
public class Term {

    @XmlElements({
        @XmlElement(name = "term-option", type = String.class),
        @XmlElement(name = "empty", type = Empty.class)
    })
    protected List<Object> termOptionOrEmpty = new Vector<Object>();
    @XmlAttribute(name = "apply")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String apply;
    @XmlAttribute(name = "ns")
    @XmlSchemaType(name = "anyURI")
    protected String ns;
    @XmlAttribute(name = "at")
    @XmlSchemaType(name = "anyURI")
    protected String at;

    /**
     * Gets the value of the termOptionOrEmpty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termOptionOrEmpty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermOptionOrEmpty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Empty }
     * 
     * 
     */
    public List<Object> getTermOptionOrEmpty() {
        if (termOptionOrEmpty == null) {
            termOptionOrEmpty = new Vector<Object>();
        }
        return this.termOptionOrEmpty;
    }

    public boolean isSetTermOptionOrEmpty() {
        return ((this.termOptionOrEmpty!= null)&&(!this.termOptionOrEmpty.isEmpty()));
    }

    public void unsetTermOptionOrEmpty() {
        this.termOptionOrEmpty = null;
    }

    /**
     * Gets the value of the apply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApply(String value) {
        this.apply = value;
    }

    public boolean isSetApply() {
        return (this.apply!= null);
    }

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNs() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNs(String value) {
        this.ns = value;
    }

    public boolean isSetNs() {
        return (this.ns!= null);
    }

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAt() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAt(String value) {
        this.at = value;
    }

    public boolean isSetAt() {
        return (this.at!= null);
    }

}
