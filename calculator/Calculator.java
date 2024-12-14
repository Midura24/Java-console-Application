public class Calculator {
    static double x;
    static double y;

    static double add(double a, double b)
    {
        double x=a+b;
        return x;
    }
    static double add(double a, double b, double c)
    {
        double y=a+b+c;
        return y;
    }
    static double sub(double a, double b)
    {
        double x=a-b;
        return x;
    }
    static double sub(double a, double b, double c)
    {
        double y=a-b-c;
        return y;
    }
    static double multi(double a, double b)
    {
        double x=a*b;
        return x;
    }
    static double multi(double a, double b, double c)
    {
        double y=a*b*c;
        return y;
    }
    static double div(double a, double b)
    {
        double x=a/b;
        return x;
    }
    static double div(double a, double b, double c)
    {
        double y=a/b/c;
        return y;
    }
    static int method1(double r)
    {
        if(r%=0)
        {
            int c=(int)(r);
            return c;
        }
    }
}
