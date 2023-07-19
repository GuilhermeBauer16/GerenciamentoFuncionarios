

public class LimpaTerminal {
    
    public  void ApagaTerminal(){
        try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder processBuilder;

            if (os.contains("win")){
                processBuilder = new ProcessBuilder("cmd","/c","cls");

            }else{
                processBuilder = new ProcessBuilder("clear");
            }

            Process process = processBuilder.inheritIO().start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}