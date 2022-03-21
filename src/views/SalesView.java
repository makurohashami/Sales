package views;

import models.Product;

import java.util.Scanner;
import static utils.Validator.*;

// View
public class SalesView {


    String title;
    Product model;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        Scanner scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        model.setName(validateName(scanner));

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        model.setQuantity(validateQuantityInput(scanner));

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        model.setPrice(validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
