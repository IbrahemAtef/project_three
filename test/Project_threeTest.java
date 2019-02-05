/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Project_threeTest {

    public Project_threeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testATBASH1() {
        String plainText = "JAVA PROGRAMMIN";
        String cipheringText = "QZEZ KILTIZNNRMT";    
    }
    
    @Test
    public void testATBASH2() {
        String plainText = "QZEZ KILTIZNNRMT";
        String decipheringText = "JAVA PROGRAMMIN";    
    }
    
    @Test
    public void testHEX1() {
        String plainText = "JAVA PROGRAMMIN";
        String cipheringText = "4a 41 56 41 20 50 52 4f 47 52 41 4d 4d 49 4e 47";    
    }
    
    @Test
    public void testHEX2() {
        String plainText = "4a 41 56 41 20 50 52 4f 47 52 41 4d 4d 49 4e 47";
        String decipheringText = "JAVA PROGRAMMIN";    
    }
    
    @Test
    public void testVIGENERE1() {
        String plainText = "JAVA PROGRAMMIN";
        String cipheringText = "BEXR TKGKTRQFAR";    
    }
    
    @Test
    public void testVIGENERE2() {
        String plainText = "BEXR TKGKTRQFAR";
        String cipheringText = "JAVA PROGRAMMIN";    
    }
    
    @Test
    public void testrankOfLetter() {
        
    }
    
    @Test
    public void testletterOfRank() {
            
    }
    
    @Test
    public void testlineOfKeyWord() {
            
    }
    
    @Test
    public void testgetDecFormat() {
           
    }
}
