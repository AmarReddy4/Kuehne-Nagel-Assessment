package com.javainuse.wsdl;


import com.javainuse.wsdl.xsd.Message;
import com.javainuse.wsdl.xsd.ObjectFactory;
import com.javainuse.wsdl.xsd.Resultcode;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(
        targetNamespace = "us.world_corp.my_soap_forum.wsdl",
        name = "my SOAP forum"
)
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(
        style = Style.RPC
)
public interface My_0020SOAP_0020Forum {
    @WebMethod(
            operationName = "post_message",
            action = "urn:xmethods-delayed-quotes#post_message"
    )
    @WebResult(
            name = "resultcode",
            targetNamespace = "us.world_corp.my_soap_forum.wsdl",
            partName = "resultcode"
    )
    Resultcode postMessage(@WebParam(partName = "message",name = "message") Message var1);
}
