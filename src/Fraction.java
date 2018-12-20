public class Fraction {
    int numerator;
    int denominator = 1;
    Fraction(int num, int denom){
        if (denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        numerator = num;
        denominator = denom;
    }
    public double add(Fraction f){
        double numd = numerator;
        double denomd = denominator;
        double numdf = f.numerator;
        double denomdf = f.denominator;
        double f1 = numd / denomd;
        double f2 = numdf / denomdf;
        f1+=f2;
        return f1;
    }
    double sub(Fraction f){
        double numd = numerator;
        double denomd = denominator;
        double numdf = f.numerator;
        double denomdf = f.denominator;
        double f1 = numd / denomd;
        double f2 = numdf / denomdf;
        f1-=f2;
        return f1;
    }
    double mult(Fraction f){
        double numd = numerator;
        double denomd = denominator;
        double numdf = f.numerator;
        double denomdf = f.denominator;
        double f1 = numd / denomd;
        double f2 = numdf / denomdf;
        f1*=f2;
        return f1;
    }
    double divide(Fraction f){
        double numd = numerator;
        double denomd = denominator;
        double numdf = f.numerator;
        double denomdf = f.denominator;
        double f1 = numd / denomd;
        double f2 = numdf / denomdf;
        f1/=f2;
        return f1;
    }
}
