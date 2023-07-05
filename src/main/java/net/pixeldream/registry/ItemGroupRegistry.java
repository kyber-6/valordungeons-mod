package net.pixeldream.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pixeldream.Valor;

public class ItemGroupRegistry {
    public static final ItemGroup VALOR_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Valor.MOD_ID, Valor.MOD_ID), FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + Valor.MOD_ID)).icon(() -> new ItemStack(Items.RED_MUSHROOM)).entries((displayContext, entries) -> {
        entries.add(ItemRegistry.FIRST_DUNGEON_KEY);
    }).build());



    public static void init() {
        Valor.LOGGER.info("Registering item group for " + Valor.MOD_ID);
    }
}
