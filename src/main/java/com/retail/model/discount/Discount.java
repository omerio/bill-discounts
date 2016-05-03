package com.retail.model.discount;

import java.math.BigDecimal;

import com.retail.model.Bill;

/**
 * @author Omer Dawelbeit (omerio)
 *
 */
public interface Discount {
    
    /**
     * Apply the discount to the provided bill
     * @param bill - the Bill instance for which the discount should be applied
     * @return the discounted amount if applicable, null otherwise
     */
    public BigDecimal calculate(Bill bill);

}
