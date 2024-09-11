package libradilla.it2c;

public class Classes {
    
    int id, hours;
    String name;
    double gpa, income;
    
    public void addDetails(int did, String dname, double dgpa, double dincome, int dhours) {
        this.id = did;
        this.name = dname;
        this.gpa = dgpa;
        this.income = dincome;
        this.hours = dhours;
    }
    
    public void viewDetails(){
        String remarks = (gpa > 3.5)? "Approved" : "Denied";
        
        System.out.printf("%-10d %-20s %10.2f %10.2f %-20d %-20s%n",
                this.id, this.name, this.gpa, this.income, this.hours, remarks );
    }
}