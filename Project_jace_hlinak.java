import java.util.Scanner;
public class Project_jace_hlinak {
   public static void main(String[] args) {
      //create scanner object and declare variables
      Scanner scnr = new Scanner(System.in);
      int policyNumber;
      String providerName;
      String holderFirstName;
      String holderLastName;
      int holderAge;
      String smokingStatus;
      double holderHeight;
      double holderWeight;
      
      //declare an object of the Policy class
      Policy testPolicy;
      
      //prompt the user to input data for each of the eight variables
      System.out.print("Please enter the Policy Number: ");
      policyNumber = scnr.nextInt();
      scnr.nextLine(); //clear scanner buffer
      
      System.out.print("Please enter the Provider Name: ");
      providerName = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      holderFirstName = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      holderLastName = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      holderAge = scnr.nextInt();
      scnr.nextLine(); //clear scanner buffer
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = scnr.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      holderHeight = scnr.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      holderWeight = scnr.nextDouble();
      
      //call the constructor for the Policy class
      testPolicy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
      
      //output the relevant information for the newly created Policy object
      System.out.println("Policy Number: " + testPolicy.getPolicyNumber());
      System.out.println("Provider Name: " + testPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + testPolicy.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + testPolicy.getHolderLastName());
      System.out.println("Policyholder's Age: " + testPolicy.getHolderAge());
      System.out.println("Policyholder's Smoking Status: " + testPolicy.getSmokingStatus());
      System.out.printf("Policyholder's Height: %,.1f inches\n", testPolicy.getHolderHeight());
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", testPolicy.getHolderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", testPolicy.calcBMI());
      System.out.printf("Policy Price: $%,.2f", testPolicy.calcPrice());
   }
}
