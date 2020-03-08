/**
 * Created by Bartłomiej Skorowski on 21.01.2020.
 */
public class Conversions {

    double mm;
    double cm;
    double m;
    int h;
    int min;
    int sec;

        double mToCm(double m) {
            return m * 100;
        }

        double mToMm(double m) {
            return m * 1000;
        }

        double cmToM(double cm) {
            return cm * 0.01;
        }

        double mmToM(double mm) {
            return mm * 0.001;
        }

        int hToMin() {
            return h * 60;
        }

        int minToSec() {
            return min * 60;
        }

        int secToMsec() {
            return sec * 1000;
        }








}
