package com.stridetech.mcm.model.logs;

import org.junit.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class ChangeLogEntryTest {
    @BeforeClass
    public static void setUpBeforeClass(){

    }
    @Before
    public void setUp(){

    }
    @After
    public void tearDown(){

    }
    @Test
    public void testConstructor(){
        // No-Arg constructor does not set any fields with defaults
        ChangeLogEntry<Double> c = new ChangeLogEntry<>();

        Assert.assertNull(c.effectiveDate);
        Assert.assertNull(c.value);

    }
    @Test
    public void testSortOrder() throws Exception{
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");

        ChangeLogEntry<String> c1 = new ChangeLogEntry<>();
        c1.effectiveDate = f.parse("2016-01-01");
        c1.value         = "Initial import";

        ChangeLogEntry<String> c2 = new ChangeLogEntry<>(
                f.parse("2016-02-01"),
                "First Commit"
        );

        Assert.assertEquals(1, c1.compareTo(c2) );
        Assert.assertEquals(0, c1.compareTo(c1) );
        Assert.assertEquals(-1, c2.compareTo(c1));


    }
}
