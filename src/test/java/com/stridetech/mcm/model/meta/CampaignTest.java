package com.stridetech.mcm.model.meta;
/**
 * Created by dashirov on 11/17/16.
 */
import com.stridetech.mcm.model.enums.CampaignStatus;
import com.stridetech.mcm.model.enums.CampaignType;
import com.stridetech.mcm.model.enums.ProductStatus;
import org.junit.*;

public class CampaignTest {
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
        Campaign a = new Campaign();
        Assert.assertNull(a.getProduct());
        Assert.assertNull(a.getTracker());
        Assert.assertNull(a.getMarketplace());
        Assert.assertNull(a.getName());
        Assert.assertNull(a.getType());
        Assert.assertNull(a.getStatus());
        Assert.assertNull(a.getType());
        Assert.assertNull(a.getBusinessUnit());
    }
    @Test
    public void testSettersAndGetters(){

        // Typical DTO Use case

        Product p = new Product();
        p.setId("WDI");
        p.setName("Web Development Immersive");
        p.setDescription("BREAK INTO WEB DEVELOPMENT IN 13 WEEKS");
        p.setStatus(ProductStatus.ACTIVE);


        Marketplace m = new Marketplace();
        m.setId(1L);
        m.setName("Google");

        // Coverage to ensure all interface methods are actually implemented

        Campaign c = new Campaign();
        c.setProduct(p.getId());
        c.setTracker("WDI^drm001");
        c.setMarketplace(m.getId());
        c.setName("Google NY Metro AdSense English Female 18-28");
        c.setType(CampaignType.CPC);
        c.setBusinessUnit(1L);
        c.setStatus(CampaignStatus.PAUSED);


        Assert.assertNotNull(c.getProduct());
        Assert.assertNotNull(c.getType());
        Assert.assertNotNull(c.getTracker());
        Assert.assertNotNull(c.getName());
        Assert.assertNotNull(c.getStatus());
        Assert.assertNotNull(c.getMarketplace());
        Assert.assertNotNull(c.getBusinessUnit());



        Assert.assertEquals("Google NY Metro AdSense English Female 18-28", c.getName());
        Assert.assertEquals(m.getId(), c.getMarketplace());
        Assert.assertEquals(CampaignType.CPC,c.getType());
        Assert.assertEquals(CampaignStatus.PAUSED,c.getStatus());
        Assert.assertEquals("WDI",c.getProduct());
        Assert.assertEquals("WDI^drm001", c.getTracker());
        Assert.assertEquals(1L, c.getBusinessUnit().longValue());
    }
}
