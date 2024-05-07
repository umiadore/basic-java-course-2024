package classwork23.bank_account;

public class AccountHolder {
    private String fullName;
    private String address;
    private int age;

    //constructor
    public AccountHolder(String fullName, String address, int age) {
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    //getters x setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
