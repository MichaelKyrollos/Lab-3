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

        public static void main(String[] args) {
            System.out.println("Address Book");
        }
}
