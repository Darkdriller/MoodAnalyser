import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysisTC1(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void testMoodAnalysisTC2(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
