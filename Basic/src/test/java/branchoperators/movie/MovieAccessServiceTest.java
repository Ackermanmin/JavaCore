package branchoperators.movie;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {
    @Test
    public void whenAgeIncorrect(){
        String expected = "Incorrect age, please check user";
        String result = MovieAccessService.accessMovie(-2);
        Assert.assertEquals(expected,result);

}
@Test
    public void whenAgeIsRatingR() {
        String expected = "Rating R. Access is allowed.";
        String result = MovieAccessService.accessMovie(20);
        Assert.assertEquals(expected, result);
}
@Test
    public void whenAgeIsRatingF() {
        String expected = "Rating F. Access is allowed.";
        String result = MovieAccessService.accessMovie(22);
        Assert.assertEquals(expected,result);

}
}