/**
Class that will model an insurance policy for one person
*/
public class Policy {
   //declare all private fields
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
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
      holderFirstName = "Unknown";
      holderLastName = "Unknown";
      holderAge = 0;
      smokingStatus = "non-smoker";
      holderHeight = 0;
      holderWeight = 0;
   }
   
   /**
   Constructor that initializes all fields
   @param number The policy number
   @param provider The policy provider name
   @param firstName The first name of the policy holder
   @param lastName The last name of the policy holder
   @param age The age of the policy holder
   @param smoker The smoking status of the policy holder ("smoker" or "non-smoker")
   @param height The height (in inches) of the policy holder
   @param weight The weight (in pounds) of the policy holder
   */
   public Policy(int number, String provider, String firstName, String lastName, int age, String smoke, double height, double weight) {
      policyNumber = number;
      providerName = provider;
      holderFirstName = firstName;
      holderLastName = lastName;
      holderAge = age;
      smokingStatus = smoke;
      holderHeight = height;
      holderWeight = weight;
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
   Policy holder first name getter method
   @return The first name of the policy holder
   */
   public String getHolderFirstName() {
      return holderFirstName;
   }
   
   /**
   Policy holder first name setter method
   @param firstName The first name of the policy holder
   */
   public void setHolderFirstName(String firstName) {
      holderFirstName = firstName;
   }
   
   /**
   Policy holder last name getter method
   @return The last name of the policy holder
   */
   public String getHolderLastName() {
      return holderLastName;
   }
   
   /**
   Policy holder last name setter method
   @param lastName The last name of the policy holder
   */
   public void setHolderLastName(String lastName) {
      holderLastName = lastName;
   }
   
   /**
   Policy holder age getter method
   @return The age of the policy holder
   */
   public int getHolderAge() {
      return holderAge;
   }
   
   /**
   Policy holder age setter method
   @param age The policy holder age
   */
   public void setHolderAge(int age) {
      holderAge = age;
   }
   
   /**
   Policy holder smoking status getter method
   @return The smoking status of the policy holder
   */
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   /**
   Policy holder smoking status setter method
   @param smoke Policy holder smoking status
   */
   public void setSmokingStatus(String smoke) {
      smokingStatus = smoke;
   }
   
   /**
   Policy holder height getter method
   @return the height of the policy holder
   */
   public double getHolderHeight() {
      return holderHeight;
   }
   
   /**
   Policy holder height setter method
   @param height Policy holder height in inches
   */
   public void setHolderHeight(double height) {
      holderHeight = height;
   }
   
   /**
   Policy holder weight getter method
   @return The weight of the policy holder
   */
   public double getHolderWeight() {
      return holderWeight;
   }
   
   /**
   Policy holder weight setter method
   @param weight The policy holder weight in pounds
   */
   public void setHolderWeight(double weight) {
      holderWeight = weight;
   }
   
   /**
   Method that calculates the BMI of the policy holder
   @return The BMI of the policy holder
   */
   public double calcBMI() {
      return ((holderWeight * 703) / (holderHeight * holderHeight));
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
}