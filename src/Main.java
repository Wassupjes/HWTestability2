public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 85; // масса в килограммах
        double heightInMeters = 1.82; // рост в метрах
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println("Индекс массы тела равен, кг / м^2: " + bmi);
    }
}