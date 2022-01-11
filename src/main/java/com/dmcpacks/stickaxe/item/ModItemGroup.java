package com.dmcpacks.stickaxe.item;

import com.dmcpacks.stickaxe.Stickaxe;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DIRTMONDS = FabricItemGroupBuilder.build(new Identifier(Stickaxe.MOD_ID, "dirtmonds"),
            () -> new ItemStack(ModItems.STICKAXE));
}
