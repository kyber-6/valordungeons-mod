package net.pixeldreamstudios.valordungeons.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pixeldreamstudios.valordungeons.ValorDungeons;

public class ItemRegistry {
    public static final Item SKULLHAVEN_KEY = registerItem("skullhaven_key", new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ValorDungeons.MOD_ID, name), item);
    }

    public static void initialize() {
        ValorDungeons.LOGGER.info("Registering items for " + ValorDungeons.MOD_ID);
    }
}
