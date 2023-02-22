import Managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Finance", "Dave", 5, 90000.00);
    }
    @Test
    public void hasName(){
        assertEquals("Dave", manager.getName());
    }
    @Test
    public void hasNI(){
        Integer expectedResult = 5;
        assertEquals(expectedResult, manager.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(90000.00, manager.getSalary(),0.0);
    }
    @Test
    public void hasDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.00);
        assertEquals(100000.00,manager.getSalary(), 0.0 );
    }
    @Test
    public void canPayBonus(){
        assertEquals(900.00, manager.payBonus(),0.0);
    }
}
