package com.juaracoding.junit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.juaracoding.junit4.karyawan.EmailKaryawan;

public class TestAnotasiEmailKaryawan {

	EmailKaryawan emailKaryawan;
	static int num;
	
	@BeforeClass
	public static void oneTimeSetUp() {
		
		num = 1;
		System.out.println("JUnit Call: "+num+" @BeforeClass oneTimeSetUp");
		
	}
	
	@Before
	public void setUp() throws Exception {
		
		num += 1;
		System.out.println("JUnit Call: "+num+" @Before setUp");
		
		emailKaryawan = new EmailKaryawan();
		emailKaryawan.tambahEmailKaryawan("JC1", "test1@email.com");
		emailKaryawan.tambahEmailKaryawan("JC2", "test2@email.com");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
