package com.blume.newmod;

import com.blume.newmod.registry.ModItem;
import net.fabricmc.api.ModInitializer;

public class NewMod implements ModInitializer {
    public static final String MOD_ID = "newmod";

    @Override
    public void onInitialize() {
        System.out.println("Hello world!!!!BLUMEBLUME!!!!!!!");

        ModItem.registerAllItems();
    }
}
