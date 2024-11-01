package com.coqire.bageksdeco.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DecoCreativeModeTab {
    public static final CreativeModeTab BAGEKSDECO_TAB = new CreativeModeTab("bageksdecotab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FENCELOGO.get());
        }
        @Override
        public boolean hasSearchBar() { return true; }

    }.setBackgroundImage(new ResourceLocation("minecraft","textures/gui/container/creative_inventory/tab_item_search.png"));
}
