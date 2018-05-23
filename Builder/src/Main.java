public class Main
{
    public static void main(String[] args)
    {
        Director director = new Director();
        PersonBuilder townspeopleBuilder = new TownspeopleBuilder();

        director.setComputerBuilder(townspeopleBuilder);
        director.constructComputer();

        Person person = director.getPerson();

        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getMiddleName());

        JsonPerson jsonPerson = new JsonPerson(person);
        System.out.print(jsonPerson.personJson.toString());



    }
}
