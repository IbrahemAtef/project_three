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
    public void testIndexOfEmptyPlace() {
        String [] x = {"hellow" , "Java" , null};
        int index = 2;
        assertEquals(index, project_three.Project_three.indexOfEmptyPlace(x));
    }
    
    @Test
    public void testArrayOfAlphabetLetters() {
        char [] x = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        assertArrayEquals(x,project_three.Project_three.arrayOfAlphabetLetters());
    }
    
    @Test
    public void testGetHexFormat() {
        String ch = "c";
        int n = 12;
        assertEquals(ch, project_three.Project_three.getHexFormat(n));
    }
    
    @Test
    public void testrankOfLetter() {
        char ch = 'J';
        int rank = 10;
        assertEquals(rank, project_three.Project_three.rankOfLetter(ch));
    }
    
    @Test
    public void testletterOfRank() {
            int rank = 2;
            char ch = 'B';
            assertEquals(ch, project_three.Project_three.letterOfRank(rank));
    }
    
    @Test
    public void testgetDecFormat() {
           char ch = 'A';
           int dec = -22;
           assertEquals(dec, project_three.Project_three.getDecFormat(ch));
    }
}
