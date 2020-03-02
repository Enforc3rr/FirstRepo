import java.util.Scanner;
public class HHMM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.println("enter number");
        n = sc.nextInt();
        int p [] = new int[n]  ;
        int q [] = new int[n] ;
        int time , min ;

        for(int i = 0 ; i< n ; i++)
        {
            System.out.print("enter SH   ");
            int h1 = sc.nextInt();
            System.out.print("enter SM ");
            int m1 = sc.nextInt();
            System.out.print("enter EH  ");
            int h2 = sc.nextInt();
            System.out.print("enter EM  ");
            int m2 = sc.nextInt();
            min = m2 - m1;
            if(min > 0)
            {
                time = (h2 - h1)* 60 + min;
                int r = time % 60;
                int t = time / 60;
                p[i] = r ;
                q[i] = t ;

            }
            else if(min  < 0)
            {
                int x = 60 + min ;
                time = (h2 - h1) * 60 - x;
                int r = x;
                int t = time / 60 ;
                p[i] = r ;
                q[i] = t ;

            }

            System.out.println(" ");
        }
        for(int j = 0 ; j< n ; j++)
        {
            System.out.print(q[j] + " " + p[j] + "\n");
        }

    }
}
