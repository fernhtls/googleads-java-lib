/**
 * ManagedCustomerServiceError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.mcm;


/**
 * Error for {@link ManagedCustomerService}
 */
public class ManagedCustomerServiceError  extends com.google.api.ads.adwords.axis.v201607.cm.ApiError  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomerServiceErrorReason reason;

    /* The list of customer ids associated with the error. */
    private long[] customerIds;

    public ManagedCustomerServiceError() {
    }

    public ManagedCustomerServiceError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomerServiceErrorReason reason,
           long[] customerIds) {
        super(
            fieldPath,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.customerIds = customerIds;
    }


    /**
     * Gets the reason value for this ManagedCustomerServiceError.
     * 
     * @return reason
     */
    public com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomerServiceErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ManagedCustomerServiceError.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomerServiceErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the customerIds value for this ManagedCustomerServiceError.
     * 
     * @return customerIds   * The list of customer ids associated with the error.
     */
    public long[] getCustomerIds() {
        return customerIds;
    }


    /**
     * Sets the customerIds value for this ManagedCustomerServiceError.
     * 
     * @param customerIds   * The list of customer ids associated with the error.
     */
    public void setCustomerIds(long[] customerIds) {
        this.customerIds = customerIds;
    }

    public long getCustomerIds(int i) {
        return this.customerIds[i];
    }

    public void setCustomerIds(int i, long _value) {
        this.customerIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCustomerServiceError)) return false;
        ManagedCustomerServiceError other = (ManagedCustomerServiceError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.customerIds==null && other.getCustomerIds()==null) || 
             (this.customerIds!=null &&
              java.util.Arrays.equals(this.customerIds, other.getCustomerIds())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getCustomerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerIds(), i);
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
        new org.apache.axis.description.TypeDesc(ManagedCustomerServiceError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201607", "ManagedCustomerServiceError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201607", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201607", "ManagedCustomerServiceError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201607", "customerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
