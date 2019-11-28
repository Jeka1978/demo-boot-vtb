package com.vtb.demobootvtb.aop;

import com.vtb.vtbstarter.DBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TerminatorQuoter implements Quoter {
    @Autowired
    private Quoter proxy;

    @Override
    public void sayQuote() {
        System.out.println("I'll not be back");
        throw new DBException("fire all DBA");
    }

    @Override
    public void beer() {
        this.sayQuote();
    }
}
