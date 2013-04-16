class A {
  void hello(){
    System.out.println("hello");
  }
}

class B extends A {}

public class C {
  public static void main (String[] args) {
     B b = new B();
     b.hello();
  }
}

