package com.training.Inventory.model;

import java.time.LocalDateTime;

public class STOCK_MOVEMENT {
    private Integer history_id;
    private Integer item_id;
    private String status;
    private Integer quantity;
    private LocalDateTime create_date;

    public STOCK_MOVEMENT() {

    }

    public STOCK_MOVEMENT(Integer item_id, String status, Integer quantity) {
        this.item_id = item_id;
        this.status = status;
        this.quantity = quantity;
    }

    //getter、setter

    public Integer getHistory_id() {
        return history_id;
    }

    public void setHistory_id(Integer history_id) {
        this.history_id = history_id;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreate_date() {
        return  create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Stock_Movement{" +
                "history_id=" + history_id +
                ", item_id='" + item_id + '\'' +
                ", status='" + status + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
