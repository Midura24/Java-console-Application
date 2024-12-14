import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        boolean result;
        boolean b=true;
        Calculator c = new Calculator();
        while(b==true)
        {
            result = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter your choice:");
            int ip1 = s.nextInt();

            if(ip1==5){
                System.out.println("exit");
                break;
            }
            else if (ip1 == 1) {
                System.out.println("1.two variable\n2.three variable\nEnter your choice:");
                int ip2 = s.nextInt();
                if (ip2 == 1) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    result = Calculator.add(a1,a2);
                    System.out.println("result =" + result);
                } else if (ip2 == 2) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    System.out.println("Enter the value 3:");
                    double a3 = s.nextDouble();
                    result = Calculator.add(a1,a2,a3);
                    System.out.println("result =" + result);
                }
                else
                {
                    System.out.println("invalid choice");
                    break;
                }
                C.method1(result);
            }
            else if (ip1 == 2) {
                System.out.println("1.two variable\n2.three variable\nEnter your choice:");
                int ip2 = s.nextInt();
                if (ip2 == 1) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    result = Calculator.sub(a1,a2);
                    System.out.println("result =" + result);
                } else if (ip2 == 2) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    System.out.println("Enter the value 3:");
                    double a3 = s.nextDouble();
                    result = Calculator.sub(a1,a2,a3);
                    System.out.println("result =" + result);
                }
                else
                {
                    System.out.println("invalid choice");
                    break;
                }
                Calculator.method1(result);
            }
            else if (ip1 == 3) {
                System.out.println("1.two variable\n2.three variable\nEnter your choice:");
                int ip2 = s.nextInt();
                if (ip2 == 1) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    System.out.println("result =" + Calculator.multi(a1,a2));
                } else if (ip2 == 2) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    System.out.println("Enter the value 3:");
                    double a3 = s.nextDouble();
                    result = Calculator.multi(a1,a2,a3);
                    System.out.println("result =" + result);
                }
                else
                {
                    System.out.println("invalid choice");
                    break;
                }
                c.method1(result);
            }
            else if (ip1 == 4) {
                System.out.println("1.two variable\n2.three variable\nEnter your choice:");
                int ip2 = s.nextInt();
                if (ip2 == 1) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    result = Calculator.div(a1,a2);
                    System.out.println("result =" +result);
                } else if (ip2 == 2) {
                    System.out.println("Enter the value 1:");
                    double a1 = s.nextDouble();
                    System.out.println("Enter the value 2:");
                    double a2 = s.nextDouble();
                    System.out.println("Enter the value 3:");
                    double a3 = s.nextDouble();
                    result = Calculator.div(a1,a2,a3);
                    System.out.println("result =" + result);
                }
                else
                {
                    System.out.println("invalid choice");
                    break;
                }
                c.method1(result);
            }
            else
            {
                System.out.println("invalid choice");
            }
        }
    }
}

