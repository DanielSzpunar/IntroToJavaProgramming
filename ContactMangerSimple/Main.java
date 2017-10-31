public class Main {

    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        Contact songyi = new Contact();

        songyi.name = "Songyi";
        songyi.phoneNumber = "6475497534";

        myContactsManager.addContact(songyi);

        Contact daniel = new Contact();
        daniel.name = "Daniel";
        daniel.phoneNumber = "6475427534";

        myContactsManager.addContact(daniel);

        Contact rosa = new Contact();
        rosa.name = "Rosa";
        rosa.phoneNumber = "9052797534";

        myContactsManager.addContact(rosa);

        //Lets try to search for a contact:

        Contact result = myContactsManager.searchContact("Daniel");
        System.out.println(result.phoneNumber);

    }
}
