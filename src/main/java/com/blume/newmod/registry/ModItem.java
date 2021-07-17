package com.blume.newmod.registry;

import com.blume.newmod.NewMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem {
    public static final Item MYTHRIL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerAllItems() {
        Registry.register(Registry.ITEM, new Identifier(NewMod.MOD_ID, "mythril"), MYTHRIL);
    }
}
