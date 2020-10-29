class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (this.firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (this.lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if ((this.firstName != null) && (this.lastName != null)) {
            return this.firstName + " " + this.lastName;
        } else if ((this.firstName == null) && (this.lastName == null)) {
            return "Unknown";
        } else if (this.firstName == null) {
            return this.lastName;
        }
        return this.firstName;

    }
}