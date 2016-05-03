package com.retail.model.discount;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.retail.types.DiscountType;
import com.retail.types.UserType;

public class UserTypeDiscountTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserTypeDiscountValid() {
        UserTypeDiscount discount = 
                new UserTypeDiscount(DiscountType.AMOUNT, new BigDecimal(10), null, UserType.AFFILIATE);
        
        assertEquals(UserType.AFFILIATE, discount.getUserType());
        assertEquals(DiscountType.AMOUNT, discount.getType());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUserTypeDiscountInvalidDiscount() {
         new UserTypeDiscount(DiscountType.PERCENTAGE, null, null, UserType.AFFILIATE);
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testUserTypeDiscountInvalidUserType() {
         new UserTypeDiscount(DiscountType.PERCENTAGE, new BigDecimal(10), null, null);
    }

    @Test
    public void testIsApplicableDiscountable() {
        fail("Not yet implemented");
    }

}
