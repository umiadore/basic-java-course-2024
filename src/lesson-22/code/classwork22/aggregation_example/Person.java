package classwork22.aggregation_example;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public void introduce() {
        System.out.println("Hello im " + name + ", i live in " + address.getCity()
                + ", " + address.getCountry() + ", in " + address.getStreet());
    }

    // getters x setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
