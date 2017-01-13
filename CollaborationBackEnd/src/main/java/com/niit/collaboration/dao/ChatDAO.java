package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.Chat;

public interface ChatDAO {
	
	public boolean save(Chat chat);
	
	public Chat get(String id);
	
	public boolean Delete(Chat chat);
		
	public List<Chat> list();

}