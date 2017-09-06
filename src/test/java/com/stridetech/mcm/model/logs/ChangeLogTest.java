package com.stridetech.mcm.model.logs;
/**
 * Created by dashirov on 11/17/18.
 */

import org.junit.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeLogTest {
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
        ChangeLog<Double> c = new ChangeLog<>();

        Assert.assertEquals(0,c.getChangeLogs().size());
        Assert.assertEquals(Double.valueOf(0.0),c.getValue(new Date(),0.0));
    }
    @Test
    public void testLogic() throws Exception{
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        ChangeLog<String> c = new ChangeLog<>();
        c.addLogEntry(new ChangeLogEntry(f.parse("2016-01-01 00:00:00"),"NEW"));
        c.addLogEntry(new ChangeLogEntry(f.parse("2016-01-01 00:00:01"),"Day 1"));
        c.addLogEntry(new ChangeLogEntry(f.parse("2016-01-02 00:00:01"),"Day 2"));
        c.addLogEntry(new ChangeLogEntry(f.parse("2016-01-03 00:00:01"),"Day 3"));
        c.addLogEntry(new ChangeLogEntry(f.parse("2016-01-04 00:00:00"),"DEAD"));

        Assert.assertEquals("Non-Existent",c.getValue(f.parse("2015-01-01 00:00:00"),"Non-Existent"));
        Assert.assertEquals("NEW",c.getValue(f.parse("2016-01-01 00:00:00"),"Non-Existent"));
        Assert.assertEquals("Day 1",c.getValue(f.parse("2016-01-01 00:00:03"),"Non-Existent"));
        Assert.assertEquals("Day 2",c.getValue(f.parse("2016-01-02 23:59:59"),"Non-Existent"));
        Assert.assertEquals("DEAD",c.getValue(f.parse("2016-12-01 00:00:00"),"Non-Existent"));

        Assert.assertEquals(5,c.getChangeLogs().size());

        c.addLogEntry(new ChangeLogEntry(f.parse("2016-01-04 00:00:00"),"APPARENTLY NOT DEAD"));

        Assert.assertEquals(5,c.getChangeLogs().size());
        Assert.assertNotEquals("DEAD",c.getValue(f.parse("2016-12-01 00:00:00"),"Non-Existent"));
        Assert.assertEquals("APPARENTLY NOT DEAD",c.getValue(f.parse("2016-12-01 00:00:00"),"Non-Existent"));


    }
}
