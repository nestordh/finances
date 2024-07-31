import Expense.Category;
import Expense.Expense;
import Expense.User;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTrackerApp {
    public static void main(String[] args) {

        System.out.println("Hola");


        User User01 = new User(0 ,"Nestor", "nestor@email.com", "NH");
        User User02 = new User (1,"Juan", "JP", "JP");
        User User03 = new User (2, "Maria","maria@email.com","MA");
        User User04 = new User(4, "Jose", "Soto", "hera 125", "5555-0001", "js@email.com", 12345678, "JS");
        User User05 = new User(5,"Vero","Hernandez","calle 1234", "32165498", "vero@email.com", 458796341 ,"VH");

        Expense exp01 = new Expense(100, "comida");
        Expense exp02 = new Expense(150, "Transporte");
        Expense exp03 = new Expense(200, "Salud");
        Expense exp04 = new Expense(250, "Technology");
        Expense exp05 = new Expense(300, "Comida");
        Expense exp06 = new Expense(350, "Comida");
        Expense exp07 = new Expense(400, "22-5-22", "Comida", "almuerzo");


        Category cat01 = new Category("Comida","cena");
        Category cat02 = new Category("Super","Alimento");
        Category cat03 = new Category("super","Verduleria");
        Category cat04 = new Category("Technology","Aparatos");


        System.out.println("El usuario 1 es:" + User01.getName());
        System.out.println("El alias del usuario 2 es: "+User02.getAlias());
        System.out.println("El Mail del usuario 3 es: "+User03.getEmail());
        System.out.println("El dni del user4 :" + User05.getDni());
        System.out.println("El domicilio del user5 :" + User05.getDomicile());

        System.out.println("La categoria es: " + cat01.getName());
        System.out.println("La categoria es "+cat01.getName()+ " y es " + cat01.getDescription());


        //System.out.println("Total gastado por Nestor: " + User01.getTotalExpenses());
        //System.out.println("Promedio gastado por Juan: " + User02.getAverageExpense());
        //System.out.println("Total de gastos por categoria por Maria: " + User03.getNumberOfExpensesInCategory(""));

        //System.out.println("Gasto con ID 1: " + User01.getExpenses().get(0).toString());

        System.out.println(User04.personDate());
    }
}