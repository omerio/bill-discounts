package com.retail.model.user;

import java.util.Date;

import com.retail.types.UserType;

/**
 * Represents a retail website user, users can be employees, affiliates or
 * customers.
 * 
 * @author Omer Dawelbeit (omerio)
 *
 */
public class User {
    
    private Date customerSince;
    
    private UserType type;
      
    /**
     * @param customerSince
     * @param type
     */
    public User(Date customerSince, UserType type) {
        super();
        if(customerSince != null) {
            this.customerSince = new Date(customerSince.getTime());
        }
        this.type = type;
    }

    /**
     * @return the customerSince
     */
    public Date getCustomerSince() {
        Date since = this.customerSince;
        if(this.customerSince != null) {
            since = new Date(customerSince.getTime());
        }
        return since;
    }

    /**
     * @return the type
     */
    public UserType getType() {
        return type;
    }
    
}
