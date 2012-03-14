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
 *         &lt;element ref="{http://marklogic.com/appservices/search}parent"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}lat"/>
 *         &lt;element ref="{http://marklogic.com/appservices/search}lon"/>
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
    "parentOrLatOrLon"
})
public class GeoAttrPair {

    @XmlElementRefs({
        @XmlElementRef(name = "lon", namespace = "http://marklogic.com/appservices/search", type = Lon.class),
        @XmlElementRef(name = "heatmap", namespace = "http://marklogic.com/appservices/search", type = Heatmap.class),
        @XmlElementRef(name = "geo-option", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class),
        @XmlElementRef(name = "parent", namespace = "http://marklogic.com/appservices/search", type = Parent.class),
        @XmlElementRef(name = "facet-option", namespace = "http://marklogic.com/appservices/search", type = JAXBElement.class),
        @XmlElementRef(name = "lat", namespace = "http://marklogic.com/appservices/search", type = Lat.class)
    })
    protected List<Object> parentOrLatOrLon = new Vector<Object>();

    /**
     * Gets the value of the parentOrLatOrLon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentOrLatOrLon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentOrLatOrLon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parent }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Heatmap }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Lat }
     * {@link Lon }
     * 
     * 
     */
    public List<Object> getParentOrLatOrLon() {
        if (parentOrLatOrLon == null) {
            parentOrLatOrLon = new Vector<Object>();
        }
        return this.parentOrLatOrLon;
    }

    public boolean isSetParentOrLatOrLon() {
        return ((this.parentOrLatOrLon!= null)&&(!this.parentOrLatOrLon.isEmpty()));
    }

    public void unsetParentOrLatOrLon() {
        this.parentOrLatOrLon = null;
    }

}
