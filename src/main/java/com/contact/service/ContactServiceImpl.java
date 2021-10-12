package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entities.contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<contact> list=List.of(
			new contact(1,"munni@gmail.com","Munni mehta",1),
			new contact(2,"chacha@gmail.com","Divyank Agarwal",1),
			new contact(3,"tharki@gmail.com","Brijesh Kumar",1),
			new contact(4,"pk@gmail.com","Pranav kulkarni mehta",2)
			);
	
	@Override
	public List<contact> getContactOfUser(int uid) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(contact->contact.getUid()==uid).collect(Collectors.toList());
	}

	
	
}
