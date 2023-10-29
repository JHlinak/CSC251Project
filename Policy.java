/**
Class that will model one insurance policy
*/
public class Policy {
   //declare static fields
   public static int count = 0;
   
   //declare private fields
   private int policyNumber;
   private String providerName;
   
   //initialize constants
   private final double BASE_FEE = 600.0;
   private final double ELDER_FEE = 75.0;
   private final double SMOKER_FEE = 100.0;
   private final double BMI_FEE_RATE = 20.0;
   
   /**
   No-arg constructor that initializes all fields
   */
   public Policy() {
      policyNumber = 0;
      providerName = "Unknown";
   }
   
   /**
   Constructor that initializes all fields
   @param number The policy number
   @param provider The policy provider name
   */
   public Policy(int number, String provider) {
      policyNumber = number;
      providerName = provider;
   }
   
   /**
   Policy number getter method
   @return The policy number as an integer
   */
   public int getPolicyNumber() {
      return policyNumber;
   }
   
   /**
   Policy number setter method
   @param number The policy number
   */
   public void setPolicyNumber(int number) {
      policyNumber = number;
   }
   
   /**
   Policy provider name getter method
   @return The policy provider name
   */
   public String getProviderName() {
      return providerName;
   }
   
   /**
   Policy provider name setter method
   @param provider The policy provider name
   */
   public void setProviderName(String provider) {
      providerName = provider;
   }

   /**
   Method that calculates the price of the insurance policy
   @return The price of the insurance policy
   */
   public double calcPrice() {
      //initialize the policy price at the same value as the base fee
      double price = BASE_FEE;
      
      //apply the elder fee if the policy holder is above the age of 50
      if (holderAge > 50) {
         price = price + ELDER_FEE;
      }
      
      //apply the smoker fee if the policy holder is a smoker
      if (smokingStatus.equals("smoker")) {
         price = price + SMOKER_FEE;
      }
      
      //appply a fee depending on the BMI of the policy holder
      if (calcBMI() > 35) {
         price = price + ((calcBMI() - 35) * BMI_FEE_RATE);
      }
      
      return price;
   }
   
   /**
   toString method that provides a String representation of a policy
   */
   public String toString() {
      return "Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName +
             "\nPolicy Price: $" + calcPrice();
   }
} 