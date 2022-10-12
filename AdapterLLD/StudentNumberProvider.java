import java.util.*;
public class StudentNumberProvider implements INumberProvider{

    String[] studentDetails = {"Aqib;CSE;997685767;UP",
                               "Pratyas;ECE;547669869;Bihar",
                               "Aman;IT;87789807;UP",
                               "Gulshan;CSE;978968758;UP"};
    @Override
    public List<String> getPhoneNos() {
        List<String> phones = new ArrayList<>();
        for(String s : studentDetails) {
            phones.add(s.split(";")[2]);
        }
        return phones;
    }
}