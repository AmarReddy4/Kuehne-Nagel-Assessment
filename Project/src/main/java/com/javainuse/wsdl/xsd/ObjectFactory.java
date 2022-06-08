package com.javainuse.wsdl.xsd;

import com.javainuse.soap.xsd.my_soap_forum.world_corp.us.Message;
import com.javainuse.soap.xsd.my_soap_forum.world_corp.us.Resultcode;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }

    public Message createMessage() {
        return new Message();
    }

    public Resultcode createResultcode() {
        return new Resultcode();
    }
}
