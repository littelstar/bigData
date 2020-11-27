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
    private String column;
    private String value;

    public DatabaseArgs(String jdbc, String driver, String username, String password, String table, int m, String putlocation, String column, String vlaue) {
        this.jdbc = jdbc;
        this.driver = driver;
        this.username = username;
        this.password = password;
        this.table = table;
        this.m = m;
        this.putlocation = putlocation;
        this.column = column;
        this.value = vlaue;

    }

    public DatabaseArgs() {

    }


}
