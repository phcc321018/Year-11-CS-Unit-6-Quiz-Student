public class Student {
    public int getAge() {
        return 0;
    }

    public class Student {
        private int age;
        private String firstName;
        private String lastName;
        private int year;
        private Address address;

        public Student(int age, String firstName, String lastName, int year, Address address) {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
            this.year = year;
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        private void addOneAge() {
            age++;
        }

        public int birthday() {
            addOneAge();
            return age;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address.toString();
        }
    }
}

/*

A Student class will have five instance variables. Ensure that each instance variable is declared as private.
age (int)
firstName (String)
lastName (String)
year (int)
address (Address)
A Student class will have one constructor.
The constructor will have five parameters. The five parameters will be used to initialize the five instance variables.
A Student class will have a getter method for each instance variable.
A Student class will have a setter method for each instance variable.
A Student class will have a private method called addOneAge that is parameterless and increments the age of the Student.
A Student class will have a method called birthday that calls addOneAge and returns the age of the Student.
A Student class will have a toString method that returns, for example, a String in the following format:
"Belinda Yu, age 17, year 12, 180 Tung Lo Wan Road, Causeway Bay"

 */