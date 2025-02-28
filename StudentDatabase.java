import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        
        System.out.println("How many students: ");
        int numOfStu = s.nextInt();

        Student[] students = new Student[numOfStu]; //Object array
        
        for(int x=0; x<numOfStu; x++){
            students[x] = new Student();
            students[x].enroll();
            System.out.println("1- Pay now\n2- Pay later");
            int pay = s.nextInt();
            students[x].payment(pay);
        }

        for(int x=0; x<numOfStu; x++){
            students[x].showInfo();
        }
    }
}