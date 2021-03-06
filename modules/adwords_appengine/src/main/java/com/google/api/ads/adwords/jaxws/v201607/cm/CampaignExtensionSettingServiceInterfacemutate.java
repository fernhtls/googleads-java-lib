
package com.google.api.ads.adwords.jaxws.v201607.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies the list of mutate operations (add, remove, and set).
 *             
 *             <p> Beginning in v201509, add and set operations are treated identically. Performing an add
 *             operation on a campaign with an existing ExtensionSetting will cause the operation to be
 *             treated like a set operation. Performing a set operation on a campaign with no
 *             ExtensionSetting will cause the operation to be treated like an add operation.
 *             
 *             @param operations The operations to apply. The same {@link CampaignExtensionSetting} cannot be
 *             specified in more than one operation.
 *             @return The changed {@link CampaignExtensionSetting}s.
 *             @throws ApiException Indicates a problem with the request.
 *           
 * 
 * <p>Java class for mutate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201607}CampaignExtensionSettingOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations"
})
@XmlRootElement(name = "mutate")
public class CampaignExtensionSettingServiceInterfacemutate {

    protected List<CampaignExtensionSettingOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignExtensionSettingOperation }
     * 
     * 
     */
    public List<CampaignExtensionSettingOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<CampaignExtensionSettingOperation>();
        }
        return this.operations;
    }

}
