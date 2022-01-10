package com.zzl.domain;

public class User {
    private int useid;
    private String usename;
    private String password;

    //无参
    public User() {
    }

    //有参


    public User(int useid, String usename, String password) {
        this.useid = useid;
        this.usename = usename;
        this.password = password;
    }

    //构造

    public int getUseid() {
        return useid;
    }

    public void setUseid(int useid) {
        this.useid = useid;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //toString

    @Override
    public String toString() {
        return "User{" +
                "useid=" + useid +
                ", usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
