package com.qf.pojo;

public class User {

    private int uid;
    private String uname;
    private String upass;
    private String gender;
    private String email;
    private int flag;

    public User(int uid, String uname, String upass, String gender, String email, int flag) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.gender = gender;
        this.email = email;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", flag=" + flag +
                '}';
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
