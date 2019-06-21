package jsp.examples.allrounder.beans;

public class Bohne {
    private String username;
    private String date;

    public Bohne() {
        throw new IllegalStateException("No-Args");
    }

    public Bohne(String username, String date) {
        this.username = username;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public boolean isValid() {
        return validateUName() && validateDate();
    }

    private boolean validateUName() {
        return this.username != null && this.username.length() >= 4;
    }

    private boolean validateDate() {
        return this.date != null && this.date.length() == 10;
    }
}
