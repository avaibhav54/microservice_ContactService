package com.contact.service;

import java.util.List;

import com.contact.entities.contact;

public interface ContactService {

	public List<contact> getContactOfUser(int uid);
}
