package com.coqire.bageksdeco.item;

import com.coqire.bageksdeco.bageksdeco;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, bageksdeco.Mod_ID);

    public static final RegistryObject<Item> FENCELOGO = ITEMS.register("fencelogo",
            () -> new Item(new Item.Properties().tab(DecoCreativeModeTab.BAGEKSDECO_TAB)));


public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
