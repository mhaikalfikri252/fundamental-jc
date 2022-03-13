package com.juaracoding.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.juaracoding.junit.TestDataArray;
import com.juaracoding.junit.TestPajak;

@RunWith(Suite.class)
@SuiteClasses({ TestPajak.class, TestDataArray.class })
public class PajakArrayTest {

}
