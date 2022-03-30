import java.util.Scanner;
class CalculateSpi{
    int id_no;
    int no_of_subject;
    String subject_code;
    double subject_credits;
    String grade_obtained;
    double spi;
    double tcredit ;
    double scredit;
    
    void calculateStudentSpi()
    {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        CalculateSpi g3 = new CalculateSpi();

        System.out.print("enter id_no : ");
        id_no=input.nextInt();
        System.out.print("enter no_of_subject : ");
        no_of_subject=input.nextInt();
        for(int i=0;i<no_of_subject;i++)
        {
            System.out.print("enter subject_code : ");
            subject_code = sc.nextLine();

            System.out.print("enter subject_credits : ");
            subject_credits = input.nextDouble();
            tcredit+= subject_credits;

            System.out.print("enter grade_obtained : ");
            grade_obtained = sc.nextLine();
            g3.calulate(subject_credits,grade_obtained);
        }
        g3.displaySpi(tcredit);
    }

    void calulate(double i,String g)
    {
        int k = 0;
        if(g.equalsIgnoreCase("a+")){k=10;}
        else if (g.equalsIgnoreCase("a")){k=9;}
        else if (g.equalsIgnoreCase("b+")){k=8;}
        else if (g.equalsIgnoreCase("b")){k=7;}
        else if (g.equalsIgnoreCase("c+")){k=6;}
        else if (g.equalsIgnoreCase("c")){k=5;}
        scredit+= k*i;
    }

    void displaySpi(double y)
    {
        spi = (scredit) / y ;
        System.out.println("spi : "+spi);
    }
}

public class Spi {
    public static void main(String[] args) {
        CalculateSpi c1 = new CalculateSpi();
        c1.calculateStudentSpi();
        CalculateSpi c2 = new CalculateSpi();
        c2.calculateStudentSpi();
    }
}