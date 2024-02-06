public class StudentMaker {
  
  public static void main(String[] args) {
    public class StudentMaker {
      public static void main(String[] args) {
        Address address = new Address("Causeway Bay", "Tung Lo Wan Road", 180);
        Student student = new Student(17, "Belinda", "Yu", 12, address);

        student.setFirstName("Bella");
        int age = student.getAge();
        System.out.println("Bella's age: " + age);

        age = student.birthday();
        System.out.println("New age: " + age);

        System.out.println(student.toString());
      }
    }
    
    
  }
  
}
