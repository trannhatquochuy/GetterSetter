package advance.dev;

public class Student {
	  private String name;
	    private int age;
	    private String address;
	    private String phoneNumber;
	    private double averageScore;

	    // Constructor
	    public Student(String name, int age, String address, String phoneNumber, double averageScore) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.averageScore = averageScore;
	    }

	    // Getter và Setter cho thuộc tính name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter và Setter cho thuộc tính age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age must be greater than 0.");
	        }
	    }

	    // Getter và Setter cho thuộc tính address
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    // Getter và Setter cho thuộc tính phoneNumber
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    // Getter và Setter cho thuộc tính averageScore
	    public double getAverageScore() {
	        return averageScore;
	    }

	    public void setAverageScore(double averageScore) {
	        if (averageScore >= 0) {
	            this.averageScore = averageScore;
	        } else {
	            System.out.println("Average score must be greater than or equal to 0.");
	        }
	   }
}
