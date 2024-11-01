package com.coqire.bageksdeco.block;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.block.custom.CrossbuckFenceBlock;
import com.coqire.bageksdeco.item.DecoCreativeModeTab;
import com.coqire.bageksdeco.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, bageksdeco.Mod_ID);

    public static final RegistryObject<Block> CROSSBUCK_1 = registerBlock("crossbuck_1",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_2 = registerBlock("crossbuck_2",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_3 = registerBlock("crossbuck_3",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_4 = registerBlock("crossbuck_4",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_5 = registerBlock("crossbuck_5",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_6 = registerBlock("crossbuck_6",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_7 = registerBlock("crossbuck_7",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_8 = registerBlock("crossbuck_8",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_9 = registerBlock("crossbuck_9",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);
    public static final RegistryObject<Block> CROSSBUCK_10 = registerBlock("crossbuck_10",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            DecoCreativeModeTab.BAGEKSDECO_TAB);





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
