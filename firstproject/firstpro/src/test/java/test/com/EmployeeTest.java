/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.mycompany.firstpro.Employee;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sweta
 */
public class EmployeeTest {
  
    Employee emp;
    
    public EmployeeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        emp = new Employee() ;
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    } 
    
    @Test
    public void testName(){
     emp.setName("Jess");
        assertEquals("Jess", emp.getName());
    } 
    
    @Test
    public void testid(){
        emp.setId(1);
        assertEquals(1, emp.getId());
    }
}
