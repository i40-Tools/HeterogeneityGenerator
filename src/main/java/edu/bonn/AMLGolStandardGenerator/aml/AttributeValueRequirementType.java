//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.29 at 09:03:38 PM EEST 
//


package edu.bonn.AMLGolStandardGenerator.aml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import edu.bonn.AMLGolStandardGenerator.aml.AttributeValueRequirementType.NominalScaledType;
import edu.bonn.AMLGolStandardGenerator.aml.AttributeValueRequirementType.OrdinalScaledType;
import edu.bonn.AMLGolStandardGenerator.aml.AttributeValueRequirementType.UnknownType;


/**
 * Defines base structures for definition of value requirements of an attribute.
 * 
 * <p>Java class for AttributeValueRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeValueRequirementType">
 *   &lt;complexContent>
 *     &lt;extension base="{}CAEXBasicObject">
 *       &lt;choice>
 *         &lt;element name="OrdinalScaledType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="RequiredMaxValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="RequiredMinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NominalScaledType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnknownType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Requirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeValueRequirementType", propOrder = {
    "ordinalScaledType",
    "nominalScaledType",
    "unknownType"
})
public class AttributeValueRequirementType
    extends CAEXBasicObject
{

    @XmlElement(name = "OrdinalScaledType")
    protected OrdinalScaledType ordinalScaledType;
    @XmlElement(name = "NominalScaledType")
    protected NominalScaledType nominalScaledType;
    @XmlElement(name = "UnknownType")
    protected UnknownType unknownType;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the ordinalScaledType property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinalScaledType }
     *     
     */
    public OrdinalScaledType getOrdinalScaledType() {
        return ordinalScaledType;
    }

    /**
     * Sets the value of the ordinalScaledType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinalScaledType }
     *     
     */
    public void setOrdinalScaledType(OrdinalScaledType value) {
        this.ordinalScaledType = value;
    }

    /**
     * Gets the value of the nominalScaledType property.
     * 
     * @return
     *     possible object is
     *     {@link NominalScaledType }
     *     
     */
    public NominalScaledType getNominalScaledType() {
        return nominalScaledType;
    }

    /**
     * Sets the value of the nominalScaledType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NominalScaledType }
     *     
     */
    public void setNominalScaledType(NominalScaledType value) {
        this.nominalScaledType = value;
    }

    /**
     * Gets the value of the unknownType property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownType }
     *     
     */
    public UnknownType getUnknownType() {
        return unknownType;
    }

    /**
     * Sets the value of the unknownType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownType }
     *     
     */
    public void setUnknownType(UnknownType value) {
        this.unknownType = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requiredValue"
    })
    public static class NominalScaledType {

        @XmlElement(name = "RequiredValue", required = true)
        protected List<Object> requiredValue;

        /**
         * Gets the value of the requiredValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiredValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRequiredValue() {
            if (requiredValue == null) {
                requiredValue = new ArrayList<Object>();
            }
            return this.requiredValue;
        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="RequiredMaxValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="RequiredValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="RequiredMinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requiredMaxValue",
        "requiredValue",
        "requiredMinValue"
    })
    public static class OrdinalScaledType {

        @XmlElement(name = "RequiredMaxValue")
        protected Object requiredMaxValue;
        @XmlElement(name = "RequiredValue")
        protected Object requiredValue;
        @XmlElement(name = "RequiredMinValue")
        protected Object requiredMinValue;

        /**
         * Gets the value of the requiredMaxValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRequiredMaxValue() {
            return requiredMaxValue;
        }

        /**
         * Sets the value of the requiredMaxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRequiredMaxValue(Object value) {
            this.requiredMaxValue = value;
        }

        /**
         * Gets the value of the requiredValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRequiredValue() {
            return requiredValue;
        }

        /**
         * Sets the value of the requiredValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRequiredValue(Object value) {
            this.requiredValue = value;
        }

        /**
         * Gets the value of the requiredMinValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRequiredMinValue() {
            return requiredMinValue;
        }

        /**
         * Sets the value of the requiredMinValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRequiredMinValue(Object value) {
            this.requiredMinValue = value;
        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="Requirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requirements"
    })
    public static class UnknownType {

        @XmlElement(name = "Requirements")
        protected String requirements;

        /**
         * Gets the value of the requirements property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequirements() {
            return requirements;
        }

        /**
         * Sets the value of the requirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequirements(String value) {
            this.requirements = value;
        }

    }

}
