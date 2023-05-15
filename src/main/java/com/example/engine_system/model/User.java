package com.example.engine_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1978931913474202083L;

    private String userName;
    private String password;
    private String avatar;
    private String name;
    private String userId;

}
