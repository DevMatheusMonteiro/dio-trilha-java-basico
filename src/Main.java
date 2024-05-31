import edu.dio.sintaxeDoJava.SmartTV;

public class Main {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        for (int i = 0; i < 16; i++) {
            smartTV.aumentarCanal();
        }
        smartTV.setCanal(10);
        for (int i = 0; i < 100; i++){
            smartTV.aumentarVolume();
        }
        smartTV.setMudo(true);
        for (int i = 0; i < 30; i++){
            smartTV.aumentarVolume();
        }
        for (int i = 0; i < 20; i++){
            smartTV.diminuirVolume();
        }
        for (int i = 0; i < 3; i++){
            smartTV.diminuirCanal();
        }
        System.out.println(smartTV);
    }
}