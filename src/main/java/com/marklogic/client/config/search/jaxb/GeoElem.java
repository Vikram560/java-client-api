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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://marklogic.com/appservices/search}parent"/>
 *         &lt;element name="element">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ns" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://marklogic.com/appservices/search}facet-option"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}geo-option"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}heatmap"/>
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
    "parentOrElementOrFacetOption"
})
public class GeoElem {

    @XmlElementRefs({
        @XmlElementRef(name = "heatmap", namespace = "http://marklogic.com/appservices/search", type = Heatmap.class),
        @XmlElementRef(name = "geo-option", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class),
        @XmlElementRef(name = "parent", namespace = "http://marklogic.com/appservices/search", type = Parent.class),
        @XmlElementRef(name = "facet-option", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class),
        @XmlElementRef(name = "element", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class)
    })
    protected List<Object> parentOrElementOrFacetOption = new Vector<Object>();

    /**
     * Gets the value of the parentOrElementOrFacetOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentOrElementOrFacetOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentOrElementOrFacetOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parent }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Heatmap }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoElem.Element }{@code >}
     * 
     * 
     */
    public List<Object> getParentOrElementOrFacetOption() {
        if (parentOrElementOrFacetOption == null) {
            parentOrElementOrFacetOption = new Vector<Object>();
        }
        return this.parentOrElementOrFacetOption;
    }

    public boolean isSetParentOrElementOrFacetOption() {
        return ((this.parentOrElementOrFacetOption!= null)&&(!this.parentOrElementOrFacetOption.isEmpty()));
    }

    public void unsetParentOrElementOrFacetOption() {
        this.parentOrElementOrFacetOption = null;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ns" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Element {

        @XmlAttribute(name = "ns", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String ns;
        @XmlAttribute(name = "name", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String name;

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        public boolean isSetName() {
            return (this.name!= null);
        }

    }

}
