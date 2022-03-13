package com.juaracoding.junit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit4.karyawan.EmailKaryawan;

public class TestEmailKaryawan {

	EmailKaryawan emailKaryawan;
	
	@Before
	public void setUp() throws Exception {
		emailKaryawan = new EmailKaryawan();
		
	}

	@Test
	public void testValidEmailId() {
		
		boolean actual = emailKaryawan.isValidEmailId("koswara@jc.com");
		
		assertTrue("Valid email ID failed",actual);
	}
	
	@Test
	public void testInValidEmailId() {
		
		boolean actual = emailKaryawan.isValidEmailId("koswara@jc");
		
		assertFalse("Valid email ID failed",actual);
	}

}
