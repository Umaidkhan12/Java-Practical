class Trial_2 {
  public static void main(String[] args){
     byte a = 127; 
     short b = a;
     int c = b;

     System.out.println("Byte a = " + a);
     System.out.println("Short b = " + b);
     System.out.println("Int c = " + c);

     System.out.println();

     int d = 180;
     short e = (short)d;
     byte f = (byte)e;

     System.out.println("Int d = " + d);
     System.out.println("Short e = " + e);
     System.out.println("Byte f = " + f);
  }
}