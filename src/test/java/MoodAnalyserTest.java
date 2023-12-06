import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysisTC1() throws MoodAnalyser.MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void testMoodAnalysisTC2(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        try {
            String mood = moodAnalyser.analyseMood();
            Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
        }
        catch (MoodAnalyser.MoodAnalysisException e){
            System.out.println("Error");
        }
        }
    @Test
    public void testNullMood(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood();
        }
        catch(MoodAnalyser.MoodAnalysisException e){
            Assert.assertThat(e.getMessage(), CoreMatchers.is("Mood is null"));
        }
    }
    @Test
    public void testEmptyMood(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            String mood = moodAnalyser.analyseMood();
        }
        catch(MoodAnalyser.MoodAnalysisException e){
            Assert.assertThat(e.getMessage(), CoreMatchers.is("Mood is empty"));
        }
    }


}
