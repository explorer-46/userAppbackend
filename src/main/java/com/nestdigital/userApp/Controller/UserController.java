package com.nestdigital.userApp.Controller;

import com.nestdigital.userApp.Dao.UserDao;
import com.nestdigital.userApp.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser",consumes = "application/json",produces = "application/json")
    public String addUser(@RequestBody UserModel user){
        dao.save(user);
        return"{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<UserModel> viewUser(){
        return(List<UserModel>) dao.findAll();
    }
}
