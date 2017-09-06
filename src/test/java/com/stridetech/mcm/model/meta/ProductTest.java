package com.stridetech.mcm.model.meta;
/**
 * Created by dashirov on 11/17/16.
 */
import com.stridetech.mcm.model.enums.ProductStatus;
import org.junit.*;

public class ProductTest {
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
        Product p = new Product();
        Assert.assertNull(p.getId());
        Assert.assertNull(p.getDescription());
        Assert.assertNull(p.getName());
        Assert.assertNull(p.getStatus());
    }
    @Test
    public void testSettersAndGetters(){

        // Typical DTO Use case

        Product p = new Product();
        p.setId("WDI");
        p.setName("Web Development Immersive");
        p.setDescription("BREAK INTO WEB DEVELOPMENT IN 13 WEEKS");
        p.setStatus(ProductStatus.ACTIVE);


        // Coverage to ensure all interface methods are actually implemented

        Assert.assertNotNull(p.getId());
        Assert.assertNotNull(p.getDescription());
        Assert.assertNotNull(p.getName());
        Assert.assertNotNull(p.getStatus());

        Assert.assertEquals("WDI", p.getId());
        Assert.assertEquals("Web Development Immersive",p.getName());
        Assert.assertEquals("BREAK INTO WEB DEVELOPMENT IN 13 WEEKS", p.getDescription());
        Assert.assertEquals(ProductStatus.valueOf("ACTIVE"),p.getStatus());
    }
}
