package com.stridetech.mcm.model.meta;
/**
 * Created by dashirov on 11/17/16.
 */
import com.stridetech.mcm.model.enums.MarketplaceStatus;
import org.junit.*;

public class MarketplaceTest {
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
        Marketplace p = new Marketplace();
        Assert.assertNull(p.getId());
        Assert.assertNull(p.getDescription());
//        Assert.assertNull(p.getName());
//        Assert.assertNull(p.getStatus());
    }
    @Test
    public void testSettersAndGetters(){

        // Typical DTO Use case

        Marketplace m = new Marketplace();
        m.setId(1L);
        m.setName("Google");
        m.setDescription("Google AdWords and Display Network. Direct relationship");
        m.setStatus(MarketplaceStatus.ACTIVE);

        // Coverage to ensure all interface methods are actually implemented

        Assert.assertNotNull(m.getId());
        Assert.assertNotNull(m.getDescription());
        Assert.assertNotNull(m.getName());
        Assert.assertNotNull(m.getStatus());

        Assert.assertEquals(1L, m.getId().longValue());
        Assert.assertEquals("Google",m.getName());
        Assert.assertEquals("Google AdWords and Display Network. Direct relationship", m.getDescription());
        Assert.assertEquals(MarketplaceStatus.ACTIVE,m.getStatus());
    }
}
