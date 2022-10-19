package com.nestdigital.userApp.Dao;

import com.nestdigital.userApp.Model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {
}
