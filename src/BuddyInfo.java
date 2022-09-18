
public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {	//Getting and setting each variable
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phoneNumber;
    }


    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return name + ", " + address + ", " + phoneNumber;
    }
    public static void main(String[] args) {
        BuddyInfo myself = new BuddyInfo("tom", "Carleton Street", "613");
    }
}
