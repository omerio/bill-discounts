package com.retail.model.discount;

import java.math.BigDecimal;
import java.util.Set;

import com.retail.types.CategoryType;
import com.retail.types.DiscountType;

/**
 * @author Omer Dawelbeit (omerio)
 *
 */
public abstract class GenericDiscount implements Discount {
    
    private DiscountType type;
    
    private BigDecimal discount;
    
    private Set<CategoryType> exclude;
    
      
    /**
     * 
     */
    public GenericDiscount() {
        super();
    }

    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public GenericDiscount(DiscountType type, BigDecimal discount,
            Set<CategoryType> exclude) {
        super();
        this.type = type;
        this.discount = discount;
        this.exclude = exclude;
    }

    /**
     * @return the discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * @return the exclude
     */
    public Set<CategoryType> getExclude() {
        return exclude;
    }

    /**
     * @param exclude the exclude to set
     */
    public void setExclude(Set<CategoryType> exclude) {
        this.exclude = exclude;
    }

    /**
     * @return the type
     */
    public DiscountType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(DiscountType type) {
        this.type = type;
    }
    
    
    

}
