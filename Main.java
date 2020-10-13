import java.util.Scanner;
/**
 *Tells user their letter grade
 * @author Tolga Nurtekin
 */
public class Main {

  public static void examGrade(int mark){
    
    //print exam grade to the screen
    if(mark <= 50){
      System.out.println("F");
    }else if (mark == 51 || mark <= 59){
      System.out.println("D");
    }else if (mark == 60 || mark <= 69){
      System.out.println("C");
    }else if (mark == 70 || mark <= 79){
      System.out.println("B");
    }else if (mark >= 80){
      System.out.println("A");
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //aak user for mark
    System.out.println("Enter mark");
    //declare a variable to stor the mark
    int mark = input.nextInt();
    examGrade(mark);

    
  }
}
