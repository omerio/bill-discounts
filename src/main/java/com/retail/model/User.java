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
        this.customerSince = customerSince;
        this.type = type;
    }



    /**
     * @return the customerSince
     */
    public Date getCustomerSince() {
        return customerSince;
    }

    /**
     * @param customerSince the customerSince to set
     */
    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    /**
     * @return the type
     */
    public UserType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(UserType type) {
        this.type = type;
    }
    
    
    

}
