package io.github.joaomlneto.travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(3, 5), 15);
	}
	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(8, 2), 4);
	}
}
