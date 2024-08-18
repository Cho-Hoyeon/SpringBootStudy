import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz {
    @Test
    public void jUnitQuiz1() {
        String name1 = "홍길동";
        String name2 = "성춘향";
        String name3 = "이몽룡";
        String name4 = "홍길동";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();
        assertThat(name4).isNotNull();

        assertThat(name1).isEqualTo(name4);
        // assertThat(name1).isEqualTo(name3);
    }

    @Test
    public void jUnitQuiz2(){
        int n1 = 15;
        int n2 = 0;
        int n3 = -5;

        assertThat(n1).isPositive();
        assertThat(n2).isZero();
        assertThat(n3).isNotPositive();
        assertThat(n1).isGreaterThan(n2);
        assertThat(n3).isLessThan(n2);
    }

}
