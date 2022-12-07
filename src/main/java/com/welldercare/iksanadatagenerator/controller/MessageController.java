package com.welldercare.iksanadatagenerator.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.welldercare.iksanadatagenerator.model.Message;
import com.welldercare.iksanadatagenerator.service.MessageService;


@CrossOrigin
@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	
	@PostMapping("/weldercareAdaptor/{topic}")
	public Message messageSave(@RequestBody Message t, @PathVariable String topic) throws IOException {
		return messageService.messageSave(t, topic);
		
	} 
	
	


}
