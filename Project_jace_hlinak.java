import java.util.*; 
import java.io.*;

public class Project_jace_hlinak {
   public static void main(String[] args) {
      try {
         File file = new File("PolicyInformation.txt"); //create new File instance, pass input file name
         Scanner inputFile = new Scanner(file); //create new scanner with the input file as an argument
         
         //declare variables
         int policyNumber;
         String providerName;
         String holderFirstName;
         String holderLastName;
         int holderAge;
         String smokingStatus;
         double holderHeight;
         double holderWeight;
         int countSmoker = 0;
         int countNonSmoker = 0;
         
         //create new array list for the policy objects
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         
         while(inputFile.hasNext()) {
            //input information from one policy from text file
            policyNumber = inputFile.nextInt();
            inputFile.nextLine(); //clear buffer
            providerName = inputFile.nextLine();
            holderFirstName = inputFile.nextLine();
            holderLastName = inputFile.nextLine();
            holderAge = inputFile.nextInt();
            inputFile.nextLine(); //clear buffer
            smokingStatus = inputFile.nextLine();
            holderHeight = inputFile.nextDouble();
            holderWeight = inputFile.nextDouble();
            
            //remove new line characters if the file has more data to read
            if(inputFile.hasNext()) {
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            //create new policy object and store it in the array list
            Policy newPolicy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
            policyList.add(newPolicy);
         }
         
         //close file
         inputFile.close();
         
         //iterate through policy list
         for(int i = 0; i < policyList.size(); i++) {
            //display policy information
            System.out.println("Policy Number: " + policyList.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(i).getHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(i).getHolderLastName());
            System.out.println("Policyholder's Age: " + policyList.get(i).getHolderAge());
            System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getSmokingStatus());
            System.out.printf("Policyholder's Height: %,.1f inches\n", policyList.get(i).getHolderHeight());
            System.out.printf("Policyholder's Weight: %,.1f pounds\n", policyList.get(i).getHolderWeight());
            System.out.printf("Policyholder's BMI: %,.2f\n", policyList.get(i).calcBMI());
            System.out.printf("Policy Price: $%,.2f", policyList.get(i).calcPrice());
            System.out.println("\n");
            
            //increment smoker/non-smoker counters
            if(policyList.get(i).getSmokingStatus().equalsIgnoreCase("smoker")) {
               countSmoker += 1;
            } else {
               countNonSmoker += 1;
            }
         }
         
         //output smoker/non-smoker count
         System.out.println("The number of policies with a smoker is: " + countSmoker);
         System.out.println("The number of policies with a non-smoker is: " + countNonSmoker);
      } //close try
      
      catch(IOException ex) {
         //display error message
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      } //close catch
   } //close main
} //close class
