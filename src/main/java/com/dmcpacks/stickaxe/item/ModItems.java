package com.dmcpacks.stickaxe.item;

import com.dmcpacks.stickaxe.Stickaxe;
import com.dmcpacks.stickaxe.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item STICKAXE = registerItem("stickaxe", new ModPickaxeItem(ModToolMaterial.STICK, 1, -1.8f,
            new FabricItemSettings()
            .group(ModItemGroup.DIRTMONDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Stickaxe.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering mod items");
    }
}
