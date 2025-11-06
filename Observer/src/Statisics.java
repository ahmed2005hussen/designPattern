public class Statisics implements Observer , DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("in Statisics");
        System.out.println("temperature: " + temperature);
        System.out.println("humidity: " + humidity);
        System.out.println("---");


    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
