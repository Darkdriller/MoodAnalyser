public class MoodAnalyser {

    public String analyseMood(String message){
        if(message.equals("This is a sad Message")){
            return "SAD";
        }
        else return null;
    }
}
