//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.23 at 05:29:32 PM CEST 
//


package ebu.metadata_schema.ebucore_2014;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import eu.mikrosimage.xdmat.ebucore_2014.helpers.AudioContentTypeHelper;
import eu.mikrosimage.xdmat.ebucore_2014.helpers.AudioObjectTypeHelper;
import eu.mikrosimage.xdmat.ebucore_2014.helpers.AudioProgrammeTypeHelper;
import eu.mikrosimage.xdmat.ebucore_2014.helpers.AudioTrackFormatTypeHelper;
import eu.mikrosimage.xdmat.ebucore_2014.helpers.AudioTrackUIDTypeHelper;


/**
 * A container with all definitions related to the audioContents and
 * 				associated components contained in the material. The extended audio format is
 * 				specified in details in Tech.3364. 
 * 
 * <p>Java class for audioFormatExtendedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioFormatExtendedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioProgramme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioPackFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioChannelFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioBlockFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioStreamFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioTrackFormat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2014}audioTrackUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioFormatExtendedID" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="audioFormatExtendedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatExtendedDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatExtendedVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatExtendedPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioFormatExtendedType", propOrder = {
		"audioProgramme",
		"audioContent",
		"audioObject",
		"audioPackFormat",
		"audioChannelFormat",
		"audioBlockFormat",
		"audioStreamFormat",
		"audioTrackFormat",
		"audioTrackUID"
})
public class AudioFormatExtendedType {

	protected SortedSet<AudioProgrammeType> audioProgramme;
	protected Set<AudioContentType> audioContent;
	protected Set<AudioObjectType> audioObject;
	protected Set<AudioPackFormatType> audioPackFormat;
	protected Set<AudioChannelFormatType> audioChannelFormat;
	protected Set<AudioBlockFormatType> audioBlockFormat;
	protected Set<AudioStreamFormatType> audioStreamFormat;
	protected Set<AudioTrackFormatType> audioTrackFormat;
	protected Set<AudioTrackUIDType> audioTrackUID;
	@XmlAttribute(name = "audioFormatExtendedID")
	@XmlSchemaType(name = "anyURI")
	protected java.lang.String audioFormatExtendedID;
	@XmlAttribute(name = "audioFormatExtendedName")
	protected java.lang.String audioFormatExtendedName;
	@XmlAttribute(name = "audioFormatExtendedDefinition")
	protected java.lang.String audioFormatExtendedDefinition;
	@XmlAttribute(name = "audioFormatExtendedVersion")
	protected java.lang.String audioFormatExtendedVersion;
	@XmlAttribute(name = "audioFormatExtendedPresenceFlag")
	protected java.lang.String audioFormatExtendedPresenceFlag;

	/**
	 * 
	 */
	public AudioFormatExtendedType() {
		audioProgramme = new TreeSet<AudioProgrammeType>(new Comparator<AudioProgrammeType>() {
			@Override
			public int compare(AudioProgrammeType arg0,
					AudioProgrammeType arg1) {
				int audioProgrammeIndexFromId0 = AudioProgrammeTypeHelper.getAudioProgrammeIndexFromId(arg0.getAudioProgrammeID());
				int audioProgrammeIndexFromId1 = AudioProgrammeTypeHelper.getAudioProgrammeIndexFromId(arg1.getAudioProgrammeID());
				return audioProgrammeIndexFromId0 - audioProgrammeIndexFromId1; 
			}
		});
		audioContent = new TreeSet<AudioContentType>(new Comparator<AudioContentType>() {
			@Override
			public int compare(AudioContentType arg0,
					AudioContentType arg1) {
				return AudioContentTypeHelper.getAudioContentIndexFromId(arg0.getAudioContentID()) - 
						AudioContentTypeHelper.getAudioContentIndexFromId(arg1.getAudioContentID());
			}
		});
		audioObject = new TreeSet<AudioObjectType>(new Comparator<AudioObjectType>() {
			@Override
			public int compare(AudioObjectType arg0,
					AudioObjectType arg1) {
				return AudioObjectTypeHelper.getAudioObjectIndexFromId(arg0.getAudioObjectID()) - 
						AudioObjectTypeHelper.getAudioObjectIndexFromId(arg1.getAudioObjectID());
			}
		});
		audioPackFormat = new TreeSet<AudioPackFormatType>(new Comparator<AudioPackFormatType>() {
			@Override
			public int compare(AudioPackFormatType arg0,
					AudioPackFormatType arg1) {
				return arg0.getAudioPackFormatID().compareTo(arg1.getAudioPackFormatID());
			}
		});
		audioChannelFormat = new TreeSet<AudioChannelFormatType>(new Comparator<AudioChannelFormatType>() {
			@Override
			public int compare(AudioChannelFormatType arg0,
					AudioChannelFormatType arg1) {
				return arg0.getAudioChannelFormatID().compareTo(arg1.getAudioChannelFormatID());
			}
		});
		audioBlockFormat = new TreeSet<AudioBlockFormatType>(new Comparator<AudioBlockFormatType>() {
			@Override
			public int compare(AudioBlockFormatType arg0,
					AudioBlockFormatType arg1) {
				return arg0.getAudioBlockFormatID().compareTo(arg1.getAudioBlockFormatID());
			}
		});
		audioStreamFormat = new HashSet<AudioStreamFormatType>();
		audioStreamFormat = new TreeSet<AudioStreamFormatType>(new Comparator<AudioStreamFormatType>() {
			@Override
			public int compare(AudioStreamFormatType arg0,
					AudioStreamFormatType arg1) {
				return arg0.getAudioStreamFormatID().compareTo(arg1.getAudioStreamFormatID());
			}
		});
		audioTrackFormat = new TreeSet<AudioTrackFormatType>(new Comparator<AudioTrackFormatType>() {
			@Override
			public int compare(AudioTrackFormatType o1,
					AudioTrackFormatType o2) {
				return AudioTrackFormatTypeHelper.getAudioTrackFormatIndexFromId(o1.getAudioTrackFormatID()) - 
						AudioTrackFormatTypeHelper.getAudioTrackFormatIndexFromId(o2.getAudioTrackFormatID()); 
			}
		});
		audioTrackUID = new TreeSet<AudioTrackUIDType>(new Comparator<AudioTrackUIDType>() {
			@Override
			public int compare(AudioTrackUIDType o1, AudioTrackUIDType o2) {
				int index1 = AudioTrackUIDTypeHelper.getAudioTrackIndexFromUid(o1.getUID());
				int index2 = AudioTrackUIDTypeHelper.getAudioTrackIndexFromUid(o2.getUID());
				return index1-index2;
			}
		});
	}

	/**
	 * One pack of programmes associated with the
	 * 						material Gets the value of the audioProgramme property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioProgramme property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioProgramme().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioProgrammeType }
	 * 
	 * 
	 */
	public Set<AudioProgrammeType> getAudioProgramme() {
		return this.audioProgramme;
	}

	/**
	 * One or more audioContents associated with an audioProgramme.
	 * 						audioContent are objects with the actual audio.Gets the value of the audioContent property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioContent property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioContent().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioContentType }
	 * 
	 * 
	 */
	public Set<AudioContentType> getAudioContent() {
		return this.audioContent;
	}

	/**
	 * An audioPack with time limited properties. Gets the value of the audioObject property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioObject property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioObject().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioObjectType }
	 * 
	 * 
	 */
	public Set<AudioObjectType> getAudioObject() {
		return this.audioObject;
	}

	/**
	 * A set of audioChannels that belong together.Gets the value of the audioPackFormat property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioPackFormat property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioPackFormat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioPackFormatType }
	 * 
	 * 
	 */
	public Set<AudioPackFormatType> getAudioPackFormat() {
		return this.audioPackFormat;
	}

	/**
	 * A single sequence of audio samples.Gets the value of the audioChannelFormat property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioChannelFormat property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioChannelFormat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioChannelFormatType }
	 * 
	 * 
	 */
	public Set<AudioChannelFormatType> getAudioChannelFormat() {
		return this.audioChannelFormat;
	}

	/**
	 * A division of an audioChannel in time Gets the value of the audioBlockFormat property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioBlockFormat property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioBlockFormat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioBlockFormatType }
	 * 
	 * 
	 */
	public Set<AudioBlockFormatType> getAudioBlockFormat() {
		return this.audioBlockFormat;
	}

	/**
	 *  A combination of one or more tracks required to represent a
	 * 						channel, an object, or a group.Gets the value of the audioStreamFormat property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioStreamFormat property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioStreamFormat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioStreamFormatType }
	 * 
	 * 
	 */
	public Set<AudioStreamFormatType> getAudioStreamFormat() {
		return this.audioStreamFormat;
	}

	/**
	 * A single set of samples of data in the storage medium.
	 * 					Gets the value of the audioTrackFormat property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioTrackFormat property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioTrackFormat().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioTrackFormatType }
	 * 
	 * 
	 */
	public Set<AudioTrackFormatType> getAudioTrackFormat() {
		return this.audioTrackFormat;
	}

	/**
	 * The UID of a track in the file. Gets the value of the audioTrackUID property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the audioTrackUID property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAudioTrackUID().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AudioTrackUIDType }
	 * 
	 * 
	 */
	public Set<AudioTrackUIDType> getAudioTrackUID() {
		return this.audioTrackUID;
	}

	/**
	 * Gets the value of the audioFormatExtendedID property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link java.lang.String }
	 *     
	 */
	public java.lang.String getAudioFormatExtendedID() {
		return audioFormatExtendedID;
	}

	/**
	 * Sets the value of the audioFormatExtendedID property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link java.lang.String }
	 *     
	 */
	public void setAudioFormatExtendedID(java.lang.String value) {
		this.audioFormatExtendedID = value;
	}

	/**
	 * Gets the value of the audioFormatExtendedName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link java.lang.String }
	 *     
	 */
	public java.lang.String getAudioFormatExtendedName() {
		return audioFormatExtendedName;
	}

	/**
	 * Sets the value of the audioFormatExtendedName property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link java.lang.String }
	 *     
	 */
	public void setAudioFormatExtendedName(java.lang.String value) {
		this.audioFormatExtendedName = value;
	}

	/**
	 * Gets the value of the audioFormatExtendedDefinition property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link java.lang.String }
	 *     
	 */
	public java.lang.String getAudioFormatExtendedDefinition() {
		return audioFormatExtendedDefinition;
	}

	/**
	 * Sets the value of the audioFormatExtendedDefinition property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link java.lang.String }
	 *     
	 */
	public void setAudioFormatExtendedDefinition(java.lang.String value) {
		this.audioFormatExtendedDefinition = value;
	}

	/**
	 * Gets the value of the audioFormatExtendedVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link java.lang.String }
	 *     
	 */
	public java.lang.String getAudioFormatExtendedVersion() {
		return audioFormatExtendedVersion;
	}

	/**
	 * Sets the value of the audioFormatExtendedVersion property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link java.lang.String }
	 *     
	 */
	public void setAudioFormatExtendedVersion(java.lang.String value) {
		this.audioFormatExtendedVersion = value;
	}

	/**
	 * Gets the value of the audioFormatExtendedPresenceFlag property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link java.lang.String }
	 *     
	 */
	public java.lang.String getAudioFormatExtendedPresenceFlag() {
		return audioFormatExtendedPresenceFlag;
	}

	/**
	 * Sets the value of the audioFormatExtendedPresenceFlag property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link java.lang.String }
	 *     
	 */
	public void setAudioFormatExtendedPresenceFlag(java.lang.String value) {
		this.audioFormatExtendedPresenceFlag = value;
	}

}
