
package com.google.api.ads.dfp.jaxws.v201505;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SharedAdUnitService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201505/SharedAdUnitService?wsdl")
public class SharedAdUnitService
    extends Service
{

    private final static URL SHAREDADUNITSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHAREDADUNITSERVICE_EXCEPTION;
    private final static QName SHAREDADUNITSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201505", "SharedAdUnitService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201505/SharedAdUnitService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHAREDADUNITSERVICE_WSDL_LOCATION = url;
        SHAREDADUNITSERVICE_EXCEPTION = e;
    }

    public SharedAdUnitService() {
        super(__getWsdlLocation(), SHAREDADUNITSERVICE_QNAME);
    }

    public SharedAdUnitService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns SharedAdUnitServiceInterface
     */
    @WebEndpoint(name = "SharedAdUnitServiceInterfacePort")
    public SharedAdUnitServiceInterface getSharedAdUnitServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201505", "SharedAdUnitServiceInterfacePort"), SharedAdUnitServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SharedAdUnitServiceInterface
     */
    @WebEndpoint(name = "SharedAdUnitServiceInterfacePort")
    public SharedAdUnitServiceInterface getSharedAdUnitServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201505", "SharedAdUnitServiceInterfacePort"), SharedAdUnitServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHAREDADUNITSERVICE_EXCEPTION!= null) {
            throw SHAREDADUNITSERVICE_EXCEPTION;
        }
        return SHAREDADUNITSERVICE_WSDL_LOCATION;
    }

}
