package singleton.synchronizedmethod;

import com.akulik.designpatterns.singleton.synchronizedmethod.SynchronizedMethod;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class SynchronizedMethodTest {

    @Test
    void testSingletonSynchronizedMethod() {
        final int start;
        final int finish;

        System.out.println("--- Start");
        start = LocalDateTime.now().getNano();

        SynchronizedMethod.getInstance();

        finish = LocalDateTime.now().getNano();
        System.out.println("--- Finish");
        System.out.println("--- Result: start = " + (finish - start));
    }
}