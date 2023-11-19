package com.Design.Design.pojo;

import java.io.Serializable;

public class Request implements Serializable {

    private Long groceryTotal;
    private Long otherItemTotal;
    private String percentageBasedEligible;

    public Long getOtherItemTotal() {
        return otherItemTotal;
    }

    public void setOtherItemTotal(Long otherItemTotal) {
        this.otherItemTotal = otherItemTotal;
    }

    public Long getGroceryTotal() {
        return groceryTotal;
    }

    public void setGroceryTotal(Long groceryTotal) {
        this.groceryTotal = groceryTotal;
    }

    public String getPercentageBasedEligible() {
        return percentageBasedEligible;
    }

    public void setPercentageBasedEligible(String percentageBasedEligible) {
        this.percentageBasedEligible = percentageBasedEligible;
    }
}
