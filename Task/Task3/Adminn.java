public class Adminn extends User {
    private final String username;
    private final String password;

    public Adminn(String name, String studentID, String username, String password){
        super(name, studentID);
        this.username = username;
        this.password = password;
    }
    @Override
    public void login(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if(inputUsername.equals(username) && inputPassword.equals(password)){
            displayInfo();
        }else{
            System.out.println("Admin login failed. Invalid username or password");
        }
    }
    @Override
    public void displayInfo(){
        System.out.println("Name : " + getName() + " has successfully logged in.");
        System.out.println("Student ID : " + getStudentID());
        System.out.println("Admin " + getName() + " has successfuly logged in.");
    }
}