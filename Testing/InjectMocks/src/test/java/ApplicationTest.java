import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ApplicationTest {
    @InjectMocks
    MainClass mainClass;

    @Mock
    DatabaseDAO dependentClassOne;

    @Mock
    NetworkDAO dependentClassTwo;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validateTest1()
    {
        boolean saved = mainClass.save("temp.txt");
        assertTrue(saved);
    }

    @Test
    public void validateTest2()
    {
        boolean saved = mainClass.save("temp.txt");
        assertTrue(saved);

        verify(dependentClassOne, times(1)).save("temp.txt");
        verify(dependentClassTwo, times(1)).save("temp.txt");
    }
}
