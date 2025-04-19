
public class User {
    private final String name;
    private final String studentID;

    public User(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
    }
    public String getName(){
        return name;
    }

    public String getStudentID(){
        return studentID;
    }

    public void login(){
        System.out.println("Login method in user class.");
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
    }
}
