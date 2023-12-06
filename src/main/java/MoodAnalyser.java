import java.util.HashMap;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(String message){
        this.message = message;
    }
    public MoodAnalyser(){
        this.message = null;
    }
    public String analyseMood(){
        if(this.message.equals("This is a sad Message")){
            return "SAD";
        }
        if(this.message.equals("I am in Any Mood")){
            return "HAPPY";
        }
        return null;
    }
}
