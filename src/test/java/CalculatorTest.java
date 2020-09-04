import org.hamcrest.generator.HamcrestFactoryWriter;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;


class CalculatorTest {
    private static long suiteStartTime;
    private long testStartTime;

    @Test
    public void testmultiply() {
        // given:
        Calculator calc = Calculator.instance.get();
        final int x = 5;
        final int y = 6;
        // when:
        final Integer result = calc.multiply.apply(x, y);
        // then:
        assertThat(result, is(30));
    }


    @Test
    public void testpow() {
        // given:
        Calculator calc = Calculator.instance.get();
        final int x = 5;

        // when:
        final Integer result = calc.pow.apply(x);
        // then:
        assertThat(result, is(25));
    }

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running StringTest");
        suiteStartTime = System.nanoTime();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Running StringTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("StringTest complete: " + (System.nanoTime() - suiteStartTime));
    }

}