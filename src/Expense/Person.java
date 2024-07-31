package Expense;

public abstract class Person {
    int id;
    String name;
    String lastName;
    String domicile;
    String phone;
    String email;
    Integer dni;

    public Person() {
    }

    public Person(String name, String lastName, Integer dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Person(int id, String name, String lastName, String domicile, String phone, String email, Integer dni) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.domicile = domicile;
        this.phone = phone;
        this.email = email;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", domicile='" + domicile + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public abstract String personDate();

}
