class ExpressWrap {
   public static void main(String args[]) {

    //Declaration and Initialization
    int a = 10, b= 5, c= 8, d = 2;
    float x = 6.4F, y = 3.0F;

    //Order of Evalution
    int answer1 = a * b + c / d;
    int answer2 = a * (b + c) / d;

    //Type Conversion
    float answer3 = a / c;
    float answer4 = (float) a / c;
    float answer5 = a / y;

    //Modulo Operation
    int answer6 = a % c;
    float answer7 = x % y;

    //Logic Operation
    boolean bool1 = a > b && c > d;
    boolean bool2 = a < b && c > d;
    boolean bool3 = a < d || c > d;
    boolean bool4 = !(a - b == c);

    System.out.println("Order of Evalution");
} 
}
