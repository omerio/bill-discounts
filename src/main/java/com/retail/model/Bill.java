package com.retail.model;

import java.math.BigDecimal;
import java.util.List;

import com.retail.model.discount.Discount;
import com.retail.types.CategoryType;

/**
 * @author Omer Dawelbeit (omerio)
 *
 */
public class Bill {
    
    private BigDecimal net;
    
    private CategoryType category;
    
    private List<Discount> alwaysApplicable;
    
    private List<Discount> mutuallyExclusive;
    
    
    /**
     * 
     */
    public Bill() {
        super();
    }
    
    
    /**
     * @param net
     * @param category
     */
    public Bill(BigDecimal net, CategoryType category) {
        super();
        this.net = net;
        this.category = category;
    }


    /**
     * 
     * @return
     */
    public BigDecimal applyDiscounts() {
        return null;
    }

    /**
     * @return the net
     */
    public BigDecimal getNet() {
        return net;
    }

    /**
     * @param net the net to set
     */
    public void setNet(BigDecimal net) {
        this.net = net;
    }

    /**
     * @return the category
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(CategoryType category) {
        this.category = category;
    }

    /**
     * @return the alwaysApplicable
     */
    public List<Discount> getAlwaysApplicable() {
        return alwaysApplicable;
    }

    /**
     * @param alwaysApplicable the alwaysApplicable to set
     */
    public void setAlwaysApplicable(List<Discount> alwaysApplicable) {
        this.alwaysApplicable = alwaysApplicable;
    }

    /**
     * @return the mutuallyExclusive
     */
    public List<Discount> getMutuallyExclusive() {
        return mutuallyExclusive;
    }

    /**
     * @param mutuallyExclusive the mutuallyExclusive to set
     */
    public void setMutuallyExclusive(List<Discount> mutuallyExclusive) {
        this.mutuallyExclusive = mutuallyExclusive;
    }

}
