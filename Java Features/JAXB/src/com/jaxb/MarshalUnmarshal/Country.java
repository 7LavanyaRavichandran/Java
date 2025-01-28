package com.jaxb.MarshalUnmarshal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//Below annotation defines root element of XML file
@XmlRootElement
//You can define order in which elements will be created in XML file
//Optional
@XmlType
public class Country {
	private String countryName;
	private double countryPopulation;
	private int NoOfStates;
	
	public Country() {

	}
	@XmlElement
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@XmlElement
	public double getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(double countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	@XmlElement
	public int getNoOfStates() {
		return NoOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		NoOfStates = noOfStates;
	}

	public Country(String countryName, double countryPopulation, int noOfStates) {
		super();
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
		NoOfStates = noOfStates;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryPopulation=" + countryPopulation + ", NoOfStates="
				+ NoOfStates + "]";
	}
	
	
	

}
