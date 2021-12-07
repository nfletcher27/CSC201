public class Patient {

          private String id;
          private int age;
          private BloodData bloodData;
          public Patient()  {
                  id = "null";
                  age = 0;
                  bloodData = new BloodData("O", "+");        
          }

          public Patient(String id, int age, String bType, String rhFactor) {
                  this.id = id;
                  this.age = age;
                  bloodData = new BloodData(bType, rhFactor);
          }
          public String getId() {
        	  return id;
          }
          public void setId(String id) {
        	  this.id = id;
          }
          public int getAge() {
        	  return age;
          }
          public void setAge(int age) {
        	  this.age = age;
          }
          public BloodData getBloodData() {
        	  return bloodData;
          }
          public void setBloodData(BloodData b) {
        	  this.bloodData = b;
          }
      }