public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson",34,180,73.5);
        Person Person02 = new Person("Bob Thornley",25,171,68.2);
        Person Person03 = new Person("Santa Clause",2500,120,140.2);
        System.out.println("All Peoples:");
        System.out.println(Person01.getName()+", "+Person01.getAge()+" Years, "+Person01.getHeight()+"cm, "+Person01.getWeight()+"lbs");
        System.out.println(Person02.getName()+", "+Person02.getAge()+" Years, "+Person02.getHeight()+"cm, "+Person02.getWeight()+"lbs");
        System.out.println(Person03.getName()+", "+Person03.getAge()+" Years, "+Person03.getHeight()+"cm, "+Person03.getWeight()+"lbs");
        Person01.GrowOlder();
        System.out.println("\nAll Peoples but James is older, shorter and lighter:");
        System.out.println(Person01.getName()+", "+Person01.getAge()+" Years, "+Person01.getHeight()+"cm, "+Person01.getWeight()+"lbs");
        System.out.println(Person02.getName()+", "+Person02.getAge()+" Years, "+Person02.getHeight()+"cm, "+Person02.getWeight()+"lbs");
        System.out.println(Person03.getName()+", "+Person03.getAge()+" Years, "+Person03.getHeight()+"cm, "+Person03.getWeight()+"lbs");

    }

}
