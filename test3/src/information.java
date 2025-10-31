public class information {
    private String FirstName, lastName, Age, Address;
    private int SchoolId;

    information(String FirstName,String lastName,String Age, String Address,int SchoolId){
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.Age = Age;
        this.Address = Address;
        this.SchoolId = SchoolId;
    }
    String getFirstName(){
        return FirstName;
    }
    String getlastName(){
        return lastName;
    }
    String getAge(){
        return Age;
    }
    String getAddress(){
        return Address;
    }
    int getSchoolId(){
        return SchoolId;
    }
     



}
