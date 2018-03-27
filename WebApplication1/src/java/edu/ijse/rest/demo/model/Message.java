package edu.ijse.rest.demo.model;

public class Message {

	String name;
	String text;

	public Message(){
		
	}
	
	public Message(String name, String text) {
		this.name = name;
		this.text = text;
	}

	
	public String getName() {
		return name;
	}
	

	public String getText() {
		return text;
	}

}
