package Models;

public class Cliente {

    private String name = "";
    private String lastName = "";
    private String number = "";

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Cliente(String name, String lastName, String number) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }
}
