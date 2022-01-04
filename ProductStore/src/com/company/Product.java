package com.company;

public class Product {
    public String Name;
    public double Price;
    public int Quantity;

    public Product(String name, double price, int quantity) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }



    public void addQuantity(int quantityAdd){
        Quantity = Quantity + quantityAdd;
    }

    public void removeQuantity(int quantityRemove){
        Quantity = Quantity - quantityRemove;
    }
    public double Total() {
        return Price * Quantity;
    }

    public String ToString() {
        return (Name
                + ", $ "
                + String.format("%.2f",Price)
                + ", "
                + Quantity
                + " unidades, Total: $ "
                + String.format("%.2f",Total())
        );
    }


}
