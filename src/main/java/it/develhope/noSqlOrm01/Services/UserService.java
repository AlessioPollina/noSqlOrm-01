package it.develhope.noSqlOrm01.Services;

import it.develhope.noSqlOrm01.Entities.User;
import it.develhope.noSqlOrm01.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User createUser(User user){
        return userRepository.save(user);
    }
}
