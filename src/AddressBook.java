import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;
    public AddressBook() {
        buddyInfos = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo aBuddyInfos) {
        if (buddyInfos != null) {
            buddyInfos.add(aBuddyInfos);
        }
    }

    public void removeBuddy(int i) {
        if (i >= 0 && i < buddyInfos.size()) {
            buddyInfos.remove(i);
        }
        }

    public ArrayList<BuddyInfo> displayAddressBook() {
        return buddyInfos;
    }
        public static void main(String[] args) {
            BuddyInfo buddy= new BuddyInfo("tom", "Carleton Street", "613");
            AddressBook addressBook = new AddressBook();
            addressBook.addBuddy(buddy);
            addressBook.removeBuddy(0);
            System.out.println("Address Book");
            //I am making a change
    }
}
