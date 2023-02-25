package com.example.SprigCrudSecur1.service;

import com.example.SprigCrudSecur1.model.Role;

import java.util.List;

public interface RoleService {

    Role findByName(String name);

    List<Role> findAll();

}
