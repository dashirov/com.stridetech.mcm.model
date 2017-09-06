package com.stridetech.mcm.model.meta;
/**
 * Created by dashirov on 11/17/16.
 */
import com.stridetech.mcm.model.enums.AccountType;
import com.stridetech.mcm.model.enums.AccountStatus;
import com.stridetech.mcm.model.enums.ProductStatus;
import org.junit.*;

import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

public class AccountTest {
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
        Account a = new Account();
        Assert.assertNull(a.getId());
        Assert.assertNull(a.getProducts());
        Assert.assertNull(a.getDescription());
        Assert.assertNull(a.getName());
        Assert.assertNull(a.getType());
        Assert.assertNull(a.getStatus());
        Assert.assertNull(a.getStatusUpdated());
    }
    @Test
    public void testSettersAndGetters(){

        // Typical DTO Use case

        Product p1 = new Product();
        p1.setId("WDI");
        p1.setName("Web Development Immersive");
        p1.setDescription("BREAK INTO WEB DEVELOPMENT IN 13 WEEKS");
        p1.setStatus(ProductStatus.ACTIVE);

        Product p2 = new Product();
        p2.setId("WDIR");
        p2.setName("Web Development Immersive Remote");
        p2.setDescription("BREAK INTO WEB DEVELOPMENT IN 13 WEEKS");
        p2.setStatus(ProductStatus.ACTIVE);

        SortedSet<String> products = new TreeSet<>();
        products.add(p1.getId());
        products.add(p2.getId());


        // Coverage to ensure all interface methods are actually implemented

        Account a = new Account();
        a.setId(1L);
        a.setName("Enterprise Sales");
        a.setDescription("B2B");
        a.setStatus(AccountStatus.ACTIVE);
        a.setType(AccountType.BUSINESS_UNIT);

        Date now = new Date();
        a.setStatusUpdated(now);

        a.setProducts(products);

        Assert.assertNotNull(a.getId());
        Assert.assertNotNull(a.getType());
        Assert.assertNotNull(a.getDescription());
        Assert.assertNotNull(a.getName());
        Assert.assertNotNull(a.getStatus());
        Assert.assertNotNull(a.getStatusUpdated());

        Assert.assertEquals(1L, a.getId().longValue());
        Assert.assertEquals("Enterprise Sales",a.getName());
        Assert.assertEquals("B2B", a.getDescription());
        Assert.assertEquals(AccountType.BUSINESS_UNIT,a.getType());
        Assert.assertEquals(AccountStatus.ACTIVE,a.getStatus());
        Assert.assertEquals("WDI",a.getProducts().first());
        Assert.assertEquals("WDIR",a.getProducts().last());
        Assert.assertEquals(now, a.getStatusUpdated());
    }
}
