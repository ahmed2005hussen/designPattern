public class Current implements Observer , DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void display() {
        System.out.println("in current");
        System.out.println("temperature: " + temperature);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
        System.out.println("---");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
