package com.fgproject.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Characters")
public class Character {

	@Id
	private BigInteger id;
	private String char_Name;
	private Integer price;
	private String picture;

	public Character() {
		
		this.id = null;
		this.char_Name = "";
		this.price = 0;
		this.picture = "";
	}

	public Character(BigInteger id, String char_Name, Integer price, String picture) {
		
		super();
		
		this.id = id;
		this.char_Name = char_Name;
		this.price = price;
		this.picture = picture;
		
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getChar_Name() {
		return char_Name;
	}

	public void setChar_Name(String char_Name) {
		this.char_Name = char_Name;
	}

	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	@Override
	public String toString() {
		return "Character [id=" + id + ", char_Name=" + char_Name + ", price=" + price + ", picture=" + picture + "]";
	}
}
