package com.retail.model.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

import com.retail.model.bill.Discountable;
import com.retail.types.CategoryType;
import com.retail.types.DiscountType;

/**
 * A discount based on a certain amount off a net multiples.
 * e.g. $5 off for every $100
 * 
 * @author Omer Dawelbeit (omerio)
 *
 */
public class NetMultiplesDiscount extends GenericDiscount {
    
    private BigDecimal netMultiples;
    

    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public NetMultiplesDiscount(DiscountType type, BigDecimal discount, Set<CategoryType> exclude, 
            BigDecimal netMultiples) {
        
        super(type, discount, exclude);
        
        if((netMultiples == null) || BigDecimal.ZERO.equals(netMultiples)) {
            throw new IllegalArgumentException("netMultiples is missing or invalid");
        }
        
        this.netMultiples = netMultiples;
        
    }

    @Override
    public boolean isApplicable(Discountable discountable) {
        
        validate(discountable);
        
        if(netMultiples == null) {
            throw new IllegalArgumentException("netMultiples is required");
        }
        
        // check if the category is excluded
        boolean applicable = super.isCategoryApplicable(discountable.getCategory());
        
        if(applicable) {

            int compare = discountable.getNetPayable().compareTo(netMultiples);

            // only applicable if the netPayable is equal to or greater than the netMultiples
            applicable = (compare == 0) || (compare == 1);

        } 
        
        return applicable;
    }
    
    /**
     * Net multiples overrides the GenericDiscount calculate method 
     */
    @Override
    public BigDecimal calculate(Discountable discountable) {
        BigDecimal amount = null;
        
        if(this.isApplicable(discountable)) {
            
            amount = discountable.getNetPayable().divide(netMultiples, RoundingMode.FLOOR);
            
            amount = amount.multiply(getDiscount());
        }
        
        return amount;
    }
    
    /**
     * @return the netMultiples
     */
    public BigDecimal getNetMultiples() {
        return netMultiples;
    }


    /**
     * @param netMultiples the netMultiples to set
     */
    public void setNetMultiples(BigDecimal netMultiples) {
        this.netMultiples = netMultiples;
    }


}
