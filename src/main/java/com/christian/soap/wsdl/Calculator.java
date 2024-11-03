
package com.christian.soap.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "Calculator", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://www.dneonline.com/calculator.asmx?WSDL")
public class Calculator
    extends Service
{

    private final static URL CALCULATOR_WSDL_LOCATION;
    private final static WebServiceException CALCULATOR_EXCEPTION;
    private final static QName CALCULATOR_QNAME = new QName("http://tempuri.org/", "Calculator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.dneonline.com/calculator.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATOR_WSDL_LOCATION = url;
        CALCULATOR_EXCEPTION = e;
    }

    public Calculator() {
        super(__getWsdlLocation(), CALCULATOR_QNAME);
    }

    public Calculator(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATOR_QNAME, features);
    }

    public Calculator(URL wsdlLocation) {
        super(wsdlLocation, CALCULATOR_QNAME);
    }

    public Calculator(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATOR_QNAME, features);
    }

    public Calculator(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculator(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap() {
        return super.getPort(new QName("http://tempuri.org/", "CalculatorSoap"), CalculatorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "CalculatorSoap"), CalculatorSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoap getCalculatorSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "CalculatorSoap12"), CalculatorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoap getCalculatorSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "CalculatorSoap12"), CalculatorSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATOR_EXCEPTION!= null) {
            throw CALCULATOR_EXCEPTION;
        }
        return CALCULATOR_WSDL_LOCATION;
    }

}
