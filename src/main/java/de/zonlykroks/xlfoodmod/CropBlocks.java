package de.zonlykroks.xlfoodmod;

import de.zonlykroks.xlfoodmod.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CropBlocks {

    public static final CropBlock CORN_PLANT = (CropBlock) registerBlock("corn_plant",new CornPlant());
    public static final CropBlock CUCUMBER_PLANT = (CropBlock) registerBlock("cucumber_plant",new CucumberPlant());

    public static final CropBlock LEMON_PLANT = (CropBlock) registerBlock("lemon_plant",new LemonPlant());

    public static final CropBlock LETTUCE_PLANT = (CropBlock) registerBlock("lettuce_plant",new LettucePlant());

    public static final CropBlock ONION_PLANT = (CropBlock) registerBlock("onion_plant",new OnionPlant());

    public static final CropBlock PEPPER_PLANT = (CropBlock) registerBlock("pepper_plant",new PepperPlant());

    public static final CropBlock PINEAPPLE_PLANT = (CropBlock) registerBlock("pineapple_plant",new PineapplePlant());

    public static final CropBlock RICE_PLANT = (CropBlock) registerBlock("rice_plant",new RicePlant());

    public static final CropBlock STRAWBERRY_PLANT = (CropBlock) registerBlock("strawberry_plant",new StrawberryPlant());

    public static final CropBlock TOMATO_PLANT = (CropBlock) registerBlock("tomato_plant",new TomatoPlant());

    public static final Block ROCK_SALT_BLOCK = registerBlock("rock_salt",new RockSaltBlock());

    private static Block registerBlock(String name, Block cropBlock) {
        return Registry.register(Registries.BLOCK, new Identifier(XLFoodMod.MODID, name),cropBlock);
    }
}
