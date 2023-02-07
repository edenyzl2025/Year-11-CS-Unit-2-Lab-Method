public class Tutorial {
    int myAge = 58;
    String myName = "Keanu Reeves";

    public static void main(String args[]){

//        int sum = add(3, 8);
//        System.out.println(sum);
//
//        int sumTwo = add(3,8,4,9);
//        System.out.println(sumTwo);
//
//        String greetOne = morningGreeting("Toby Fox");
//        System.out.println(greetOne);
//
//        String greetTwo = afternoonGreeting("Mac Miller");
//        System.out.println(greetTwo);
//
//        double test = roundPositiveValueToNearestInteger(5.4);
//        System.out.println(test);
//
//        double test2 = roundNegativeValueToNearestInteger()

    }

    public static int add(int numA, int numB){
        return numA+numB;
    }

    public static int add(int numA, int numB, int numC, int numD){
        return add(numA, numB) + add(numC, numD);
    }

    public static String morningGreeting(String name){
        return "早上好 "+name;
    }

    public static String afternoonGreeting(String name){
        return "下午好 "+name;
    }

    public static String triple(String name){
        return name+name+name;
    }

    public static double half(int numA){
        double myDouble = numA/2;
        return myDouble;

    }

    public static int roundPositiveValueToNearestInteger(double numA){
                numA = numA +0.5;
                int a = (int)numA;
            return a;
        }

    public static int roundNegativeValueToNearestInteger(double numA){
        numA = numA +0.5;
        int a = (int)numA;
        return a;
    }
}
