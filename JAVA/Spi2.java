import java.util.Scanner;
class Student{
    int id_no=0;
    int no_of_subjects_registered=0;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    public Student(int id_no, int no_of_subjects_registered){
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        subject_code = new String[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new String[no_of_subjects_registered];
    }

    public void setSubjectInfo(){
        for(int i = 0; i<no_of_subjects_registered; i++ ){
            System.out.println("Enter the subject "+(i+1)+" code:");
            subject_code[i] = sc.nextLine();
            System.out.println("Enter the subject credit:");
            subject_credits[i] = input.nextInt();
            System.out.println("Enter the grade: ");
            grade_obtained[i] = sc.nextLine();
        }

    }
    public void printSubjectInfo(){
        for (int i = 0; i<no_of_subjects_registered; i++) {
            System.out.println("Credit of subject "+i+" are: "+subject_credits[i]);
            System.out.println("code of subject "+i+"is: "+subject_code[i]);
            System.out.println("grade_obtained"+i+"are"+grade_obtained[i]);
        }
    }

}
public class Spi2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the id number:");
        int id_no = scan.nextInt();
        System.out.println("Enter the no of subjects:");
        int no_of_subjects_registered = scan.nextInt();
        Student student_01 = new Student(id_no,no_of_subjects_registered);
        System.out.println(student_01.no_of_subjects_registered);
        student_01.setSubjectInfo();
        student_01.printSubjectInfo();
    }
}