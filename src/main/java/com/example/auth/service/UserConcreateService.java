package com.example.auth.service;

import com.example.auth.domain.Auser;
import com.example.auth.domain.Role;
import com.example.auth.repo.Rolerepo;
import com.example.auth.repo.Userrepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserConcreateService implements IuserService{
    private final Userrepo userrepo;
    private final Rolerepo rolerepo;
    @Override
    public Auser saveUser(Auser user) {
        return userrepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return rolerepo.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        Role role = rolerepo.findByName(roleName);
        Auser auser=userrepo.findByName(userName);
        auser.getRoles().add(role);
    }

    @Override
    public Auser getAUser(String userName) {
        return userrepo.findByName(userName);
    }

    @Override
    public List<Auser> getUser() {
        return userrepo.findAll();
    }
}
