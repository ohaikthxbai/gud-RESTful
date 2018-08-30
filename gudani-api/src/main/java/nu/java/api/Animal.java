package nu.java.api;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement //view as XML using Accept header in Postman
public class Animal {
	
	@JsonProperty("name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal() {
		this.setName("cat");
	}

	public Animal(String name) {
		this.setName(name);
	}
}
