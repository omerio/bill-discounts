package com.retail.model.discount;

import java.math.BigDecimal;
import java.util.Set;

import com.retail.model.Bill;
import com.retail.types.CategoryType;
import com.retail.types.DiscountType;

/**
 * @author Omer Dawelbeit (omerio)
 *
 */
public class CustomerPeriodDiscount extends GenericDiscount {
    
    private Integer months;
    
    /**
     * 
     */
    public CustomerPeriodDiscount() {
        super();
    }


    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public CustomerPeriodDiscount(DiscountType type, BigDecimal discount, Set<CategoryType> exclude,
            Integer months) {
        
        super(type, discount, exclude);
        this.months = months;
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
