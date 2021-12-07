public class BloodData {
          private String bloodType;
          private String rhFactor;
          public BloodData() {
                  bloodType = "O";
                  rhFactor = "+";
          }
          
          public BloodData(String bType, String rh) {
                  bloodType = bType;
                  rhFactor = rh;
          }
         
          public void setBloodType(String type1) {
                  this.bloodType = type1;
          }

          public void setRhFactor(String rh) {
                  this.rhFactor = rh;
          }

          public String getBloodType() {
                  return bloodType;
          }

          public String getRhFactor() {
                  return rhFactor;
          }
     }