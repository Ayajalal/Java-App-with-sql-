/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author aya
 */
class UserInfo {

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    


   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public UserInfo() {
    }

    public UserInfo(int id, String name, String job, String birthday, String address, String gender, String knowledge) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
        this.knowledge = knowledge;
    }

    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getKnowledge() {
        return knowledge;
    }

    
   private int id;
  private  String name,job ,birthday; 

  private  String address,gender,knowledge;
  
}
