package com.javainuse.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
        name = "exemple",
        wsdlLocation = "classpath:task.wsdl",
        targetNamespace = "us.world_corp.my_soap_forum.wsdl"
)
public class Example extends Service {
    public static final URL WSDL_LOCATION;
    public static final QName SERVICE = new QName("us.world_corp.my_soap_forum.wsdl", "exemple");
    public static final QName Exemple0 = new QName("us.world_corp.my_soap_forum.wsdl", "exemple_0");
    public static final QName Exemple1 = new QName("us.world_corp.my_soap_forum.wsdl", "exemple_1");

    static {
        URL url = null;

        try {
            url = new URL("classpath:task.wsdl");
        } catch (MalformedURLException var2) {
            Logger.getLogger(Example.class.getName()).log(Level.INFO, "Can not initialize the default wsdl from {0}", "file:/E:/RnD/UpW/my-projects/Amritpal Singh/Project/task.wsdl");
        }

        WSDL_LOCATION = url;
    }

    public Example(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Example(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Example() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Example(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Example(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Example(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(
            name = "exemple_0"
    )
    public My_0020SOAP_0020Forum getExemple0() {
        return (My_0020SOAP_0020Forum)super.getPort(Exemple0, My_0020SOAP_0020Forum.class);
    }

    @WebEndpoint(
            name = "exemple_0"
    )
    public My_0020SOAP_0020Forum getExemple0(WebServiceFeature... features) {
        return (My_0020SOAP_0020Forum)super.getPort(Exemple0, My_0020SOAP_0020Forum.class, features);
    }

    @WebEndpoint(
            name = "exemple_1"
    )
    public My_0020SOAP_0020Forum getExemple1() {
        return new APIImplementation();
    }

    @WebEndpoint(
            name = "exemple_1"
    )
    public My_0020SOAP_0020Forum getExemple1(WebServiceFeature... features) {
        return (My_0020SOAP_0020Forum)super.getPort(Exemple1, My_0020SOAP_0020Forum.class, features);
    }
}
