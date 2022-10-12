import java.util.*;
public class EngineerNumberProvider implements INumberProvider {
    String[] engineerDetails = {"Aqib-997685767-UP",
                               "Pratyas-547669869-Bihar",
                               "Aman-87789807-UP",
                               "Gulshan-978968758-UP"};
    @Override
    public List<String> getPhoneNos() {
        List<String> phones = new ArrayList<>();
        for(String s : engineerDetails) {
            phones.add(s.split("-")[1]);
        }
        return phones;
    }
}