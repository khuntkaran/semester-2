public class Stream {
    public static void main(String[] args) {
        String a = "stream";

        for (int i=0;i<a.length();i++)
        {
            for(int k=i;k<a.length();k++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print(a.charAt(j)+" ");
            }
            System.out.println();
        }
    }

}
