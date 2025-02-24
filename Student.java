import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID; //netID
    private static int id = 1000;
    private String courses = "";
    private int tuitionBalance;
    private int costOfCourse = 5000; //in Rs

    Scanner s = new Scanner(System.in);
    
    public Student(){
        System.out.println("First name of student");
        this.firstName = s.next();
        System.out.println("Last name of student");
        this.lastName = s.next();       
        System.out.print("1- 1st Year\n2- 2nd Year\n3- 3rd Year\n4- 4th Year\nEnter student Year ");
        this.year = s.nextInt();
        setStudentID();
        enroll();
        payment();
    }

    public void setStudentID(){
        id++;
        this.studentID = year + "" + id;
    }

    public void enroll(){
        int x;
        for (x=0; x<=6; x++){ //Six course limit per semester, limit could be changed
            if(x==6){
                System.out.println("Can't enroll in more than six courses");
                return;
            }
            System.out.print("Enter course to enroll (press q to quit)");
            String course = s.next();
            if(!course.equals("q")){
                courses = courses + "\n " + course;
                tuitionBalance  += costOfCourse;
            }
            else{
                break;
            }
        }
    }

    public void payment(){
        System.out.println("Fees: " + tuitionBalance + "Rs");
        System.out.print("Enter payment: ");
        int payment = s.nextInt();
        tuitionBalance -= payment;
    }

    public void showInfo(){
        System.out.println("\n" + "Name: " + firstName + " " + lastName + "\n" + "Year: " + year + "\n" + "Student ID: "
        + studentID + "\n" + "Enrolled courses: " + courses + "\n" + "Balance: " + tuitionBalance + "Rs");
    }
}