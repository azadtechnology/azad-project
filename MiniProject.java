import java.util.Scanner;

class guesser{
	int guessNum;
	int guessNum()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Guesser Kindly Guess The Number");
	guessNum=sc.nextInt();
	return guessNum;
	}
}
      class player{
    	  int guessNum;
    	  int guessNum()
    	  {
    		  Scanner sc=new Scanner(System.in);
    			System.out.println("Player Kindly Guess The Number");
    			guessNum=sc.nextInt();
    			return guessNum;
    			}
    	  }
      class umpire{
    	  int numFromGuesser;
    	  int numFromPlayer1;
    	  int numFromPlayer2;
    	  int numFromPlayer3;
    	  
    	  void collectNumFromGuesser()
    	  {
    		  guesser g=new guesser();
    		  numFromGuesser=g.guessNum();
    		  
    	  }
    	  void collectNumFromPlayer()
    	  {
    		  player p1=new player();
    		  player p2=new player();
    		  player p3=new player();
    		  numFromPlayer1=p1.guessNum();
    		  numFromPlayer2=p2.guessNum();
    		  numFromPlayer3=p3.guessNum();
    
    	  }
    	  void compare()
    	  {
    		  if(numFromGuesser==numFromPlayer1)
    		  {
    			  System.out.println("Player1 Won The Game");
    			  
    		  }
    		  if(numFromGuesser==numFromPlayer1&&numFromPlayer2==
    				  numFromPlayer3)
    		  {
    			  System.out.println("All Player Won");
    		  }
    		  else if(numFromGuesser==numFromPlayer2)
    			  
    		  {
    			  System.out.println("Player2 Won The Game");
    			  
    		  }
    		  else if(numFromGuesser==numFromPlayer3) 
    		  {
    			  System.out.println("Player3 Won The Game");
    		  }
    		
    		  
    		  else
    		  {
    			  System.out.println("Game Over Try Again!");
    			  
    		  }
    		    
    		  }
    	  }
      



public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         umpire u=new umpire();
         u.collectNumFromGuesser();
         u.collectNumFromPlayer();
         u.compare();
	}

}
