package com.example.demo.Services;

import com.example.demo.DAO.UserDAO;
import com.example.demo.DAO.UserDAOImp;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Service
public class GetUserService {

    @Autowired
    UserDAO userdao;
    @Autowired
    UserDAOImp uIm;

    public User findById(int id){
        User u=  userdao.Query(id);
        return u;
    }
    public String addU(User user){
       return Optional.ofNullable(uIm.save(user))
               .map(t -> "success") // Trả về success nếu save thành công
               .orElse("failed"); // Trả về failed nếu không thành công
    }
}
