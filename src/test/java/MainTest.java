import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    public void testDataSplit() throws Exception {
        //Given
        Main main = new Main();
        main.dataSplitter();

        //Then
        Assert.assertEquals(main.input, main.dataSplitter());

    }
    @Test
    public void testErrorCounter(){

    }
    @Test
    public void testIsErrorData(){

    }
    @Test
    public void testFoodCounter(){

    }
    @Test
    public void testPriceCounter(){

    }

}