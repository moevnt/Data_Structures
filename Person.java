public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(){

    }

    public Person(String name, String address,String phoneNumber,String emailAddress){
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString(){
        return "Name = "+this.name+"\nAddress = "+this.address+"\nPhone Number = "+this.phoneNumber+"\nEmail Address = "+this.emailAddress;
    }
}
