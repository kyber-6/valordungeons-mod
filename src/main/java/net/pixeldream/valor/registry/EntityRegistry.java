package net.pixeldream.valor.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pixeldream.valor.Valor;
import net.pixeldream.valor.entity.SpiritFoxEntity;

public class EntityRegistry {
    public static final EntityType<SpiritFoxEntity> SPIRIT_FOX = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Valor.MOD_ID, "spirit_fox"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SpiritFoxEntity::new).dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build()
    );

    public static void initialize() {
        Valor.LOGGER.info("registering entities for " + Valor.MOD_ID);
        FabricDefaultAttributeRegistry.register(SPIRIT_FOX, SpiritFoxEntity.setAttributes());
    }
}
