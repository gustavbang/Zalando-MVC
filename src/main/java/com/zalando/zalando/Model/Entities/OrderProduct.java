package com.zalando.zalando.Model.Entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "order_product")
public class OrderProduct {
    @Id
    private int fkOrder;
    private int fkProduct;
    private int quantity;

    public OrderProduct() {
    }

    public OrderProduct(int fkOrder, int fkProduct, int quantity) {
        this.fkOrder = fkOrder;
        this.fkProduct = fkProduct;
        this.quantity = quantity;
    }

    public int getFkOrder() {
        return fkOrder;
    }

    public void setFkOrder(int fkOrder) {
        this.fkOrder = fkOrder;
    }

    public int getFkProduct() {
        return fkProduct;
    }

    public void setFkProduct(int fkProduct) {
        this.fkProduct = fkProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
