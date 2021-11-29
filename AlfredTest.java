public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredApp = new AlfredQuotes();

        // Message
        String basicGreeting = alfredApp.basicGreeting();
        System.out.println(basicGreeting);
        String greetingMessage = alfredApp.guestGreeting("Carson");
        System.out.println(greetingMessage);

        // Date
        String date = alfredApp.dateAnnouncement();
        System.out.println(date);

        // Alexis
        String alexisTest = alfredApp.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alexisTest2 = alfredApp.respondBeforeAlexis("Hello Alfred!");
        String alexisTest3 = alfredApp.respondBeforeAlexis("Hello!");
        System.out.println(alexisTest);
        System.out.println(alexisTest2);
        System.out.println(alexisTest3);

        // Overloading
        String overloading = alfredApp.overloading("Carson", "Coding");
        System.out.println(overloading);
    }
}
