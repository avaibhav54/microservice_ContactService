package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entities.contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/user/{userid}")
	public ResponseEntity<?> getContact(@PathVariable("userid") int uid)
	{
		return ResponseEntity.ok(this.contactservice.getContactOfUser(uid));
		}
}
