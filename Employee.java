package edu.ucalgary.ensf409;
//by German Fonseca 30061209
public class Employee {
    private String name;
    private final String IDNUMBER;
    private String managerID;
    private Employee[] supervisedEmployees;

    public Employee(String name, String idNumber){
        this.name=name;
        this.IDNUMBER=idNumber;
        this.managerID=null;
        supervisedEmployees=new Employee[10];

    }
    public Employee(String name, String idNumber, String managerID){
        this.name=name;
        this.IDNUMBER=idNumber;
        this.managerID=managerID;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getIDNumber(){
        return this.IDNUMBER;
    }
    public String getManagerID(){
        return this.managerID;
    }
    public void setManagerID(String newManagerID){
        this.managerID=newManagerID;
    }
    public void addEmployee(Employee newEmployee){
        for(int i=0;i < supervisedEmployees.length; i++){
            if(supervisedEmployees[i]==null){
                supervisedEmployees[i]=newEmployee;
                break;
            }
        }

    }
    public Employee[] getEmployees(){
        return this.supervisedEmployees;
    }



}
