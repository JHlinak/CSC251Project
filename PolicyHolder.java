/**
Class that will respresent a person that is associated with an insurance policy
*/
public class PolicyHolder {
   //decalre private fields
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   /**
   No-arg constructor that initializes all fields
   */
   public PolicyHolder() {
      holderFirstName = "Unknown";
      holderLastName = "Unknown";
      holderAge = 0;
      smokingStatus = "non-smoker";
      holderHeight = 0;
      holderWeight = 0;
   }
   
   /**
   Constructor that initializes all fields
   @param firstName The first name of the policy holder
   @param lastName The last name of the policy holder
   @param age The age of the policy holder
   @param smoker The smoking status of the policy holder ("smoker" or "non-smoker")
   @param height The height (in inches) of the policy holder
   @param weight The weight (in pounds) of the policy holder
   */
   public PolicyHolder(String firstName, String lastName, int age, String smoke, double height, double weight) {
      holderFirstName = firstName;
      holderLastName = lastName;
      holderAge = age;
      smokingStatus = smoke;
      holderHeight = height;
      holderWeight = weight;
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
}