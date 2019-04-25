public class Student extends Person {

    private String status;

    public Student(){

    }

    public Student(String name,String address,String phoneNumber, String emailAddress, String status){
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return "STUDENT CLASS:\nName = "+this.getName()+"\nAddress = "+this.getAddress()+"\nPhone Number = "+this.getPhoneNumber()
                +"\nEmail Address = "+this.getEmailAddress()+"\nStatus = "+getStatus();
    }

}
