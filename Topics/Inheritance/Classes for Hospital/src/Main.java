

class Person {
    protected int dateOfBirth;
    protected String firstName;
    protected String lastName;

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
}

class Employee extends Person {

    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Doctor extends Employee {

    String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

class Patient extends Person {
    String diagnose;

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
}