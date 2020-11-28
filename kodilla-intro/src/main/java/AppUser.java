public class AppUser {
    private String name;
    private double age;
    private double height;

    public AppUser(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getDescription() {
         if(this.name == null) {
            return "";
        }
        if (this.age > 30 && this.height > 160) {
            return "User is older than 30 and higher than 160cm";
        }
        else {
            return "User is 30 (or younger) or 160cm (or shorter)";

        }

    }

}





