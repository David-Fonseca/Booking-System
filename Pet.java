package edu.ucalgary.ensf409;
//by German Fonseca 30061209
public class Pet {
    private final String NAME;
    private final String SPECIES;
    private final String BREED;
    private final String COLOUR;
    private boolean vaccinationStatus;
    private Client owner;
    private EmergVet vet;
    private CareProfile care;
    
    public Pet(String name, String species, String breed, String colour, Client owner){
        this.NAME=name;
        this.SPECIES=species;
        this.BREED=breed;
        this.COLOUR=colour;
        this.owner=owner;
        this.vaccinationStatus=false;
    }
    public void setVet(EmergVet vet){
        this.vet=new EmergVet(vet.getName(),vet.getPhoneNum());

    }
    public EmergVet getVet(){
        return this.vet;
    }
    public void updateVaccineStatus(boolean change){
        this.vaccinationStatus=change;
    }
    public boolean getVaccineStatus(){
        return this.vaccinationStatus;
    }
    public void setCare(String[] meds, String medInstr, String feedingInstr){
        this.care=new CareProfile(meds,medInstr,feedingInstr);
    }
    public String getCareSummary(){
        
        String out2=care.summarizeCareInstructions();
        StringBuilder out1=new StringBuilder(500);
        out1.append("Care for ");
        out1.append(this.NAME);
        out1.append(":");
        out1.append("\n");
        out1.append(out2);
        return out1.toString();
    }
    public Client getOwner(){
        return this.owner;
    }
    public void setOwner(Client updateOwner){
        this.owner=updateOwner;
    }
    public String getName(){
        return this.NAME;
    }
    public String getSpecies(){
        return this.SPECIES;
    }
    public String getBreed(){
        return this.BREED;
    }
    public String getColour(){
        return this.COLOUR;
    }

}
