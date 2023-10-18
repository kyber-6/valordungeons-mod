package net.pixeldream.valordungeons.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pixeldream.valordungeons.ValorDungeons;

public class ItemGroupRegistry {
    public static final ItemGroup VALOR_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ValorDungeons.MOD_ID, ValorDungeons.MOD_ID), FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + ValorDungeons.MOD_ID)).icon(() -> new ItemStack(Items.RED_MUSHROOM)).entries((displayContext, entries) -> {
        entries.add(ItemRegistry.FIRST_DUNGEON_KEY);
    }).build());



    public static void initialize() {
        ValorDungeons.LOGGER.info("registering item group for " + ValorDungeons.MOD_ID);
    }
}
