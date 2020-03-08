package com.example.demo.DAO;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAOImp extends JpaRepository<User,Long> {
    User findById(int id);
    @Query
    (value = "select * from User u where u.id = ?1", nativeQuery = true)
    User myCustomQuery(int id);

}
