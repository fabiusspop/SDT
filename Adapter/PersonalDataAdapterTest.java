package L02.Adapter;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonalDataAdapterTest {

    @Test
    public void testGetPersonalInformation() {

        PersonalDataI personalData = new PersonalData("Florin Nitzoiu", LocalDate.of(1995, 1, 1), "florin.nitzoiu@gmail.com", "0724242324");
        PersonalInformation adapter = new PersonalDataAdapter(personalData);

        String expectedJson = "{\"name\":\"Florin Nitzoiu\",\"yearOfBirth\":\"1995\",\"email\":\"florin.nitzoiu@gmail.com\",\"telephone\":\"0724242324\"}";

        assertEquals(expectedJson, adapter.getPersonalInformation());

    }
}
