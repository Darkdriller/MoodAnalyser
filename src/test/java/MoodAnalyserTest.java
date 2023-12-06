import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad Message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
