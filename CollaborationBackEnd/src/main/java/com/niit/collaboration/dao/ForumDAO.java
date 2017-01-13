package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.Forum;

public interface ForumDAO {
	
	public boolean save(Forum forum);
	
	public boolean delete(Forum forum);
	
	public boolean update(Forum forum);
	
	public Forum get(String id);
	
	public List<Forum> list();
	

}
