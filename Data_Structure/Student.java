public class Student {
    private String lastname, firstname;
    private int studentID;
    
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public int getStudentID(){
        return studentID;
    }    
    public void setLastname(String lname){
        this.lastname = lname;
    }
    public void setFirstname(String fname){
        this.firstname = fname;
    }
    public void setStudentID(int Id){
        this.studentID = Id;
    }
}
