/**
 * AdCustomizerErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public class AdCustomizerErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdCustomizerErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COUNTDOWN_INVALID_DATE_FORMAT = "COUNTDOWN_INVALID_DATE_FORMAT";
    public static final java.lang.String _COUNTDOWN_DATE_IN_PAST = "COUNTDOWN_DATE_IN_PAST";
    public static final java.lang.String _COUNTDOWN_INVALID_LOCALE = "COUNTDOWN_INVALID_LOCALE";
    public static final java.lang.String _COUNTDOWN_INVALID_START_DAYS_BEFORE = "COUNTDOWN_INVALID_START_DAYS_BEFORE";
    public static final AdCustomizerErrorReason COUNTDOWN_INVALID_DATE_FORMAT = new AdCustomizerErrorReason(_COUNTDOWN_INVALID_DATE_FORMAT);
    public static final AdCustomizerErrorReason COUNTDOWN_DATE_IN_PAST = new AdCustomizerErrorReason(_COUNTDOWN_DATE_IN_PAST);
    public static final AdCustomizerErrorReason COUNTDOWN_INVALID_LOCALE = new AdCustomizerErrorReason(_COUNTDOWN_INVALID_LOCALE);
    public static final AdCustomizerErrorReason COUNTDOWN_INVALID_START_DAYS_BEFORE = new AdCustomizerErrorReason(_COUNTDOWN_INVALID_START_DAYS_BEFORE);
    public java.lang.String getValue() { return _value_;}
    public static AdCustomizerErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdCustomizerErrorReason enumeration = (AdCustomizerErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdCustomizerErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdCustomizerErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "AdCustomizerError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
