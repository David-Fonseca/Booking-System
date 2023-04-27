package edu.ucalgary.ensf409;
//by German Fonseca 30061209
public class EmergVet {
    private String name;
    private String phoneNum;
    EmergVet(String name, String phoneNumber){
        this.name= name;
        this.phoneNum = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
}
