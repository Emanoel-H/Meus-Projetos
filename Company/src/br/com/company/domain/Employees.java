package br.com.company.domain;

public class Employees {
    private Integer id;
    private String name;
    private String surname;


    public Employees (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Employees(Integer id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("The employee's name is: %s %s, and its id is %d.", this.name, this.surname, this.id);
    }
}
