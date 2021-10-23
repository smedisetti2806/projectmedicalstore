package store;

public class Medicines_Builder implements Observer,State{
    
    private String name;
    
    private int id;
    
    private String dose;
    
  
    
    private Patient patient;

   
    
    public Medicines_Builder() {
    
    }

    public Medicines_Builder(String name, int id, String dose,Patient patient) {
        
        this.name = name;
        this.id = id;
        this.dose = dose;
        this.patient = patient;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    
    @Override
    public double calculateBill(double p, double n) {
    
        return p*n;
   
    }


    @Override
    public void Avialability() {
    
        
    }

}
