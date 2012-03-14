//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.14 at 10:12:12 AM PDT 
//


package com.marklogic.client.config.search.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://marklogic.com/appservices/search}apply-attrs"/>
 *       &lt;attribute name="strength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="element" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="options" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="delimiter" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="tokenize">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="word"/>
 *             &lt;enumeration value="default"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "starter")
public class Starter {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "strength", required = true)
    protected int strength;
    @XmlAttribute(name = "element")
    protected QName element;
    @XmlAttribute(name = "options")
    @XmlSchemaType(name = "anySimpleType")
    protected String options;
    @XmlAttribute(name = "delimiter")
    @XmlSchemaType(name = "anySimpleType")
    protected String delimiter;
    @XmlAttribute(name = "tokenize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tokenize;
    @XmlAttribute(name = "apply", required = true)
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    public boolean isSetContent() {
        return (this.content!= null);
    }

    /**
     * Gets the value of the strength property.
     * 
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     */
    public void setStrength(int value) {
        this.strength = value;
    }

    public boolean isSetStrength() {
        return true;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setElement(QName value) {
        this.element = value;
    }

    public boolean isSetElement() {
        return (this.element!= null);
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    public boolean isSetOptions() {
        return (this.options!= null);
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    public boolean isSetDelimiter() {
        return (this.delimiter!= null);
    }

    /**
     * Gets the value of the tokenize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenize() {
        return tokenize;
    }

    /**
     * Sets the value of the tokenize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenize(String value) {
        this.tokenize = value;
    }

    public boolean isSetTokenize() {
        return (this.tokenize!= null);
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
