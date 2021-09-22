

public class HomeWorkFive {
    public static void main(String[] args) {
        Person person = new Person("Ivanov Ivan Ivanovich", "Manager", "Ivanov@gmail.com", 895432452, 700, 32);
        person.setFullName("Ivanov Ivan Ivanovich");
        person.setPosition("Manager");
        person.setEmail("Ivanov@gmail.com");
        person.setPhoneNumber(895432452);
        person.setSalary(700);
        person.setAge(32);
        System.out.println(person);

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Petrov Ivan Evgenevich", "Manager", "petrov@gmail.com", 896223431, 650, 41);
        persArray[1] = new Person("Ivanov Ivan Ivanovich", "Manager", "Ivanov@gmail.com", 895432452, 700, 32);
        persArray[2] = new Person("Pigorev Sergey Sergeevich", "Engineer", "pigorev@gmail.com", 895323212, 900, 43);
        persArray[3] = new Person("Volkov Viktor Viktorovich", "Manager", "volkov@gmail.com", 891843214, 500, 23);
        persArray[4] = new Person("Zosimov Oleg Igorevich", "Director", "zosimov@gmail.com", 898876532, 1200, 38);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}
