package JavaRush.RepkaStory;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh()
    {
        return this.namePadezh;
    }

    public void pull(Person person) {
        System.out.println(this.name + " за " + person.getNamePadezh());
    }
}
