/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng_assign1;

import java.util.ArrayList;

/**
 *
 * @author cristoir95
 */
public class Module {
    
    private String name;
    private String id;
    private ArrayList <Student> students;
    
    public Module(String name, String id, ArrayList <Student> students){
        
        this.name = name;
        this.id = id;
        this.students = students;
        
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList <Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStudents(ArrayList <Student> students) {
        this.students = students;
    }
    
    
}
