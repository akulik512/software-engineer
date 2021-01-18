package singleton.doublecheckedlocking;

import com.akulik.designpatterns.singleton.doublecheckedlocking.DoubleCheckedLocking;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class DoubleCheckedLockingTest {

    @Test
    void testDoubleCheckedLocking() {
        final int start;
        final int finish;

        System.out.println("--- Start");
        start = LocalDateTime.now().getNano();

        DoubleCheckedLocking.getInstance();

        finish = LocalDateTime.now().getNano();
        System.out.println("--- Finish");
        System.out.println("--- Result: start = " + (finish - start));
    }
}