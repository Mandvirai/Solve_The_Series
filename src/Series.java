//Given a series 7, 15, 32, 67 …… Find the nth term of this series.
//Examples : //Input : 5 Output : 138 , //Input : 7 Output : 568
//Input Format
//one integer
//Constraints  ,//1<=n<=10^7
//Output Format, //one integer
//Sample Input,  //3
//Sample Output, //32
import java.util.Scanner;
public class Series {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 7;
        for(int i = 1;i<n;i++){
            a = a*2+i;

        }
        System.out.println(a);
    }
}
