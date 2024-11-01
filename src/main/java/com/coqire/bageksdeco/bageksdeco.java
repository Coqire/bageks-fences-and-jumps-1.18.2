package com.coqire.bageksdeco;

import com.coqire.bageksdeco.block.ModBlocks;
import com.coqire.bageksdeco.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(bageksdeco.Mod_ID)
public class bageksdeco {
    public static final String Mod_ID = "bageksdeco";
    private static final Logger LOGGER = LogUtils.getLogger();

    public bageksdeco() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_1.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_2.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_3.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_4.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_5.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_6.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_7.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_8.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_9.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CROSSBUCK_10.get(), RenderType.solid());
    }
}