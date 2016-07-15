
package ebu.metadata_schema.ebucore_2015;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to provide information on ancillary data format and purpose. This
 * 				type provides information on the Ancillary Data packet type. See SMPTE 291M, SMPTE
 * 				436M
 * 
 * <p>Java class for ancillaryDataFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ancillaryDataFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SDID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wrappingType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ancillaryDataFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="ancillaryDataFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ancillaryDataFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ancillaryDataFormatType", propOrder = {
    "did",
    "sdid",
    "lineNumber",
    "wrappingType"
})
public class AncillaryDataFormatType {

    @XmlElement(name = "DID")
    protected BigInteger did;
    @XmlElement(name = "SDID")
    protected BigInteger sdid;
    protected List<BigInteger> lineNumber;
    protected BigInteger wrappingType;
    @XmlAttribute(name = "ancillaryDataFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String ancillaryDataFormatId;
    @XmlAttribute(name = "ancillaryDataFormatName")
    protected java.lang.String ancillaryDataFormatName;
    @XmlAttribute(name = "ancillaryDataFormatProfile")
    protected java.lang.String ancillaryDataFormatProfile;

    /**
     * Gets the value of the did property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDID() {
        return did;
    }

    /**
     * Sets the value of the did property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDID(BigInteger value) {
        this.did = value;
    }

    /**
     * Gets the value of the sdid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSDID() {
        return sdid;
    }

    /**
     * Sets the value of the sdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSDID(BigInteger value) {
        this.sdid = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLineNumber() {
        if (lineNumber == null) {
            lineNumber = new ArrayList<>();
        }
        return this.lineNumber;
    }

    /**
     * Gets the value of the wrappingType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWrappingType() {
        return wrappingType;
    }

    /**
     * Sets the value of the wrappingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWrappingType(BigInteger value) {
        this.wrappingType = value;
    }

    /**
     * Gets the value of the ancillaryDataFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAncillaryDataFormatId() {
        return ancillaryDataFormatId;
    }

    /**
     * Sets the value of the ancillaryDataFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAncillaryDataFormatId(java.lang.String value) {
        this.ancillaryDataFormatId = value;
    }

    /**
     * Gets the value of the ancillaryDataFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAncillaryDataFormatName() {
        return ancillaryDataFormatName;
    }

    /**
     * Sets the value of the ancillaryDataFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAncillaryDataFormatName(java.lang.String value) {
        this.ancillaryDataFormatName = value;
    }

    /**
     * Gets the value of the ancillaryDataFormatProfile property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAncillaryDataFormatProfile() {
        return ancillaryDataFormatProfile;
    }

    /**
     * Sets the value of the ancillaryDataFormatProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAncillaryDataFormatProfile(java.lang.String value) {
        this.ancillaryDataFormatProfile = value;
    }

}
