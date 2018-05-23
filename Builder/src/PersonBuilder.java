
abstract class PersonBuilder
{
    protected Person person;

    public Person getPerson() {
        return person;
    }

    public void createNewPerson()
    {
        person = new Person("lastName", "firstName", "middleName", "salutation", "suffix", "streetAddress", "city", "state", false, false, false);
    }

    public abstract void buildLastName(String str);
    public abstract void buildFirstName(String str);
    public abstract void buildMiddleName(String str);
}