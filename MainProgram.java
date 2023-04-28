public class MainProgram {
  public static void main(String[] args) {
    MyClass myClass = new MyClass(1, "Hello");
    myClass.printMyValues();
    myClass.setMyInt(2);
    myClass.setMyString("World");
    myClass.printMyValues();
  }
}