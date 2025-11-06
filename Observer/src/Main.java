class Main{
    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        Observer o1 = new Current();

        weatherData.registerObserver(o1);
        System.out.println("Test1");
        System.out.println("-----");
        weatherData.setMeasurements(12.4f , 12.1f, 12.3f);
        System.out.println("-------------------------");


        Observer o2 = new Forecast();
        weatherData.registerObserver(o2);

        System.out.println("Test2");
        System.out.println("-----");
        weatherData.setMeasurements(1f , 2.1f, 3.3f);
        System.out.println("-------------------------");



        weatherData.removeObserver(o1);

        Observer o3 = new Statisics();
        weatherData.registerObserver(o3);

        System.out.println("Test3");
        System.out.println("-----");
        weatherData.setMeasurements(1212f , 1221f, 123f);
        System.out.println("-------------------------");


    }
}