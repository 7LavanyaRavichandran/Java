package com.jaxb.MarshalUnmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
	

	public static void main(String[] args) {
		Country country = new Country("India",200000,28);

	try {
		
		//Step 1: Create JAXB context object
		JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
		
		//Step 2: Create Marshaller object using JAXBContext object
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		//Optional : For getting nice formatted output
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		//Step 3: Specify the location and name of xml file to be created
		File XMLfile = new File("Country.xml");

		//Step 4: Call marshal method on created jaxbMarshaller object --> Writing to XML file 
		jaxbMarshaller.marshal(country, XMLfile);
		//Step 5: XML file will be created
		
		// Writing to console
		jaxbMarshaller.marshal(country, System.out);


	} catch (JAXBException e) {
	// some exception occurred
	e.printStackTrace();
	}

	}
	

}
