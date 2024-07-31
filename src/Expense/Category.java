package Expense;

public class Category {

    private String name;
    private String description;
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ...

    // other methods

    @Override
    public String toString() {
        return "Category{" + "name='" + name + '\'' + ", description='" + description + '\'' +  '}';
    }



}
