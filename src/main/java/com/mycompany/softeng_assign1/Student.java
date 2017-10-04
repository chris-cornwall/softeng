/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng_assign1;
import org.joda.time.DateTime;
/**
 *
 * @author cristoir95
 */
public class Student {
    
    private String name;
    private int age;
    private DateTime dob;
    //private Date dob;
    private long id;
    private String userName;
    private String [] modules;
    
    public Student(String name, int age, DateTime dob, long id, String[] modules){
        
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = modules;
    
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setuName(String userName) {
        this.userName = userName;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDob() {
        return dob;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        userName =  name + age;
        return userName;
    }

    public String[] getModules() {
        return modules;
    }
    
            
}
