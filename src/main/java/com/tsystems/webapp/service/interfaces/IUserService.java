package com.tsystems.webapp.service.interfaces;


import com.tsystems.webapp.entity.UserEntity;

public interface IUserService
{
    UserEntity getUser(String login);
}
