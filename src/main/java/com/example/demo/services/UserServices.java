package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.User;
import com.example.demo.repository.UserDAO;
@Service
public class UserServices {
	
	@Autowired
	 private UserDAO dao;
	
	public List<User> getUsers()
	{
	return dao.findAll();
	}

	public User getUsers(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	public User addUser(User user)
	{
		
		return dao.save(user);
	}
	
	
	
	/*

	 

  public Optional<Contact> findById(int id) {
      return contactRepository.findById(id);
  }

  public Contact saveContact(Contact contact) {
      return contactRepository.save(contact);
  }

  public Contact updateContact(int id, Contact contact) {
      Contact updatedContact = contactRepository.findById(id).orElse(null);
      updatedContact.setName(contact.getName());
      updatedContact.setEmail(contact.getEmail());
      updatedContact.setCountry(contact.getCountry());
      return contactRepository.save(updatedContact);
  }

  public void deleteById(int id) {
      contactRepository.deleteById(id);
  }
	 */
	
	
	
	
	
	

}
