package com.retail.model;

import java.util.Date;

import com.retail.types.UserType;

/**
 * @author Omer Dawelbeit (omerio)
 *
 */
public class User {
    
    private Date customerSince;
    
    private UserType type;
    

    /**
     * 
     */
    public User() {
        super();
    }
    
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
