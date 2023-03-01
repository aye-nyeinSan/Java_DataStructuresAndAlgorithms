import java.util.List;

public class VaccinePerson {
    private  int SID;
    private String firstname,lastname; 
    private String[] Vaccine;

  

    public VaccinePerson(int sID2, String firstname2, String lastname2, String[] strings) {
        this.SID=sID2;
        this.firstname=firstname2;
        this.lastname=lastname2;
        this.Vaccine=strings;
    }

    public int getSID() {
        return SID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

   
    
    public String[] getVaccine() {
        return Vaccine;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   
    public void setVaccine(String[] vaccine) {
        Vaccine = vaccine;
    }

    public String toString(){
        return "Id:"+this.SID+" firstname:"+this.firstname+" lastname:"+this.lastname+" \nprevious list of Vaccines: "+String.join(",",this.Vaccine);
    }

   
}
