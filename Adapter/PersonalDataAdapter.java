package L02.Adapter;

import java.time.format.DateTimeFormatter;

public class PersonalDataAdapter implements PersonalInformation {

    private PersonalDataI personalData;

    public PersonalDataAdapter(PersonalDataI personalData){
        this.personalData = personalData;
    }

    @Override
    public String getPersonalInformation() {
        String name = personalData.getName();
        String yearOfBirth = personalData.getbDay().format(DateTimeFormatter.ofPattern("yyyy"));
        String email = personalData.getEmail();
        String telephone = personalData.getTelephone();

        return String.format("{\"name\":\"%s\",\"yearOfBirth\":\"%s\",\"email\":\"%s\",\"telephone\":\"%s\"}",
                name, yearOfBirth, email, telephone);
    }
}
