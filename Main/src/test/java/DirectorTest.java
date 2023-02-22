import Managment.Director;
import Managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before (){
        director = new Director("Finance", "Brian", 10, 200000.00, 1000000.00);
    }
    @Test
    public void hasBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.0);
    }

}
