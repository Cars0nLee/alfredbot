import java.util.Date;

class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name) {
        return "Hello " + name + ", lovely to see you.";
    }
    public String dateAnnouncement() {
        Date date = new Date();
        return "Today's date is: " + date;
    }
    public String respondBeforeAlexis(String input){
        if(input.indexOf("Alexis") != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that";
        }
        else if (input.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally";
        }
        else{
            return "Right. And with that I shall retire.";
        }
    }
    public String overloading (String name, String hobby){
        String convo = String.format("%s's, hobby is %s!", name, hobby);
        return convo;
    }
}
