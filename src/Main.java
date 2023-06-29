public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int age = 28;// возраст
        int weight = 77; // вес
        double height = 1.75; //рост
        double bmi = service.calculate(age, weight, height); //расчет bmi
        String bmiResult = String.format("%.2f", bmi);
        System.out.println("Ваш возраст : " + age + " лет");
        System.out.println("Ваши Вес : " + weight + " кг");
        System.out.println("Ваш Рост : " + height + " м");
        System.out.println("Ваш индекс массы тела : " + bmiResult + " кг/см2");

    }
}