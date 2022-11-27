import org.example.AddService;
import org.example.CalcService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalcService1Test {
    CalcService calcService;

    @Mock
    AddService addService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalc() {
        System.out.println("**--- Test testCalc executed ---**");
        calcService = new CalcService(addService);

        int num1 = 11;
        int num2 = 12;
        int expected = 23;

        when(addService.add(num1, num2)).thenReturn(expected);
        int actual = calcService.calc(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void testVerifyInteraction() {
//        @SuppressWarnings("unchecked")
        List<String> mockedList = mock(List.class);
        mockedList.add("first-element");
        mockedList.add("second-element");
        mockedList.add("third-element");
        mockedList.add("third-element");
        mockedList.clear();

        verify(mockedList).add("first-element");
        verify(mockedList).add("second-element");
        verify(mockedList, VerificationModeFactory.times(2)).add("third-element");
        verify(mockedList).clear();
    }

//    @SuppressWarnings("unchecked")
    @Test
    public void stubConcreteClass() {
        ArrayList mockedList = mock(ArrayList.class);
        when(mockedList.get(0)).thenReturn("first-element");
        System.out.println(mockedList.get(0));
        assertEquals("first-element", mockedList.get(0));
        // "null" gets printed as get(1) is not stubbed
        System.out.println(mockedList.get(1));
    }

    // TODO: Not working, fix this
    @Test
    public void testMethod() {
        List<String> list = new ArrayList<>();
        List<String> listSpy = spy(list);

        listSpy.add("first-element");
        System.out.println(listSpy.get(0));

        assertEquals("first-element", listSpy.get(0));
        when(listSpy.get(0)).thenReturn("second-element");
        System.out.println(listSpy.get(0));
        assertEquals("second-element", listSpy.get(0));
    }

}
