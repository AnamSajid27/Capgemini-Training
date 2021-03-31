package com.Q7.model;

import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "order")
public class Order {

    @Id
    private  String id;
    private String item;
    private Integer amountPaid;

    public Order(){}

    public Order(String id, String item, Integer amountPaid) {
        this.id = id;
        this.item = item;
        this.amountPaid = amountPaid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", item='" + item + '\'' +
                ", amountPaid=" + amountPaid +
                '}';
    }
}
