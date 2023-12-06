import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysisTC1(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad Message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void testMoodAnalysisTC2(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
