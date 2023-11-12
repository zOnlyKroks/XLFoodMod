package de.zonlykroks.xlfoodmod;

import net.fabricmc.api.ModInitializer;

public class XLFoodMod implements ModInitializer {

    public static final String MODID = "xlfoodmod";

    @Override
    public void onInitialize() {
        new CropBlocks();
    }
}
