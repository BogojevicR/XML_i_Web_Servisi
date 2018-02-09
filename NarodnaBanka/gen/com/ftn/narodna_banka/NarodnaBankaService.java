package com.ftn.narodna_banka;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-02-09T15:36:21.919+01:00
 * Generated source version: 2.6.5
 * 
 */
@WebServiceClient(name = "NarodnaBankaService", 
                  wsdlLocation = "file:/C:/Users/Nikola Gajic/Documents/Github/XML_i_Web_Servisi/NarodnaBanka/WEB-INF/wsdl/narodna_banka.wsdl",
                  targetNamespace = "http://www.ftn.com/narodna_banka") 
public class NarodnaBankaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.ftn.com/narodna_banka", "NarodnaBankaService");
    public final static QName NarodnaBanka = new QName("http://www.ftn.com/narodna_banka", "NarodnaBanka");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Nikola Gajic/Documents/Github/XML_i_Web_Servisi/NarodnaBanka/WEB-INF/wsdl/narodna_banka.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(NarodnaBankaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Nikola Gajic/Documents/Github/XML_i_Web_Servisi/NarodnaBanka/WEB-INF/wsdl/narodna_banka.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public NarodnaBankaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NarodnaBankaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NarodnaBankaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public NarodnaBankaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public NarodnaBankaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public NarodnaBankaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns NarodnaBanka
     */
    @WebEndpoint(name = "NarodnaBanka")
    public NarodnaBanka getNarodnaBanka() {
        return super.getPort(NarodnaBanka, NarodnaBanka.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NarodnaBanka
     */
    @WebEndpoint(name = "NarodnaBanka")
    public NarodnaBanka getNarodnaBanka(WebServiceFeature... features) {
        return super.getPort(NarodnaBanka, NarodnaBanka.class, features);
    }

}
