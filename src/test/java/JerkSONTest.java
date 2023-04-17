import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JerkSONTest {

    @Test
    public void constructorTest(){
        //Given
        JerkSON jerk = new JerkSON("apples", new ArrayList<>());

        //Then
        assertTrue(jerk.containsKey("apples"));
        assertTrue(jerk.containsKey("price"));
    }

}