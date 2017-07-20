package njensen.controllers;

/**
 * Main controller for the app.
 */
public class MainController {

    public MainController() {
        init();
    }

    /**
     * Initiation of the app.
     */
    private void init() {

        systemOut("== get JVM system information ==");

        showJvmMemory();

        showSystemProperties();

    }

    /**
     * Show information about the system.
     */
    private void showSystemProperties() {

        systemOut("- JVM system information -");

        systemOut("file.separator:  : "+System.getProperty("file.separator"));
        systemOut("java.class.path: "+System.getProperty("java.class.path"));
        systemOut("java.home: "+System.getProperty("java.home"));
        systemOut("java.vendor: "+System.getProperty("java.vendor"));
        systemOut("java.vendor.url: "+System.getProperty("java.vendor.url"));
        systemOut("java.version: "+System.getProperty("java.version"));
        systemOut("os.arch: "+System.getProperty("os.arch"));
        systemOut("os.name: "+System.getProperty("os.name"));
        systemOut("os.version: "+System.getProperty("os.version"));
        systemOut("user.dir: "+System.getProperty("user.dir"));
        systemOut("user.home: "+System.getProperty("user.home"));
        systemOut("user.name: "+System.getProperty("user.name"));

    }

    /**
     * Show information about JVM memory.
     */
    private void showJvmMemory() {

        systemOut("- JVM memory -");

        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();

        int mb = 1024*1024;

        //Print used memory
        systemOut("Used Memory:"
                + ((runtime.totalMemory() - runtime.freeMemory()) / mb) + " mb");

        //Print free memory
        systemOut("Free Memory:"
                + (runtime.freeMemory() / mb) + " mb");

        //Print total available memory
        systemOut("Total Memory:" + (runtime.totalMemory() / mb) + " mb");

        //Print Maximum available memory
        systemOut("Max Memory:" + (runtime.maxMemory() / mb) + " mb");

    }

    /**
     * Print text in the console.
     *
     * @param message The message to print.
     */
    public static void systemOut(String message) {
        if (message != null && message.trim().length() > 0) {
            System.out.println(message);
        }
    }

}
