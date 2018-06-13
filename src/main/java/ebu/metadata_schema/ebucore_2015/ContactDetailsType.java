
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.mikrosimage.xdmat.ebucore_2015.adapters.XmlDateAdapter;


/**
 *  To provide all the information necessary to contact and locate a person.
 * 			
 * 
 * <p>Classe Java pour contactDetailsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="contactDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="name" type="{urn:ebu:metadata-schema:ebuCore_2015}compoundNameType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;sequence>
 *             &lt;element name="givenName" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *             &lt;element name="familyName" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *             &lt;element name="otherGivenName" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="suffix" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *             &lt;element name="salutation" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="deathDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nickname" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="occupation" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *         &lt;element name="details" type="{urn:ebu:metadata-schema:ebuCore_2015}detailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stageName" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:ebu:metadata-schema:ebuCore_2015>elementType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="guest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gender" type="{urn:ebu:metadata-schema:ebuCore_2015}elementType" minOccurs="0"/>
 *         &lt;element name="relatedInformationLink" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="relatedContacts" type="{urn:ebu:metadata-schema:ebuCore_2015}entityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="skill" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="affiliation" type="{urn:ebu:metadata-schema:ebuCore_2015}affiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="contactId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDetailsType", propOrder = {
    "givenName",
    "familyName",
    "otherGivenNames",
    "suffix",
    "salutation",
    "names",
    "birthDate",
    "deathDate",
    "birthPlace",
    "deathPlace",
    "nationality",
    "usernames",
    "nicknames",
    "occupation",
    "details",
    "stageNames",
    "guest",
    "gender",
    "relatedInformationLinks",
    "relatedContacts",
    "skills",
    "affiliations"
})
public class ContactDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected ElementType givenName;
    protected ElementType familyName;
    @XmlElement(name = "otherGivenName")
    protected List<ElementType> otherGivenNames;
    protected ElementType suffix;
    protected ElementType salutation;
    @XmlElement(name = "name")
    protected List<CompoundNameType> names;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter .class)
    @XmlSchemaType(name = "date")
    protected Date birthDate;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter .class)
    @XmlSchemaType(name = "date")
    protected Date deathDate;
    protected java.lang.String birthPlace;
    protected java.lang.String deathPlace;
    protected java.lang.String nationality;
    @XmlElement(name = "username")
    protected List<ElementType> usernames;
    @XmlElement(name = "nickname")
    protected List<ElementType> nicknames;
    protected ElementType occupation;
    protected List<DetailsType> details;
    @XmlElement(name = "stageName")
    protected List<ContactDetailsType.StageName> stageNames;
    protected java.lang.Boolean guest;
    protected ElementType gender;
    @XmlElement(name = "relatedInformationLink")
    protected List<ContactDetailsType.RelatedInformationLink> relatedInformationLinks;
    protected List<EntityType> relatedContacts;
    @XmlElement(name = "skill")
    protected List<java.lang.String> skills;
    @XmlElement(name = "affiliation")
    protected List<AffiliationType> affiliations;
    @XmlAttribute(name = "contactId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String contactId;
    @XmlAttribute(name = "lastUpdate")
    @XmlJavaTypeAdapter(XmlDateAdapter .class)
    @XmlSchemaType(name = "date")
    protected Date lastUpdate;
    @XmlAttribute(name = "typeLabel")
    protected java.lang.String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected java.lang.String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String typeLink;
    @XmlAttribute(name = "typeSource")
    protected java.lang.String typeSource;
    @XmlAttribute(name = "typeNamespace")
    protected java.lang.String typeNamespace;
    @XmlAttribute(name = "typeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String typeLanguage;

    /**
     * Obtient la valeur de la propriété givenName.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getGivenName() {
        return givenName;
    }

    /**
     * Définit la valeur de la propriété givenName.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setGivenName(ElementType value) {
        this.givenName = value;
    }

    /**
     * Obtient la valeur de la propriété familyName.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getFamilyName() {
        return familyName;
    }

    /**
     * Définit la valeur de la propriété familyName.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setFamilyName(ElementType value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the otherGivenNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherGivenNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherGivenNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getOtherGivenNames() {
        if (otherGivenNames == null) {
            otherGivenNames = new ArrayList<>();
        }
        return this.otherGivenNames;
    }

    /**
     * Obtient la valeur de la propriété suffix.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getSuffix() {
        return suffix;
    }

    /**
     * Définit la valeur de la propriété suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setSuffix(ElementType value) {
        this.suffix = value;
    }

    /**
     * Obtient la valeur de la propriété salutation.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getSalutation() {
        return salutation;
    }

    /**
     * Définit la valeur de la propriété salutation.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setSalutation(ElementType value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompoundNameType }
     * 
     * 
     */
    public List<CompoundNameType> getNames() {
        if (names == null) {
            names = new ArrayList<>();
        }
        return this.names;
    }

    /**
     * Obtient la valeur de la propriété birthDate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Définit la valeur de la propriété birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
    }

    /**
     * Obtient la valeur de la propriété deathDate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Date getDeathDate() {
        return deathDate;
    }

    /**
     * Définit la valeur de la propriété deathDate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDeathDate(Date value) {
        this.deathDate = value;
    }

    /**
     * Obtient la valeur de la propriété birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Définit la valeur de la propriété birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBirthPlace(java.lang.String value) {
        this.birthPlace = value;
    }

    /**
     * Obtient la valeur de la propriété deathPlace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDeathPlace() {
        return deathPlace;
    }

    /**
     * Définit la valeur de la propriété deathPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDeathPlace(java.lang.String value) {
        this.deathPlace = value;
    }

    /**
     * Obtient la valeur de la propriété nationality.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNationality() {
        return nationality;
    }

    /**
     * Définit la valeur de la propriété nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNationality(java.lang.String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the usernames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usernames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsernames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getUsernames() {
        if (usernames == null) {
            usernames = new ArrayList<>();
        }
        return this.usernames;
    }

    /**
     * Gets the value of the nicknames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicknames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNicknames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getNicknames() {
        if (nicknames == null) {
            nicknames = new ArrayList<>();
        }
        return this.nicknames;
    }

    /**
     * Obtient la valeur de la propriété occupation.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getOccupation() {
        return occupation;
    }

    /**
     * Définit la valeur de la propriété occupation.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setOccupation(ElementType value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsType }
     * 
     * 
     */
    public List<DetailsType> getDetails() {
        if (details == null) {
            details = new ArrayList<>();
        }
        return this.details;
    }

    /**
     * Gets the value of the stageNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stageNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStageNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetailsType.StageName }
     * 
     * 
     */
    public List<ContactDetailsType.StageName> getStageNames() {
        if (stageNames == null) {
            stageNames = new ArrayList<>();
        }
        return this.stageNames;
    }

    /**
     * Obtient la valeur de la propriété guest.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isGuest() {
        return guest;
    }

    /**
     * Définit la valeur de la propriété guest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setGuest(java.lang.Boolean value) {
        this.guest = value;
    }

    /**
     * Obtient la valeur de la propriété gender.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getGender() {
        return gender;
    }

    /**
     * Définit la valeur de la propriété gender.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setGender(ElementType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the relatedInformationLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedInformationLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedInformationLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetailsType.RelatedInformationLink }
     * 
     * 
     */
    public List<ContactDetailsType.RelatedInformationLink> getRelatedInformationLinks() {
        if (relatedInformationLinks == null) {
            relatedInformationLinks = new ArrayList<>();
        }
        return this.relatedInformationLinks;
    }

    /**
     * Gets the value of the relatedContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityType }
     * 
     * 
     */
    public List<EntityType> getRelatedContacts() {
        if (relatedContacts == null) {
            relatedContacts = new ArrayList<>();
        }
        return this.relatedContacts;
    }

    /**
     * Gets the value of the skills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkills().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getSkills() {
        if (skills == null) {
            skills = new ArrayList<>();
        }
        return this.skills;
    }

    /**
     * Gets the value of the affiliations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationType }
     * 
     * 
     */
    public List<AffiliationType> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<>();
        }
        return this.affiliations;
    }

    /**
     * Obtient la valeur de la propriété contactId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContactId() {
        return contactId;
    }

    /**
     * Définit la valeur de la propriété contactId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContactId(java.lang.String value) {
        this.contactId = value;
    }

    /**
     * Obtient la valeur de la propriété lastUpdate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Définit la valeur de la propriété lastUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLastUpdate(Date value) {
        this.lastUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété typeLabel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLabel() {
        return typeLabel;
    }

    /**
     * Définit la valeur de la propriété typeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLabel(java.lang.String value) {
        this.typeLabel = value;
    }

    /**
     * Obtient la valeur de la propriété typeDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * Définit la valeur de la propriété typeDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeDefinition(java.lang.String value) {
        this.typeDefinition = value;
    }

    /**
     * Obtient la valeur de la propriété typeLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLink() {
        return typeLink;
    }

    /**
     * Définit la valeur de la propriété typeLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLink(java.lang.String value) {
        this.typeLink = value;
    }

    /**
     * Obtient la valeur de la propriété typeSource.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeSource() {
        return typeSource;
    }

    /**
     * Définit la valeur de la propriété typeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeSource(java.lang.String value) {
        this.typeSource = value;
    }

    /**
     * Obtient la valeur de la propriété typeNamespace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Définit la valeur de la propriété typeNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeNamespace(java.lang.String value) {
        this.typeNamespace = value;
    }

    /**
     * Obtient la valeur de la propriété typeLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * Définit la valeur de la propriété typeLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RelatedInformationLink
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String value;
        @XmlAttribute(name = "typeLabel")
        protected java.lang.String typeLabel;
        @XmlAttribute(name = "typeDefinition")
        protected java.lang.String typeDefinition;
        @XmlAttribute(name = "typeLink")
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String typeLink;
        @XmlAttribute(name = "typeSource")
        protected java.lang.String typeSource;
        @XmlAttribute(name = "typeNamespace")
        protected java.lang.String typeNamespace;
        @XmlAttribute(name = "typeLanguage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected java.lang.String typeLanguage;

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValue(java.lang.String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propriété typeLabel.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLabel() {
            return typeLabel;
        }

        /**
         * Définit la valeur de la propriété typeLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLabel(java.lang.String value) {
            this.typeLabel = value;
        }

        /**
         * Obtient la valeur de la propriété typeDefinition.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeDefinition() {
            return typeDefinition;
        }

        /**
         * Définit la valeur de la propriété typeDefinition.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeDefinition(java.lang.String value) {
            this.typeDefinition = value;
        }

        /**
         * Obtient la valeur de la propriété typeLink.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLink() {
            return typeLink;
        }

        /**
         * Définit la valeur de la propriété typeLink.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLink(java.lang.String value) {
            this.typeLink = value;
        }

        /**
         * Obtient la valeur de la propriété typeSource.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeSource() {
            return typeSource;
        }

        /**
         * Définit la valeur de la propriété typeSource.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeSource(java.lang.String value) {
            this.typeSource = value;
        }

        /**
         * Obtient la valeur de la propriété typeNamespace.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeNamespace() {
            return typeNamespace;
        }

        /**
         * Définit la valeur de la propriété typeNamespace.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeNamespace(java.lang.String value) {
            this.typeNamespace = value;
        }

        /**
         * Obtient la valeur de la propriété typeLanguage.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLanguage() {
            return typeLanguage;
        }

        /**
         * Définit la valeur de la propriété typeLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLanguage(java.lang.String value) {
            this.typeLanguage = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:ebu:metadata-schema:ebuCore_2015>elementType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StageName
        extends ElementType
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "typeLabel")
        protected java.lang.String typeLabel;
        @XmlAttribute(name = "typeDefinition")
        protected java.lang.String typeDefinition;
        @XmlAttribute(name = "typeLink")
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String typeLink;
        @XmlAttribute(name = "typeSource")
        protected java.lang.String typeSource;
        @XmlAttribute(name = "typeNamespace")
        protected java.lang.String typeNamespace;
        @XmlAttribute(name = "typeLanguage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected java.lang.String typeLanguage;

        /**
         * Obtient la valeur de la propriété typeLabel.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLabel() {
            return typeLabel;
        }

        /**
         * Définit la valeur de la propriété typeLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLabel(java.lang.String value) {
            this.typeLabel = value;
        }

        /**
         * Obtient la valeur de la propriété typeDefinition.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeDefinition() {
            return typeDefinition;
        }

        /**
         * Définit la valeur de la propriété typeDefinition.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeDefinition(java.lang.String value) {
            this.typeDefinition = value;
        }

        /**
         * Obtient la valeur de la propriété typeLink.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLink() {
            return typeLink;
        }

        /**
         * Définit la valeur de la propriété typeLink.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLink(java.lang.String value) {
            this.typeLink = value;
        }

        /**
         * Obtient la valeur de la propriété typeSource.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeSource() {
            return typeSource;
        }

        /**
         * Définit la valeur de la propriété typeSource.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeSource(java.lang.String value) {
            this.typeSource = value;
        }

        /**
         * Obtient la valeur de la propriété typeNamespace.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeNamespace() {
            return typeNamespace;
        }

        /**
         * Définit la valeur de la propriété typeNamespace.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeNamespace(java.lang.String value) {
            this.typeNamespace = value;
        }

        /**
         * Obtient la valeur de la propriété typeLanguage.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTypeLanguage() {
            return typeLanguage;
        }

        /**
         * Définit la valeur de la propriété typeLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTypeLanguage(java.lang.String value) {
            this.typeLanguage = value;
        }

    }

}
