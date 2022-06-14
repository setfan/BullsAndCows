
class User {
    private String firstName;
    private String lastName;
    private static final String EMPTY_STRING = "";

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (null != firstName && !"".equals(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (null != lastName && !"".equals(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        if (!EMPTY_STRING.equals(firstName) && !EMPTY_STRING.equals(lastName)) {
            return firstName + " " + lastName;
        } else if (EMPTY_STRING.equals(firstName) && !EMPTY_STRING.equals(lastName)) {
            return lastName;
        } else if (!EMPTY_STRING.equals(firstName)) {
            return firstName;
        } else {
            return "Unknown";
        }
    }
}