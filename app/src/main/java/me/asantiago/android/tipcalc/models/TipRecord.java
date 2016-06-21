package me.asantiago.android.tipcalc.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Amador on 07/06/2016.
 */
public class TipRecord {
    private double bill;
    private Date timestamp;
    private int tipPercentage;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public double getTip() {
        return bill*(tipPercentage/100d);
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(timestamp);
    }
}
