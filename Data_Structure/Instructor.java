public class Instructor {
    private String lastname, firstname;
    private int facultyID;
    public Instructor(){
        
    }
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public int getFacultyId(){
        return facultyID;
    }    
    public void setLastname(String lname){
        this.lastname = lname;
    }
    public void setFirstname(String fname){
        this.firstname = fname;
    }
    public void setfacultyID(int Id){
        this.facultyID = Id;
    }
}
