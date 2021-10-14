public class Controller {
    private static String MSG = "MOMS";

    public static void runController() {
        Dialog dialog = new Dialog();
        CalculateVat calculateVat = new CalculateVat();
        View view = new View();
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        view.doView(moms,MSG);


    }
}
