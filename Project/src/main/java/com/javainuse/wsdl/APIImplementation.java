package com.javainuse.wsdl;


import com.javainuse.wsdl.xsd.Message;
import com.javainuse.wsdl.xsd.Resultcode;

public class APIImplementation implements My_0020SOAP_0020Forum {
    public APIImplementation() {
    }

    public Resultcode postMessage(Message message) {
        Resultcode r = new Resultcode();
        r.setValue(200);
        return r;
    }

}

