package Expense;
//propiedades name, email, arrayExpences

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Expense> expenses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.expenses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

//    public double getTotalExpenses() {}
//    public double getAverageExpense() {}
//    public int getNumberOfExpensesInCategory(String category) {}
//    public Expense getExpenseById(int id) {}
//    public void deleteExpense(int id) {}



}
