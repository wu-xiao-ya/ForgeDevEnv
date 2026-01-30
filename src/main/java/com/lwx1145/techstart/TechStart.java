package com.lwx1145.techstart;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = TechStart.MODID, name = TechStart.NAME, version = TechStart.VERSION)
public class TechStart {
    public static final String MODID = "techstart";
    public static final String NAME = "Tech Start";
    public static final String VERSION = "1.0.0";
    
    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", NAME);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Init phase code here
    }
}