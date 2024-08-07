package com.geppetto.angapp.dao.daoimpl;

import com.geppetto.angapp.model.User;
import com.geppetto.angapp.repository.UserRepository;
import com.geppetto.angapp.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
