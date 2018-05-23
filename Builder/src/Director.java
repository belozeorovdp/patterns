class Director
{
    private PersonBuilder personBuilder;

    public void setComputerBuilder(PersonBuilder personBuilder)
    {
        this.personBuilder = personBuilder;
    }

    public Person getPerson()
    {
        return personBuilder.getPerson();
    }

    public void constructComputer()
    {
        personBuilder.createNewPerson();
        personBuilder.buildFirstName("Ivan");
        personBuilder.buildLastName("Ivanov");
        personBuilder.buildMiddleName("Ivanovich");
    }
}