package com.retail.model.discount;

import java.math.BigDecimal;
import java.util.Set;

import com.retail.model.bill.Discountable;
import com.retail.types.CategoryType;
import com.retail.types.DiscountType;
import com.retail.types.UserType;

/**
 * A discount based on the type of the user
 * 
 * @author Omer Dawelbeit (omerio)
 *
 */
public class UserTypeDiscount extends GenericDiscount {
    
    private UserType userType;
    
    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public UserTypeDiscount(DiscountType type, BigDecimal discount, Set<CategoryType> exclude, UserType userType) {
        super(type, discount, exclude);
        if(userType == null) {
            throw new IllegalArgumentException("userType is required");
        }
        this.userType = userType;
    }

    @Override
    public boolean isApplicable(Discountable discountable) {
        
        if((discountable == null) || (discountable.getUser() == null) || 
                (discountable.getUser().getType() == null)) {
            throw new IllegalArgumentException("discountable is missing or invalid");
        }
        
        if(userType == null) {
            throw new IllegalArgumentException("userType is required");
        }
        
        // check if the category is excluded
        boolean applicable = super.isApplicable(discountable.getCategory());
        
        if(applicable) {    
            // check if the userType on this instance matches the one on the discountable
            applicable = userType.equals(discountable.getUser().getType());
        }
        
        return applicable;
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
