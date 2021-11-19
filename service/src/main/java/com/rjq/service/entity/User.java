package com.rjq.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class User implements Serializable {

    //    private int id;
    private String username;
    private String password;

}
