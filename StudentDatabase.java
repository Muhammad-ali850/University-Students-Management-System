import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        
        System.out.println("How many students: ");
        int numOfStu = s.nextInt();

        Student[] students = new Student[numOfStu];
        
        for(int x=0; x<numOfStu; x++){
            students[x] = new Student();
        }

        for(int x=0; x<numOfStu; x++){
            students[x].showInfo();
        }
    }
}