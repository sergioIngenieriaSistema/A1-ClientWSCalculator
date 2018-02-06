
package pack1;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "calc", targetNamespace = "http://pack1/", wsdlLocation = "http://localhost:8080/calc/calc?wsdl")
public class Calc_Service
    extends Service
{

    private final static URL CALC_WSDL_LOCATION;
    private final static WebServiceException CALC_EXCEPTION;
    private final static QName CALC_QNAME = new QName("http://pack1/", "calc");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/calc/calc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALC_WSDL_LOCATION = url;
        CALC_EXCEPTION = e;
    }

    public Calc_Service() {
        super(__getWsdlLocation(), CALC_QNAME);
    }

    public Calc_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALC_QNAME, features);
    }

    public Calc_Service(URL wsdlLocation) {
        super(wsdlLocation, CALC_QNAME);
    }

    public Calc_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALC_QNAME, features);
    }

    public Calc_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calc_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Calc
     */
    @WebEndpoint(name = "calcPort")
    public Calc getCalcPort() {
        return super.getPort(new QName("http://pack1/", "calcPort"), Calc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calc
     */
    @WebEndpoint(name = "calcPort")
    public Calc getCalcPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pack1/", "calcPort"), Calc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALC_EXCEPTION!= null) {
            throw CALC_EXCEPTION;
        }
        return CALC_WSDL_LOCATION;
    }

}
