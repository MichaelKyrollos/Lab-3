import java.util.ArrayList;
import java.util.ListIterator;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfo;

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
