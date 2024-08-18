import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2=3")
    @Test
    public void junitTest() {
        int a = 1, b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a + b);
    }

   /*
    @DisplayName("1+3=3")
    @Test
   public void junitFailedTest(){
        int a=1,b=3;
        int sum = 3;
        Assertions.assertEquals(sum,a+b);
    }
    */

}
