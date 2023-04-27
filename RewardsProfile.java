package edu.ucalgary.ensf409;
//by German Fonseca 30061209
import java.util.regex.*;
public class RewardsProfile {
    private String rewardsNum="Not enrolled";
    private int pointsTotal=10;
    public RewardsProfile(String newNumber) throws InvalidRewardsNumException{
        String regex="^\\d{7}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher match=p1.matcher(newNumber);
        boolean matchFound=match.find();
        if(matchFound==true){
            this.rewardsNum=newNumber;
        }
        else{
            throw new InvalidRewardsNumException();
        }
    }
    public RewardsProfile(int i){
        this.rewardsNum="Not enrolled";
        this.pointsTotal=10;
    }
    public RewardsProfile() throws InvalidRewardsNumException{

            throw new InvalidRewardsNumException();
        
    }
    
 

    public void setPoints(int addPoints){
        pointsTotal+=addPoints;
    }
    public int getPoints(){
        return this.pointsTotal;
    }
    public String getNumber(){
        return this.rewardsNum;
    }
}
