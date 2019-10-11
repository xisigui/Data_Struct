import java.sql.*;

public class STI_Class{
    public static String ln,fn;
    public static Instructor aaa = new Instructor();   
    public static Student bbb = new Student();  
    private Connection connect() {
        String url = "jdbc:sqlite:C:Data_Struct//Dat.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void save(String tbl) {
        Connection conn = this.connect();
        if(tbl == "ins"){
            try(PreparedStatement ps = conn.prepareStatement("INSERT INTO Instructor(facultyId,lastname,firstname) VALUES(?,?,?)")){
                ps.setInt(1, aaa.getFacultyId());
                ps.setString(2,aaa.getLastname());
                ps.setString(3,aaa.getFirstname());
                ps.executeUpdate();
            }catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }else if(tbl == "st"){
            try(PreparedStatement ps = conn.prepareStatement("INSERT INTO Student(studentID,lastname,firstname) VALUES(?,?,?)")){
                ps.setInt(1, bbb.getStudentID());
                ps.setString(2,bbb.getLastname());
                ps.setString(3,bbb.getFirstname());
                ps.executeUpdate();
            }catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main( String args[] ) {
        STI_Class a = new STI_Class();
        aaa.setfacultyID(123456);
        aaa.setLastname("Miler");
        aaa.setFirstname("Bob");
        a.save("ins");
        bbb.setStudentID(123456);
        bbb.setLastname("Wittrup");
        bbb.setFirstname("Matilde");
        a.save("st");
        
   }
}
