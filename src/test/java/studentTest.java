/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.softeng_assign1.Student;
import org.joda.time.DateTime;

/**
 *
 * @author cristoir95
 */
public class studentTest {
    Student student;
    DateTime date = new DateTime();
    String [] modules = {"maths", "science", "english"};

    public studentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
     this.student = new Student("Amy", 18, date , 1231456, modules);
    }
    
    @Test
    public void testUsername() {
       String result = student.getUserName();
        assertEquals ("Should concatanate name and age;", "Amy18", result);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
