package edu.ucalgary.ensf409;
//by German Fonseca 30061209
public class CareProfile {
    private String[] medList;
    private String medInstructions;
    private String feedingInstructions;
    private int len;
    public CareProfile(String[] medList, String meds, String feeding){
        len=medList.length;
        this.medList= new String[len];
        for(int i =0;i<len;i++){
            this.medList[i]=medList[i];
        }
        this.medInstructions=meds;
        this.feedingInstructions=feeding;
    }
    
    public String summarizeCareInstructions(){
   
    StringBuilder out=new StringBuilder(200);
    for(int i=0;i<len;i++){
        out.append(this.medList[i]);
        if (i<len-1){
            out.append(", ");  
        }
    }
    out.append("\n");
    out.append(this.medInstructions);
    out.append("\n");
    out.append(this.feedingInstructions);
    
    return out.toString();
}

   

}
