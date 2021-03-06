package org.tutorial.jpa.tuto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutorial.jpa.tuto.entity.Userx;
import org.tutorial.jpa.tuto.repository.UserxRepository;

@Service
public class UserxServiceImpl implements UserxService{
	
	@Autowired
	private UserxRepository userRepository;

	@Override
	public Userx addUser(Userx user) {
		return userRepository.save(user);
	}
	@Override
	public List<Userx> allUser() {
		return userRepository.findAll();
	}
	@Override
	public Optional<Userx> findUser(long id) throws Exception {
		return userRepository.findById(id);
	}

	
	
}
