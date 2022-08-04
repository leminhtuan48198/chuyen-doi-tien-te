import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        final double RATE =23000;
        double vnd,usd;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap gia tri USD: ");
        usd=scanner.nextDouble();
        vnd=usd*RATE;
        System.out.println("Gia tri tien Viet Nam tuong ung la "+vnd+" dong");

    }
}
