package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.Friend;

public interface FriendDAO {
	
	public boolean save(Friend friend);
	
	public boolean delete(Friend friend);
	
	public List<Friend> get(String emailId);
	
	}
