package com.example.demo.Entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = -6L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int hp;
    private int stamina;
    private int atk;
    private int def;
    private int agi;
}
