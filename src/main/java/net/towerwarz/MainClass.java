package net.towerwarz;

/**
 * Created by xiurobert on 19/4/2015.
 */

import static java.lang.System.out;
import net.towerwarz.GUI.*;


public class MainClass {

    public static void main(String[] args) {
//         out.println("Starting TowerWarZ...");
//         out.println("Loading dependencies...");
        out.println("Loading...");
        Launcher.startLauncher();
        
        
        // Destroy code, because gameInstance can only be started when user runs an action
        //GameInstance game = new GameInstance();
    }
}
