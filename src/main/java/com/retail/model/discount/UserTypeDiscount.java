package com.retail.model.discount;

import java.math.BigDecimal;
import java.util.Set;

import com.retail.model.Bill;
import com.retail.types.CategoryType;
import com.retail.types.DiscountType;
import com.retail.types.UserType;

/**
 * @author Omer Dawelbeit (omerio)
 *
 */
public class UserTypeDiscount extends GenericDiscount {
    
    private UserType userType;
    
    

    /**
     * 
     */
    public UserTypeDiscount() {
        super();
    }



    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public UserTypeDiscount(DiscountType type, BigDecimal discount, Set<CategoryType> exclude, UserType userType) {
        super(type, discount, exclude);
        this.userType = userType;
    }



    /* (non-Javadoc)
     * @see com.retail.model.discount.Discount#apply(com.retail.model.Bill)
     */
    @Override
    public BigDecimal apply(Bill bill) {
        // TODO Auto-generated method stub
        return null;
    }



    /**
     * @return the userType
     */
    public UserType getUserType() {
        return userType;
    }



    /**
     * @param userType the userType to set
     */
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}
