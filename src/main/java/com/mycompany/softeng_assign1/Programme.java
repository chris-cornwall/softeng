/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng_assign1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author cristoir95
 */
public class Programme {
    
    String name;
    ArrayList <Module> modules;
    DateTime startDate;
    DateTime endDate;
    
    
    public Programme(String name, ArrayList <Module> modules, DateTime startDate, DateTime endDate){
        
        this.name = name;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
        
    }

    public String getName() {
        return name;
    }

    public ArrayList <Module> getModules() {
        return modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModules(ArrayList <Module> modules) {
        this.modules = modules;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    
}


