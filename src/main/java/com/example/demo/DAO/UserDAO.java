package com.example.demo.DAO;

import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDAO {
    @Autowired
    UserDAOImp daoim;



    public  User Query(int id){
        User u=daoim.myCustomQuery(id);
        return u;
    }


}
