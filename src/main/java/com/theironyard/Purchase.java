package com.theironyard;

/**
 * Created by VeryBarry on 10/25/16.
 */
public class Purchase {
    int customerId;
    String date;
    String creditCard;
    int cvv;
    String category;

    public Purchase() {
    }

    public Purchase(int customerId, String date, String creditCard, int cvv, String category) {
        this.customerId = customerId;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.category = category;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
