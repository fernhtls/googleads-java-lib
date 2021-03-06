/**
 * CampaignSharedSetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class CampaignSharedSetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignSharedSetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAMPAIGN_SHARED_SET_DOES_NOT_EXIST = "CAMPAIGN_SHARED_SET_DOES_NOT_EXIST";
    public static final java.lang.String _SHARED_SET_NOT_ACTIVE = "SHARED_SET_NOT_ACTIVE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CampaignSharedSetErrorReason CAMPAIGN_SHARED_SET_DOES_NOT_EXIST = new CampaignSharedSetErrorReason(_CAMPAIGN_SHARED_SET_DOES_NOT_EXIST);
    public static final CampaignSharedSetErrorReason SHARED_SET_NOT_ACTIVE = new CampaignSharedSetErrorReason(_SHARED_SET_NOT_ACTIVE);
    public static final CampaignSharedSetErrorReason UNKNOWN = new CampaignSharedSetErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CampaignSharedSetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignSharedSetErrorReason enumeration = (CampaignSharedSetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignSharedSetErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSharedSetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignSharedSetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
