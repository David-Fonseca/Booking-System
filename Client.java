package edu.ucalgary.ensf409;
//by German Fonseca 30061209
public class Client {
    private String name;
    private String phoneNumber;
    private String address;
    private RewardsProfile rewardsInfo;
    
    public Client(String name, String phoneNumber, String address){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.rewardsInfo=new RewardsProfile(1);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean enrollRewards(String newNumber){
        try{
        rewardsInfo=new RewardsProfile(newNumber);
        }
        catch(InvalidRewardsNumException e){
            return false;
        }
        return true;
    }
    public String getRewardsNumber(){
        return rewardsInfo.getNumber();
    }
    public int getRewardsPoints(){
        return rewardsInfo.getPoints();
    }
    public void updatePoints(int addPoints){
        rewardsInfo.setPoints(addPoints);
    }
}
