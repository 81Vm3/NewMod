package com.blume.newmod.registry;

import com.blume.newmod.NewMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    public static final Block MYTHRIL_BLOCK =
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(3.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2)
            );

    public static void registerAllBlock() {
        Registry.register(Registry.BLOCK, new Identifier(NewMod.MOD_ID, "mythril_block"), MYTHRIL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NewMod.MOD_ID, "mythril_block"), new BlockItem(MYTHRIL_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
