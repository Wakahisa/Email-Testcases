/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailCases;

import junit.framework.TestCase;

/**
 *
 * @author Peter
 */
public class EmailCasesTest extends TestCase {
        
    public EmailCasesTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("* EmailCasesTest: setUp() method");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("* EmailCasesTest: tearDown() method");
    }
    
    /**
     * Test of userId method
     */
    public void testUserId() {
        System.out.println("* EmailCasesTest: test method 1 - userId()");        
        
        //True Cases
        assertTrue(EmailCases.userId("peter@hotmail.com"));
        assertTrue(EmailCases.userId("Cookie123@google.museum"));
        assertTrue(EmailCases.userId("qwerty@xyz.net"));
        assertTrue(EmailCases.userId("Auto@state.edu"));
        assertTrue(EmailCases.userId("Robot@example.name"));

        //False Cases
        assertFalse(EmailCases.userId("#@%^%#$@#$@#.com")); // Too many @s 
        assertFalse(EmailCases.userId("plainaddress")); // no @ symbol or domain
        assertFalse(EmailCases.userId("@domain.com")); // no username
        assertFalse(EmailCases.userId("email@domain..org")); // Too many periods in domain
        assertFalse(EmailCases.userId("email..email@domain.com")); //Too many periods before @
    }
    
    /**
    * Test of password method
    */
    public void testPassword() {
        System.out.println("* EmailCasesTest: test method 2 - password()");
        
        //True Cases
        assertTrue(EmailCases.password("Mooserun12%"));
        assertTrue(EmailCases.password("$C3ntauri"));
        assertTrue(EmailCases.password("zXcvb!@1"));
        assertTrue(EmailCases.password("polC6*111"));
        assertTrue(EmailCases.password("Asdfg98##"));
                
        //False Cases
        assertFalse(EmailCases.password("mydogname")); //No Capital letter or special characters
        assertFalse(EmailCases.password("12345678")); // Only numbers
        assertFalse(EmailCases.password("***********************")); // Only special characters
        assertFalse(EmailCases.password("^m^M^M^M^M^")); //No numbers
        assertFalse(EmailCases.password("Spam")); // Not enough characters and no special characters
        
        
    } 
    
    
}
