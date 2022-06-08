package com.javainuse.soap.wsdl.my_soap_forum.world_corp.us;

import com.javainuse.soap.xsd.my_soap_forum.world_corp.us.Message;
import com.javainuse.soap.xsd.my_soap_forum.world_corp.us.Resultcode;

public class APIImplementation implements My_0020SOAP_0020Forum{

	@Override
	public Resultcode postMessage(Message message) {
		
		Resultcode r=new Resultcode();
		r.setValue(200);

		return r;
	}

}
