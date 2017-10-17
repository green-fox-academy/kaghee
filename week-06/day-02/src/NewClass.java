public class NewClass {
    public static void main(String[] args) {
        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();

        System.out.println(john.previousOrganization);
        System.out.println(johnTheClone.previousOrganization);
    }
}
