public class BmiService {
    public int calculate(double weight, double height) {
        double bmi = weight / (height * height); // вычисляем индекс массы тела

        return (int) bmi;
    }
}
