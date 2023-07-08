package net.pixeldream.valor.entity.client;

import net.minecraft.util.Identifier;
import net.pixeldream.valor.Valor;
import net.pixeldream.valor.entity.SpiritFoxEntity;
import software.bernie.geckolib.model.GeoModel;

public class SpiritFoxModel extends GeoModel<SpiritFoxEntity> {
    @Override
    public Identifier getModelResource(SpiritFoxEntity animatable) {
        return new Identifier(Valor.MOD_ID, "geo/entity/spirit_fox.geo.json");
    }

    @Override
    public Identifier getTextureResource(SpiritFoxEntity animatable) {
        return new Identifier(Valor.MOD_ID, "textures/entity/spirit_fox.png");
    }

    @Override
    public Identifier getAnimationResource(SpiritFoxEntity animatable) {
        return new Identifier(Valor.MOD_ID, "animations/entity/spirit_fox.animation.json");
    }
}
