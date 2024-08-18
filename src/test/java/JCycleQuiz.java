import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JCycleQuiz {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Hello!");
    }

    @AfterAll
    static void afterall(){
        System.out.println("Bye!");
    }

    @Test
    public void jCycleQuiz1(){
        System.out.println("This is first test");
    }
    @Test
    public void jCycleQuiz2(){
        System.out.println("This is second test");
    }
}
