import java.util.*;


public class GuessNumber {

  public static void main(String[] args) 
  {
    Random Random_number= new Random();
    int right_no=Random_number.nextInt(100);
    int trials=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Guess number between 1 to 100, You have 10 trials to try for correct guess!" );
    System.out.println("Best of luck! Enter the guess no");
    
    int guess_no;
    int i=0;
    boolean win=false;
    while(win==false)
    {
      guess_no=sc.nextInt();
      trials++;
    
    if(guess_no==right_no) 
    {
      win=true;
    }
    else if(i>8)
    {
      System.out.println("You loose! the right answer was: "+right_no);
      return;
    }
    else if(guess_no<right_no)
    {
      i++;
      System.out.println("Yor Guess is smaller than the correct number!: "+(10-i)+" trials left");
    }
    else if(guess_no>right_no) 
    {
      i++;
      System.out.println("Your Guess Is larger than the correct Number!: "+(10-i)+" trials left");
    }
    
  }
    System.out.println("You win!");
    System.out.println("Then number was "+right_no);
    System.out.println("You used "+trials+" trials to guess the right number");
    System.out.println("Your score is "+((10-trials)*10)+" out of 100");
    

 }
}