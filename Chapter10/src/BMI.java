/**
 * Created by xiong on 10/1/16.
 */
public class BMI {
    private String name;
    private int age;
    private double weightInPounds;
    private double heightInInches;
    public final double KILOGRAMS_PER_POUND = 0.45359237;
    public final double METERS_PER_INCH = 0.0254;

    public BMI(String name, double weightInPounds, double heightInInches) {
        this(name,20, weightInPounds,heightInInches);
    }

    public BMI(String name, int age, double weightInPounds, double heightInInches) {
        this.name = name;
        this.age = age;
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
    }

    public BMI(String name, int age, double weightInPounds, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weightInPounds = weightInPounds;
        this.heightInInches = feet * 12 + inches;
    }

    public double getBMI() {
        double bmi = weightInPounds * KILOGRAMS_PER_POUND /
                ((heightInInches * METERS_PER_INCH) * (heightInInches * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 16)
            return "seriously underweight";
        else if (bmi < 18)
            return "underweight";
        else if (bmi < 24)
            return "normal weight";
        else if (bmi < 29)
            return "over weight";
        else if (bmi < 35)
            return "seriously over weight";
        else
            return "gravely over weight";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public double getHeightInInches() {
        return heightInInches;
    }
}
