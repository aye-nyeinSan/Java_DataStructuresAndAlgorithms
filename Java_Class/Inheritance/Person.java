import java.math.BigInteger;

public class Person {
    private String name,address,email;
    private BigInteger phnum;

    public Person(){ }

    public  Person(String name) {
        this.name=name;
    }
    public String toString() {
        return  getClass().getName()+" : "+this.name;
    }
}
