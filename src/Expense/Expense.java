package Expense;

import java.util.Locale;

public class Expense {
//propiedades amound, date, category, description

    private  static int idCounter = 0;
    private static  int id;
    private double amount;
    private String date;
    private String category;
    private String description;

    public Expense() {
    }

    public Expense(double amount, String category) {
        this.amount = amount;
        this.category = category;
    }

    public Expense (double amount, String date, String category, String description) {
    this.id = ++idCounter;
    this.amount = amount;
    this.date = date;
    //this.category = category.toLowerCase();
    this.category = category;
    this.description = description;
}


    public int getId() { return id;}

    public double getAmount() { return amount;}

    public void setAmount(double amount) { this.amount = amount; }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        //this.category = category.toLowerCase();
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() { return "Date: " + date +  ", Category: " + category  + ", Description: " + description; }


}
