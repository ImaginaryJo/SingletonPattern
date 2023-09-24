import java.util.Scanner;
public class personType {

   //declare variables
   private static personType person = null;
   private String firstName;
   private String middleName;
   private String lastName;
   
   //initialize variables (when called)
   private personType(String firstName, String middleName, String lastName) {
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
   }
   //print full name
   public void getFullName() {
      System.out.println(firstName + " " + middleName + " " + lastName);
   }
   //singleton method
   public static personType getInstance(String firstName, String middleName, String lastName) {
      if (person == null) {
         person = new personType(firstName, middleName, lastName);
      }
      return person;
   }
   
   
   // MAIN METHOD //
   public static void main(String[] args) {
      //declare variables
      Scanner input = new Scanner(System.in);
      String firstName;
      String middleName;
      String lastName;
      boolean nameIsValid = true;
        
      //input
      System.out.println("Welcome! Please enter a first, middle, and last name, and this program will mesh them together.");
      do{
         System.out.println("\nEnter the first name: ");
         firstName = input.nextLine();
         System.out.println("\nEnter the middle name: ");
         middleName = input.nextLine();
         System.out.println("\nEnter the last name: ");
         lastName = input.nextLine();
         
         //input validation
         if(firstName == null || middleName == null || lastName == null || firstName.isEmpty() || middleName.isEmpty() || lastName.isEmpty())
         {
            nameIsValid = false;
            System.out.println("\nYou did not enter a valid name. \n\nPlease try again, but don't leave the prompts blank");
         }else
            nameIsValid = true;
         }while (!nameIsValid);
         
      //create personType object and call relevant method(sO
      personType person = personType.getInstance(firstName, middleName, lastName);
      System.out.println("\nThe meshed name is: ");
      person.getFullName();
   }
}