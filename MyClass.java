public class MyClass {
    private int myInt;
    private String myString;
    
    public MyClass(int myInt, String myString) {
      this.myInt = myInt;
      this.myString = myString;
    }
    
    public int getMyInt() {
      return myInt;
    }
    
    public String getMyString() {
      return myString;
    }
    
    public void setMyInt(int myInt) {
      this.myInt = myInt;
    }
    
    public void setMyString(String myString) {
      this.myString = myString;
    }
    
    public void printMyValues() {
      System.out.println("My int value is: " + myInt);
      System.out.println("My string value is: " + myString);
    }
  }