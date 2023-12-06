import java.util.HashMap;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(String message){
        this.message = message;
    }
    public MoodAnalyser(){
        this.message = null;
    }
    public String analyseMood() throws MoodAnalysisException {
        if(this.message == null){
            throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD);
        }
        if(this.message.equals("This is a sad Message")){
            return "SAD";
        }
        if(this.message.isEmpty()){
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD);
        }
        if(this.message.equals("I am in Any Mood")){
            return "HAPPY";
        }
        return null;
    }
    public enum MoodAnalysisError {
        NULL_MOOD("Mood is null"),
        EMPTY_MOOD("Mood is empty");

        private final String errorMessage;

        MoodAnalysisError(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
    public class MoodAnalysisException extends Exception {
        private final MoodAnalyser.MoodAnalysisError error;

        public MoodAnalysisException(MoodAnalyser.MoodAnalysisError error) {
            super(error.getErrorMessage());
            this.error = error;
        }

        public MoodAnalyser.MoodAnalysisError getError() {
            return error;
        }
    }
}
