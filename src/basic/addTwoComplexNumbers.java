package basic;

public class addTwoComplexNumbers {
    double real, imagine;
    addTwoComplexNumbers(double r, double i){
        this.real = r;
        this.imagine = i;
    }
    public static addTwoComplexNumbers sum(addTwoComplexNumbers c1, addTwoComplexNumbers c2){
        addTwoComplexNumbers temp = new addTwoComplexNumbers(0,0);
        temp.real = c1.real + c2.real;
        temp.imagine = c1.imagine + c2.imagine;

        return temp;
    }

    public static void main(String[] args) {
        addTwoComplexNumbers c1 = new addTwoComplexNumbers(7.2,4);
        addTwoComplexNumbers c2 = new addTwoComplexNumbers(4.2,7.5);
        addTwoComplexNumbers temp = sum(c1,c2);
        System.out.println("Sum = "+temp.real+" + " +temp.imagine+"i");
    }
}
