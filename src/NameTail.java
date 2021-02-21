import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
1. Given a list /Array of names, sort the such that each name is followed
 by a name which starts
with the last character of the previous name.


There is a set of property of the list.
1. Start character is unique.
2. End character is unique.
3. It becomes an all inclusive chain.


Input:- Ishant, Dhoni, tendulkar, rahul, Zed.
Output:- Zed, Dhoni, ishant, tendulkar, rahul

*/
class Name{
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
public class NameTail {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ishant", "dhoni", "tendulkar" , "rahul" , "zed");
        Map<Character,Name> characterNameMap = new HashMap<>();
        String head = null;
        for(String str : names){
            Character firstChar = str.charAt(0);
            Character lastChar = str.charAt(str.length() - 1);

            Name firstName = characterNameMap.get(firstChar);
            Name lastName = characterNameMap.get(lastChar);

            if(firstName == null){
                head = str;
                firstName = new Name();
                firstName.setFirstName(str);
                startWith(characterNameMap, firstChar, firstName);
            } else{
                firstName.setFirstName(str);
                startWith(characterNameMap, firstChar, firstName);
            }

            if(lastName == null){
                lastName = new Name();
                lastName.setLastName(str);
                startWith(characterNameMap, lastChar, lastName);
            }else{
                lastName.setLastName(str);
                startWith(characterNameMap, lastChar, lastName);
            }

        }

        for (Map.Entry<Character,Name> entry : characterNameMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        while(head != null){
            System.out.print(head + " , ");
            head = characterNameMap.get(head.charAt(head.length() - 1)).getFirstName();
        }
    }

    public static void startWith(Map<Character,Name> characterNameMap, Character firstChar, Name name){
        characterNameMap.put(firstChar, name);
    }
}


