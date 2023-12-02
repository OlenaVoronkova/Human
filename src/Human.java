import java.util.Scanner;

public class Human {
    public String name;
    public String surname;
    private int age;
    public double height;
    private String eyesColor;
    private String hairColor;
    private boolean single;
    private String zodiacSign;

    public Human(String name, String surname, int age, double height, String hairColor, String eyesColor, boolean single, String zodiacSign) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
        this.single = single;
        this.zodiacSign = zodiacSign;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public boolean isSingle() {
        return single;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void sayHello() {
        System.out.println("Hello! My name is " + name + " , my surname is " + surname + " , I am " + age + " years old , my height is " + height + ", my eye color is " + eyesColor + " , my hair color is " + hairColor + " , I am single " + single + " , my zodiac sign is " + zodiacSign+ "'.'");
    }


    public static void main(String[] args) {
        Human helen = new Human("Helen", "Voronkova", 28, 165.5, "Brown", "Brown-Green", false, "Gemini");
        helen.sayHello();


    }
}


