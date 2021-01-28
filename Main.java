/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
public class Main {
    
    /** 
     * All this is for is to run the program.
     * It calls methods from the PrimaryWindow file and that is what starts the program
     * @param args
     */
    public static void main(String[] args) {
        PrimaryWindow mainWindow = new PrimaryWindow(); //generic object to use
        mainWindow.WindowCreation(); //this is what starts the whole program
    }
}
