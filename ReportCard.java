package edu.ucalgary.ensf409;
//by German Fonseca 30061209
public class ReportCard {
    private final Booking REPORT;   
    ReportCard(Booking reportinfo){
        REPORT=reportinfo;
    }
    public String printReport(){
        StringBuilder output=new StringBuilder(100);
        output.append(REPORT.getCaregiver().getName());
        output.append(" enjoyed taking care of ");
        output.append(REPORT.getBookedPet().getName());
        output.append(". See you next time!");
        return output.toString();
    }
}
