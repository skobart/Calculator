/**
 * Created by Bartłomiej Skorowski on 21.01.2020.
 */
public class Converter {
    public static void main(String[] args) {
        Conversions conversions = new Conversions();
        double m = 123.98;
        double cm = 158459;
        double mm = 8745854;


        double mToCm = conversions.mToCm(m);
        double mToMm = conversions.mToMm(m);
        double cmToM = conversions.cmToM(cm);
        double mmToM = conversions.mmToM(mm);

        System.out.println(m + " metrów to: " + mToCm + " centymetrów");
        System.out.println(m + " metrów to: " + mToMm + " milimetrów");
        System.out.println(cm + " centymetrów to: " + cmToM + " metrów");
        System.out.println(mm + " milimetrów to: " + mmToM + " metrów");


    }
}
