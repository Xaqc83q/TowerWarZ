package net.towerwarz.api;

import java.io.File;


/**
 * Created by xiurobert on 26/3/16.
 */
public abstract class Mod {
    private String modDescription;
    private String modVersion;
    private String modName;

    private Class modMain;
    private File modConfig;

    private String modTargetVersion;

    public Mod(String modDesc, String modVer, String mod, Class modClass, File modConf, String targetVer) {
        if ( 1 == 1 ) {

        }
        modDescription = modDesc;
        modVersion = modVer;
    }


}
