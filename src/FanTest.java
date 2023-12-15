public class FanTest {
    public static void main(String[] args) {
        Fan modelEkonom = new Fan(); // создание новго экземпляра
        modelEkonom.bladeCount = 7;
        modelEkonom.maxMode = 3;
        modelEkonom.potreblenieElektroenergii = 4;

        Fan modelStandart = new Fan();
        modelStandart.bladeCount = 15;
        modelStandart.maxMode = 5;
        modelStandart.potreblenieElektroenergii = 10;


    }
    public static void printFanInfo(Fan fan){
        System.out.println("oboroti: " + fan.oborotovVMinutu + " : " + "режим: " + fan.mode);
    }
}
