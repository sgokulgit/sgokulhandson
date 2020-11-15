//This is for Setter and This method test

class Frog
{
    private String name;
    private int age;




    public Frog(String name)
    {
        this.name = name;
        System.out.println("This keyword name is "+name);

    }


    public Frog()
    {
        name="THis is the private variable.";
        System.out.println(name);

        name="THis is the changed variable.";
        System.out.println(name);

        name="THis is the changed again variable.";
        System.out.println(name);

        this.name ="Different";
        System.out.println(name);
    }


   // public String newName(String name)

}


public class Tutorial21
{
    public static void main(String[] args)
    {
        new Frog();
        Frog f1= new Frog("gand");
        Frog f2= new Frog("Gosh");
        Frog f3= new Frog("ghosh");



      // f1.setName("Dhruva");
       //f2.setName("Sunil");

        //System.out.println(f1.getName());
    }

}
