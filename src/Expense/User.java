package Expense;


import java.util.ArrayList;
import java.util.List;

public class User extends Person{
    private String alias;
    private List<Expense> expenses;


    public User(int id, String name, String lastName, String domicile, String phone, String mail, Integer dni, String alias) { }

    public User(int id, String name, String email, String alias) {
        super(id, name, email);
        this.alias = alias;
    }

    public User(int id, String name, String lastName,
                String domicile, String phone, String email,
                Integer dni, String alias,
                List<Expense> expenses) {
        super(id, name, lastName, domicile, phone, email, dni);
        this.alias = alias;
        this.expenses = new ArrayList<>();
    }


    public User( String alias,List<Expense> expenses ) {
        this.alias = alias;
        this.expenses = new ArrayList<>();
    }

    //public String getName() {         return name;     }
    //public void setName(String name) {this.name = name; }

    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }



    //public String getEmail() {         return email;     }
    //public void setEmail(String email) {   this.email = email;}

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }


//construccion pra los gastos totales, el promedio de los gastos,gastos por categoria
    //gastos por id y eliminacion del mismo

    public double getTotalExpenses() {
      double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
   }
    public double getAverageExpense() {
        double total = getTotalExpenses();
        if (total == 0) {
            return 0;
        } else {
            return total / expenses.size();
        }
    }
    public int getNumberOfExpensesInCategory(String category) {
        int count = 0;
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String personDate() {
        return null;
    }


//    public void mostrarUsuario() {
//        System.out.println( "El nombre de usuario es: " +name+" , su email es: "+email+" y su alias es: " + alias);
//    }




}
