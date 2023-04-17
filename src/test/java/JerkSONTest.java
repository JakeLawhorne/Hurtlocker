import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JerkSONTest {

    @Test
    public void constructorTest(){
        //Given
        JerkSON jerk = new JerkSON();

        //Then
        assertTrue(jerk.containsKey("name"));
        assertTrue(jerk.containsKey("price"));
    }

}