public class Student extends User{
    public Student(String name, String studentID){
        super(name, studentID);
    }
    @Override
    public void login(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String inputID = scanner.nextLine();

        if(inputName.equalsIgnoreCase(getName()) && inputID.equalsIgnoreCase(getStudentID())){
            displayInfo();
        }else{
            System.out.println("Login failed! Invalid name or student ID.");
        }
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student " + getName() + " has successfuly logged in.");

    }
}