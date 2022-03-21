package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        String output = "Наименование товара: " + model.getName() + "\n";
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.
        output = output + "Общий доход (грн.): " + Rounder.rounderNum(model.getFullIncome())  + "\n";
        output = output + "Сумма налога (грн.): " + Rounder.rounderNum(model.getIncomeTax()) + "\n";
        output = output + "Чистый доход (грн.): " + Rounder.rounderNum(model.getClearIncome());
        view.getOutput(output);
    }
}
