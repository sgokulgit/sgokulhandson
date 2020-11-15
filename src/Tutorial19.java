class Person
{
    String name;
    int age;

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    public void displayValue(String name1) {
    }
}



public class Tutorial19 {
    public static void main(String [] args)
    {
        Person p = new Person();
        p.name = "Shravya";
        p.age = 33;

        int age1 = p.getAge();
        String name1 = p.getName();

        System.out.println(name1);
        System.out.println(age1);

    }
}
