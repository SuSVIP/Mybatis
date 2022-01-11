package com.zzl.pojo;

public class User {
    private int useid;
    private String usename;
    private String password;

    public User() {
    }

    public User(int useid, String usename, String password) {
        this.useid = useid;
        this.usename = usename;
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "useid=" + useid +
                ", usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
