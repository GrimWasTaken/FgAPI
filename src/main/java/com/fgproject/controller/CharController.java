package com.fgproject.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fgproject.services.CharService;
import com.fgproject.model.Character;
@RestController
public class CharController {
	
	@Autowired
	private CharService charService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/retrieve/{name}")
	public @ResponseBody Character getChar(@PathVariable String name) throws Exception
	{
		System.out.println(name);
		Character retrieved = charService.getByName(name);
		
		return retrieved;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/retrieveAllChars")
	public @ResponseBody ArrayList<Character> getAllChars() throws Exception
	{
		
		return charService.getAllChars();
	}
}
