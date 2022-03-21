package models;

import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговую ставку объявите в виде константы
    // здесь ...
    final double taxPercent = 0.05; //5%

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

    //getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    public double getFullIncome() {
        return quantity * price;
    }
    // Расчёт суммы налога с продаж.
    // здесь ...
    public double getIncomeTax() {
        return getFullIncome() * taxPercent;
    }
    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    public double getClearIncome() {
        return getFullIncome() - getIncomeTax();
    }
}
