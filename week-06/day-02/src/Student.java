public class Student implements Cloneable {
    String previousOrganization;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public Student clone() {
        try {
            return (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
