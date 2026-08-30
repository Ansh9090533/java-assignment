class Profile {
    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {
        if (name == null || name.trim().isEmpty())
            System.out.println("Name cannot be blank");

        if (age < 0)
            System.out.println("Age cannot be negative");

        if (heightMetres <= 0)
            System.out.println("Height must be positive");

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeightMetres() {
        return heightMetres;
    }

    public String toString() {
        return "Profile[name=" + name +
                ", age=" + age +
                ", height=" + heightMetres + "m]";
    }
}

public class TextProfile {
    public static void main(String[] args) {

        String name = args[0];
        String ageText = args[1];
        String heightText = args[2];

        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);

        Profile profile = new Profile(name, age, height);

        System.out.println(profile);

        String ageAgain = Integer.toString(age);
        String heightAgain = Double.toString(height);

        System.out.println("Age as text: " + ageAgain);
        System.out.println("Height as text: " + heightAgain);
    }
}
