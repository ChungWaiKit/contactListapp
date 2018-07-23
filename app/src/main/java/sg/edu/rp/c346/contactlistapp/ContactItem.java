package sg.edu.rp.c346.contactlistapp;

/**
 * Created by 16019865 on 23/7/2018.
 */

public class ContactItem {
    private String name;
    private int countryCode;
    private int number;

    public ContactItem(String name, int countryCode, int number) {
        this.name = name;
        this.countryCode = countryCode;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
