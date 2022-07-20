package com.example.auth.service;

import com.example.auth.domain.Auser;
import com.example.auth.domain.Role;
import org.apache.catalina.User;

import java.util.List;

public interface IuserService{
    Auser saveUser(Auser user);

    Role saveRole(Role role);
    void addRoleToUser(String userName,String roleName);
    Auser getAUser(String userName);
    List<Auser> getUser();

}
