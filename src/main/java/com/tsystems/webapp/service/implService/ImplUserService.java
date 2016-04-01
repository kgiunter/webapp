package com.tsystems.webapp.service.implService;


import com.tsystems.webapp.entity.UserEntity;
import com.tsystems.webapp.repository.UserRepository;
import com.tsystems.webapp.service.interfaces.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ImplUserService implements IUserService{

    @Resource
    UserRepository userRepository;


    @Transactional
    public UserEntity getUser(String login)
    {
        UserEntity user = userRepository.findByLogin(login);
        return user;
    }
}
