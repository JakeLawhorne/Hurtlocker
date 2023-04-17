import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @Test
    public void testErrorCounter() throws Exception {
        //Given
        Main main = new Main();

        //Assert
        Assert.assertEquals(4, main.errorCounter(main.input));
    }

    @Test
    public void testRemoveErrorData() throws Exception {
        //Given
        Main main = new Main();
        String expected = main.errorFreeInput;

        //Then
        Assert.assertEquals(expected, main.removeErrorData(main.rawToLines()));
    }

    @Test
    public void testGetTotalView() throws Exception {
        //Given
        Main main = new Main();

        //Then
        Assert.assertEquals(6, main.getTotalFoodViews(RegPatterns.milk, main.errorFreeInput));
    }
    @Test
    public void testGetMilkPrices() throws Exception {
        //Given
        Main main = new Main();
        String expected = "[3.23, 3.23, 3.23, 1.23, 3.23, 3.23]";

        //Then
        Assert.assertEquals(expected, main.getMilkPrices(main.errorFreeInput).toString());
    }
    @Test
    public void testGetApplesPrices() throws Exception {
        //Given
        Main main = new Main();
        String expected = "[0.25, 0.23, 0.25, 0.23]";

        //Then
        Assert.assertEquals(expected, main.getApplesPrices(main.errorFreeInput).toString());
    }
    @Test
    public void testGetBreadPrices() throws Exception {
        //Given
        Main main = new Main();
        String expected = "[1.23, 1.23, 1.23, 1.23, 1.23, 1.23]";

        //Then
        Assert.assertEquals(expected, main.getBreadPrices(main.errorFreeInput).toString());
    }
    @Test
    public void testGetCookiesPrices() throws Exception {
        //Given
        Main main = new Main();
        String expected = "[2.25, 2.25, 2.25, 2.25, 2.25, 2.25, 2.25, 2.25]";

        //Then
        Assert.assertEquals(expected, main.getCookiesPrices(main.errorFreeInput).toString());
    }
}