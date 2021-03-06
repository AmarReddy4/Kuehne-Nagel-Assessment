package com.javainuse.soap.wsdl.my_soap_forum.world_corp.us;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2022-06-07T01:06:05.047+05:30
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "us.world_corp.my_soap_forum.wsdl", name = "my SOAP forum")
@XmlSeeAlso({com.javainuse.soap.xsd.my_soap_forum.world_corp.us.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface My_0020SOAP_0020Forum {

    @WebMethod(operationName = "post_message", action = "urn:xmethods-delayed-quotes#post_message")
    @WebResult(name = "resultcode", targetNamespace = "us.world_corp.my_soap_forum.wsdl", partName = "resultcode")
    public com.javainuse.soap.xsd.my_soap_forum.world_corp.us.Resultcode postMessage(
        @WebParam(partName = "message", name = "message")
        com.javainuse.soap.xsd.my_soap_forum.world_corp.us.Message message
    );
}
