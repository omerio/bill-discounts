package com.retail.model.discount;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import com.retail.model.bill.Discountable;
import com.retail.types.CategoryType;
import com.retail.types.DiscountType;

/**
 * A discount based on how long the user has been a customer
 * 
 * @author Omer Dawelbeit (omerio)
 *
 */
public class CustomerPeriodDiscount extends GenericDiscount {
    
    private Integer months;
    

    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public CustomerPeriodDiscount(DiscountType type, BigDecimal discount, Set<CategoryType> exclude,
            Integer months) {
        
        super(type, discount, exclude);
        if(months == null) {
            throw new IllegalArgumentException("months is required");
        }
        this.months = months;
    }

    @Override
    public boolean isApplicable(Discountable discountable) {
        
        if((discountable == null) || (discountable.getUser() == null) || 
                (discountable.getUser().getCustomerSince() == null)) {
            throw new IllegalArgumentException("discountable is missing or invalid");
        }
        
        if(months == null) {
            throw new IllegalArgumentException("months is required");
        }
        
        // check if the category is excluded
        boolean applicable = super.isApplicable(discountable.getCategory());
        
        if(applicable) {
            
            // check if the number of months on this instance is smaller than the time the user
            // has been a customer
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, -months);

            Date customerSince = discountable.getUser().getCustomerSince();

            applicable = customerSince.before(calendar.getTime());

        }

        return applicable;
    }


    /**
     * @return the months
     */
    public Integer getMonths() {
        return months;
    }


    /**
     * @param months the months to set
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

}
