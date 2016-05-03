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
public class NetMultiplesDiscount extends GenericDiscount {
    
    private BigDecimal netMultiples;
    

    /**
     * 
     */
    public NetMultiplesDiscount() {
        super();
    }


    /**
     * @param type
     * @param discount
     * @param exclude
     */
    public NetMultiplesDiscount(DiscountType type, BigDecimal discount, Set<CategoryType> exclude, 
            BigDecimal netMultiples) {
        
        super(type, discount, exclude);
        this.netMultiples = netMultiples;
        
    }


    /* (non-Javadoc)
     * @see com.retail.model.discount.Discount#apply(com.retail.model.Bill)
     */
    @Override
    public BigDecimal calculate(Bill bill) {
        // TODO Auto-generated method stub
        return null;
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
