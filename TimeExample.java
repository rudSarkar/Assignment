class TimeShow {

  private int hour;
  private int second;
  private int minute;

  // The first constructor will be a default constructor
  TimeShow() {
    hour = 5;
    minute = 16;
    second = 27;
  }
  // The second constructor will receive three different values.
  TimeShow(int x, int y, int z) {

    hour = x;
    minute = y;
    second = z;
  }
  /*
  
    Third constructor will receive another object of the same class to
    initialize the second, minute and hour values of an object.
  
  */
  TimeShow(TimeShow obj) {
    hour = obj.hour;
    second = obj.second;
    minute = obj.minute;
  }

  /*
    Design a display method to display the time of the calling object in
      hours:minutes:seconds format.
  */
  void displayMethod() {

    System.out.println( + hour + ":" + minute + ":" + second + "");
  }
}

// Create a TimeExample class and define a main method inside it.
public class TimeExample {

  public static void main(String[] args) {
    /*
        Now create three objects of the TimeShow class inside the main
            methodwith three different types of initialization.*/
    //  Display the time of the three objects of TimeShow class.
    TimeShow obj1 = new TimeShow();
    TimeShow obj2 = new TimeShow(14, 25, 36);
    TimeShow obj3 = new TimeShow(obj2);

    obj1.displayMethod();
    obj2.displayMethod();
    obj3.displayMethod();
  }
}
