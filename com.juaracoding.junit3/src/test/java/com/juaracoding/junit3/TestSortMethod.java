package com.juaracoding.junit3;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.Assert.fail;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSortMethod {

	static final Logger log = getLogger(lookup().lookupClass());

	@Before
	public void setUp() throws Exception {
	}

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {

		@Override
		protected void succeeded(Description description) {
			log.debug("Pesan Sukses: {}", description.getMethodName());
		}

		@Override
		protected void failed(Throwable e, Description description) {
			log.debug("Pesan Failed: {}", description.getMethodName());
		}

	};

	@Test
	public void testB() {
		log.debug("Testing 2");
		System.out.println("Test 2");
	}

	@Test
	public void testC() {
		log.debug("Testing 3");
		System.out.println("Test 3");
	}

	@Test
	public void testA() {
		log.debug("Testing 1");
		System.out.println("Test 1");
	}

	@Test
	public void testD() {
		log.debug("Testing 4");
		System.out.println("Test 4");
		fail();
	}

}
