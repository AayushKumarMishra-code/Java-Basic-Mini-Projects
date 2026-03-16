import java.util.Scanner;
 class Movie{
    String titleName;
    int year_Of_release;
    String type;
    String[] movie_list= {"Lucky: the racer" , "Mohenjodaro" ,"Hum aapke hai kyon"};
    String collection(){
        System.out.println("Select movie");
        System.out.println("1."+movie_list[0]);
        System.out.println("2."+movie_list[1]);
        System.out.println("3."+movie_list[2]);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you movie number");
        byte num = scan.nextByte();
        return movie_list[num];
        
    }
    
    
     
     
 }
 
 
class Theaters{
    String theaterName;
    int nearTheater(){
        System.out.println("Here are the name of the theaters near you:");
        System.out.println("1. Orion mall movie complex");
        System.out.println("2. PVR Whitefield");
        System.out.println("3. Sony movie complex");
        System.out.println("4. PVR Hoskote");
        System.out.println("choose one from above....");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
        
    }
}
 
 
 class Customer{
	String name;
	String email;
	long phone_Number;
	String location;
	
	void login_customer() {
		System.out.println("Welcome to movie ticket booking system");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name:");
		name = scan.nextLine();
		
		System.out.println("Enter your email:");
		email = scan.nextLine();

		System.out.println("Enter your phone number:");
		phone_Number = scan.nextLong();

		System.out.println("Enter your location:");
		location = scan.nextLine();
		
		System.out.println("Thank you for signing in");
		
	}
	
	

	void choosing(){
	    Movie movie = new Movie();
	    String movie_choosed= movie.collection();
	   
	    System.out.println("Nice choice");
	    
	    
	    }
	void choose() {
	    Theaters thea = new Theaters();
	    int res = thea.nearTheater();
	}


}


public class Main{
    public static void main(String[] args){
        Customer user = new Customer();
        user.login_customer();
        user.choose();
        user.choosing();
        System.out.println("Ticket is booked successfully");
    }
}

	
		

