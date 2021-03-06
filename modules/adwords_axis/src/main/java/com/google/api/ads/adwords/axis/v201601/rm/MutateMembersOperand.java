/**
 * MutateMembersOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.rm;


/**
 * Operand containing user list id and members to be added or removed.
 */
public class MutateMembersOperand  implements java.io.Serializable {
    /* The id of the user list.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long userListId;

    /* The data type indicating the type of member data entity in
     *                 {@code members} list. If it's not specified, it'll
     * default to
     *                 {@link DataType#EMAIL_SHA256}. */
    private com.google.api.ads.adwords.axis.v201601.rm.MutateMembersOperandDataType dataType;

    /* A list of members to be added or removed.
     *                 
     *                 <p>Each element in members list should be in format
     * according to the specified
     *                 {@code dataType}.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1. The maximum size of this collection
     * is 10000.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String[] members;

    public MutateMembersOperand() {
    }

    public MutateMembersOperand(
           java.lang.Long userListId,
           com.google.api.ads.adwords.axis.v201601.rm.MutateMembersOperandDataType dataType,
           java.lang.String[] members) {
           this.userListId = userListId;
           this.dataType = dataType;
           this.members = members;
    }


    /**
     * Gets the userListId value for this MutateMembersOperand.
     * 
     * @return userListId   * The id of the user list.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getUserListId() {
        return userListId;
    }


    /**
     * Sets the userListId value for this MutateMembersOperand.
     * 
     * @param userListId   * The id of the user list.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setUserListId(java.lang.Long userListId) {
        this.userListId = userListId;
    }


    /**
     * Gets the dataType value for this MutateMembersOperand.
     * 
     * @return dataType   * The data type indicating the type of member data entity in
     *                 {@code members} list. If it's not specified, it'll
     * default to
     *                 {@link DataType#EMAIL_SHA256}.
     */
    public com.google.api.ads.adwords.axis.v201601.rm.MutateMembersOperandDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this MutateMembersOperand.
     * 
     * @param dataType   * The data type indicating the type of member data entity in
     *                 {@code members} list. If it's not specified, it'll
     * default to
     *                 {@link DataType#EMAIL_SHA256}.
     */
    public void setDataType(com.google.api.ads.adwords.axis.v201601.rm.MutateMembersOperandDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the members value for this MutateMembersOperand.
     * 
     * @return members   * A list of members to be added or removed.
     *                 
     *                 <p>Each element in members list should be in format
     * according to the specified
     *                 {@code dataType}.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1. The maximum size of this collection
     * is 10000.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this MutateMembersOperand.
     * 
     * @param members   * A list of members to be added or removed.
     *                 
     *                 <p>Each element in members list should be in format
     * according to the specified
     *                 {@code dataType}.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1. The maximum size of this collection
     * is 10000.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setMembers(java.lang.String[] members) {
        this.members = members;
    }

    public java.lang.String getMembers(int i) {
        return this.members[i];
    }

    public void setMembers(int i, java.lang.String _value) {
        this.members[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MutateMembersOperand)) return false;
        MutateMembersOperand other = (MutateMembersOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userListId==null && other.getUserListId()==null) || 
             (this.userListId!=null &&
              this.userListId.equals(other.getUserListId()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserListId() != null) {
            _hashCode += getUserListId().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MutateMembersOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "MutateMembersOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "userListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "MutateMembersOperand.DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
