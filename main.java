public class SixNine {
    public static void main(String[] args) {
        double foot = 0;
        double meter = 15;
        
        System.out.println("Feet\tMeters\t|  Meters     Feet");
        System.out.println("_________________________________________");
        
        for(int thing = 0; thing<10; thing++){
            foot++;
            meter = meter + 5;
            double fm = footToMeter(foot);
            double mf = meterToFoot(meter);
            System.out.printf(foot + "\t %.3f\t|  " + meter + "%12.3f\n", fm, mf);
        }
        
        
}//end of main method
    public static double footToMeter(double foot) {
        return 0.305 * foot;
}//end of foottometer method
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
}//end of metertofoot
}
