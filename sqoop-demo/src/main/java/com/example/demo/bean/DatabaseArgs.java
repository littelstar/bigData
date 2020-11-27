package com.example.demo.bean;

import lombok.Data;

/**
 * @author lpp
 * @date 2020/11/27
 */
@Data
public class DatabaseArgs {
    private String jdbc;
    private String driver;
    private String username;
    private String password;
    private String table;
    private int m;
    private String putlocation;

}
