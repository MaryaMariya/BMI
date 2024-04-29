public class BmiService {
    public double calculate(double weight, double height) {
        double bmi;
        bmi = weight / (height * height); // вычисляем индекс массы тела

        return bmi;
    }
}
