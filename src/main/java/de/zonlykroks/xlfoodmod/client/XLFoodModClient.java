package de.zonlykroks.xlfoodmod.client;

import de.zonlykroks.xlfoodmod.CropBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class XLFoodModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.CORN_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.CUCUMBER_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.LEMON_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.LETTUCE_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.ONION_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.PEPPER_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.PINEAPPLE_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.RICE_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.STRAWBERRY_PLANT);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.TOMATO_PLANT);
    }
}
