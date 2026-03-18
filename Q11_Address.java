package workshop;

// Question 11: Address class with encapsulation using getters and setters

public class Q11_Address {
    private String street;
    private String city;
    private String zipCode;

    // Getters
    public String getStreet()  { return street; }
    public String getCity()    { return city; }
    public String getZipCode() { return zipCode; }

    // Setters
    public void setStreet(String street)   { this.street = street; }
    public void setCity(String city)       { this.city = city; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public static void main(String[] args) {
        Q11_Address address = new Q11_Address();
        address.setStreet("Thamel Street");
        address.setCity("Kathmandu");
        address.setZipCode("44600");

        System.out.println("Street: "   + address.getStreet());
        System.out.println("City: "     + address.getCity());
        System.out.println("Zip Code: " + address.getZipCode());
    }
}
