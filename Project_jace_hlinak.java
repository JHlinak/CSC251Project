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
         
         //object reference variables
         Policy newPolicy;
         PolicyHolder newHolder;
         
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
            
            //create new PolicyHolder object
            newHolder = new PolicyHolder(holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
            
            //create new policy object and store it in the array list
            newPolicy = new Policy(policyNumber, providerName, newHolder);
            policyList.add(newPolicy);
            
            //increment smoker/non-smoker counters
            if(smokingStatus.equalsIgnoreCase("smoker")) {
               countSmoker++;
            } else {
               countNonSmoker++;
            }
            
            //increment static policy count field
            Policy.count++;
         }
         
         //close file
         inputFile.close();
         
         //iterate through policy list
         for(int i = 0; i < policyList.size(); i++) {
            //display policy information
            System.out.println(policyList.get(i) + "\n");
         }
         
         //output policy count
         System.out.println("There were " + Policy.count + " Policy objects created.");
         
         //output smoker/non-smoker count
         System.out.println("The number of policies with a smoker is: " + countSmoker);
         System.out.println("The number of policies with a non-smoker is: " + countNonSmoker);
      }
      
      catch(IOException ex) {
         //display error message
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}
