public class Address {
    private String district;
    private String street;
    private int streetNumber;

    public Address(String district, String street, int streetNumber) {
        this.district = district;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return streetNumber + " " + street + ", " + district;
    }
}




/*

    class Address
An Address class will have three instance variables. Ensure that each instance variable is declared as private.
    district (String)
    street (String)
    streetNumber (int)
    An Address class will have one constructor.
    The constructor will have three parameters. The three parameters will be used to initialize the three instance variables.
    An Address class will have a getter method for each instance variable.
    An Address class will have a setter method for each instance variable.
    An Address class will have a toString method that returns, for example, a String in the following format:
            "180 Tung Lo Wan Road, Causeway Bay"


 */