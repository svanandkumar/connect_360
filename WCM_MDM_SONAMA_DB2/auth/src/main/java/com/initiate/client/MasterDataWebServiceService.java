
package com.initiate.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
//http://9.42.158.8:7002/madclient/services/mds?wsdl
//http://client.initiate.com/
//http://10.52.1.22:9080/madclient/services/mds?wsdl
//http://client.esoa.mdm.ibm.com/
@WebServiceClient(name = "MasterDataWebServiceService", targetNamespace = "http://client.esoa.mdm.ibm.com/", wsdlLocation = "http://10.52.1.22:9080/madclient/services/mds?wsdl")
@HandlerChain(file="handler-chain.xml")
public class MasterDataWebServiceService
    extends Service
{

    private final static URL MASTERDATAWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MASTERDATAWEBSERVICESERVICE_EXCEPTION;
    private final static QName MASTERDATAWEBSERVICESERVICE_QNAME = new QName("http://client.esoa.mdm.ibm.com/", "MasterDataWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.52.1.22:9080/madclient/services/mds?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MASTERDATAWEBSERVICESERVICE_WSDL_LOCATION = url;
        MASTERDATAWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MasterDataWebServiceService() {
        super(__getWsdlLocation(), MASTERDATAWEBSERVICESERVICE_QNAME);
    }

    public MasterDataWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MASTERDATAWEBSERVICESERVICE_QNAME, features);
    }

    public MasterDataWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MASTERDATAWEBSERVICESERVICE_QNAME);
    }

    public MasterDataWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MASTERDATAWEBSERVICESERVICE_QNAME, features);
    }

    public MasterDataWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MasterDataWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MasterDataWebService
     */
    @WebEndpoint(name = "MasterDataWebServicePort")
    public MasterDataWebService getMasterDataWebServicePort() {
        return super.getPort(new QName("http://client.esoa.mdm.ibm.com/", "MasterDataWebServicePort"), MasterDataWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MasterDataWebService
     */
    @WebEndpoint(name = "MasterDataWebServicePort")
    public MasterDataWebService getMasterDataWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://client.esoa.mdm.ibm.com/", "MasterDataWebServicePort"), MasterDataWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MASTERDATAWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MASTERDATAWEBSERVICESERVICE_EXCEPTION;
        }
        return MASTERDATAWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
