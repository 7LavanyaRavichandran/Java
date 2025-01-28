package com.jaxb.MarshalUnmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalling {

	public static void main(String[] args) {
		try {

			//Step 1: Create JAXB context Object
			JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            //Step 2: Create UnMarshaller object using JAXBContext object
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			//Step 3: Specify the location and name of xml file to be read
			File XMLfile = new File("Country.xml");

			//Step 4: This will create Java object – country from the XML file
			Country country = (Country) jaxbUnmarshaller.unmarshal(XMLfile);
            //Step 5: Java Object Retrieved
			
			System.out.println("Country Name: "+country.getCountryName());
			System.out.println("Country Population: "+country.getCountryPopulation());

		
			} catch (JAXBException e) {
			// some exception occured
			e.printStackTrace();
			}

			
			

	}

}
