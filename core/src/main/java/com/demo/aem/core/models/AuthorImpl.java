package com.demo.aem.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, adapters = Author.class)
public class AuthorImpl implements Author{

	@Inject
	String fname;
	
		
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getIsProfessor() {
		// TODO Auto-generated method stub
		return false;
	}

}
