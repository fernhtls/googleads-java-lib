
package com.google.api.ads.adwords.jaxws.v201607.mcm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service to access basic details about any customer.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201607.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.mcm.ObjectFactory.class
})
public interface CustomerServiceInterface {


    /**
     * 
     *         Returns details of all the customers directly accessible by the user authenticating the call.
     *         <p>
     *         Following V201605, if {@code clientCustomerId} is specified in the request header,
     *         only details of that customer will be returned.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201607.mcm.Customer>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
    @RequestWrapper(localName = "getCustomers", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.CustomerServiceInterfacegetCustomers")
    @ResponseWrapper(localName = "getCustomersResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.CustomerServiceInterfacegetCustomersResponse")
    public List<Customer> getCustomers()
        throws ApiException
    ;

    /**
     * 
     *         Update the authorized customer.
     *         
     *         <p>While there are a limited set of properties available to update, please read this
     *         <a href="https://support.google.com/analytics/answer/1033981">help center article
     *         on auto-tagging</a> before updating {@code customer.autoTaggingEnabled}.
     *         
     *         @param customer the requested updated value for the customer.
     *         @throws ApiException
     *       
     * 
     * @param customer
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.mcm.Customer
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.CustomerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.CustomerServiceInterfacemutateResponse")
    public Customer mutate(
        @WebParam(name = "customer", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
        Customer customer)
        throws ApiException
    ;

}
