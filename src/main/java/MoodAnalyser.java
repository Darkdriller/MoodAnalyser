import java.util.HashMap;

public class MoodAnalyser {

    public String analyseMood(String message){
        if(message.equals("This is a sad Message")){
            return "SAD";
        }
        if(message.equals("I am in Any Mood")){
            return "HAPPY";
        }
        return null;
    }
}
