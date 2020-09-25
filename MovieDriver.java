import java.util.Scanner;

public class MovieDriver {
   public static void main(String[] args) {
	   
       Scanner keyboard=new Scanner(System.in);//creating scanner object
       Movie m1=new Movie();//creating movie object
       
       while(true) {
    	   
       System.out.println("Enter the name of a movie ");
       String title=keyboard.nextLine();
       m1.setTitle(title);
       System.out.println("Enter the rating of the movie");
       String rating=keyboard.nextLine();
       m1.setRating(rating);
       System.out.println("Enter the number of tickets sold for this movie");
       int soldTickets=Integer.parseInt(keyboard.nextLine());
       
       m1.setSoldTickets(soldTickets);
       
       System.out.println(m1.toString());
       
       System.out.println("Do you want to enter another? (Yes or No)");
       String option =keyboard.nextLine();
       
       if(option.equalsIgnoreCase("Yes"))
           continue;
       else
           break;
       }
       System.out.println("Goodbye!!");
   }

}