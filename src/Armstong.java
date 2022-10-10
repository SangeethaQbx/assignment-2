import java.util.Arrays;

public class Armstong {
    public static void main(String[] args) {

        int n=153,sum=1,ne=0;  //1634
        int org=n;
        int len=String.valueOf(n).length();

        while (n!=0){
            int temp=n%10;
            for(int i=0;i<len;i++) {
                sum = sum * temp;
            }
            ne=ne+sum;
            sum=1;
            n=n/10;
        }
        System.out.println(ne);
        if(ne==org){
            System.out.println("armstong");
        }else System.out.println("not armstrong");
    }
}
