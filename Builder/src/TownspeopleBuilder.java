public class TownspeopleBuilder extends PersonBuilder
{
    @Override
    public Person getPerson()
    {
        return super.getPerson();
    }

    @Override
    public void createNewPerson()
    {
        super.createNewPerson();
    }

    @Override
    public void buildLastName(String str)
    {
          person.setFirstName(str);
    }

    @Override
    public void buildFirstName(String str)
    {
       person.setLastName(str);
    }

    @Override
    public void buildMiddleName(String str)
    {
         person.setMiddleName(str);
    }
}
