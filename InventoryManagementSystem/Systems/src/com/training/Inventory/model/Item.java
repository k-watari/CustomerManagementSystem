package com.training.Inventory.model;

public class Item {
    private Integer item_id;
    private String name;
    private Integer price;
    private Integer stock;
    private String category;

    public Item(){

    }

    public Item(String name, Integer price, Integer stock, String category){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    //getter、setter

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                "name=" + name + '\'' +
                "price" + price + '\'' +
                "stock" + stock + '\'' +
                "category" + category + '\'' +
                '}';
    }

}
