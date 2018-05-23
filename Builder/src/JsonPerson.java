import org.json.JSONObject;
//import org.json.simple.JSONObject;

public class JsonPerson
{
    Person person = null;
    JSONObject personJson = new JSONObject();

    public JsonPerson (Person person)
    {
        this.person = person;
        createPersonJson();
    }
    public JSONObject getPersonJson()
    {
        return personJson;
    }

    private void createPersonJson()
    {
//        personJson.put("FirstName",person.getFirstName());
//        personJson.put("LastName", person.getLastName());
//        personJson.put("MiddleName", person.getMiddleName());
//        personJson.put("City", person.getCity());
//        personJson.put("Salutation", person.getSalutation());
//        personJson.put("State", person.getState());
//        personJson.put("StreetAddress", person.getStreetAddress());
//        personJson.put("Employed",new Boolean(person.isEmployed()));
//        personJson.put("Female",new Boolean(person.isFemale()));
//        personJson.put("HomewOwner",new Boolean(person.isHomewOwner()));

        personJson.put("HomewOwner",new Boolean(person.isHomewOwner()));
        personJson.put("Female",new Boolean(person.isFemale()));
        personJson.put("Employed",new Boolean(person.isEmployed()));
        personJson.put("StreetAddress", person.getStreetAddress());
        personJson.put("State", person.getState());
        personJson.put("Salutation", person.getSalutation());
        personJson.put("City", person.getCity());
        personJson.put("MiddleName", person.getMiddleName());
        personJson.put("LastName", person.getLastName());
        personJson.put("FirstName",person.getFirstName());
    }

}
