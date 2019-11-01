package com.fgproject.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgproject.repository.CharRepo;
import com.fgproject.model.Character;
@Service
public class CharService {

	@Autowired
	private CharRepo charRepo;
	
	
	//Get a single character by name
	public Character getByName(String name) throws Exception
	{
		//Container for retrieved character
	Character enteredChar = new Character();
	
	//Array list to hold every character in the database
	ArrayList<Character> allChars = (ArrayList<Character>)charRepo.findAll();	
	//Loop through each and stop on the one with a name matching the argument
	for (int i = 0; i < allChars.size(); i++)
	{
		if(allChars.get(i).getChar_Name().equals(name))
				{
			enteredChar = allChars.get(i);
				}
	}
	
	//Return found character
	return enteredChar;
	}
	
	//Get every character
		public ArrayList<Character> getAllChars() throws Exception
		{
		
		//Array list to hold every character in the database
		ArrayList<Character> allChars = (ArrayList<Character>)charRepo.findAll();	
		
		//Return all characters
		return allChars;
		}
}
