package com.THproject.tharidia_things.entity;

import com.THproject.tharidia_things.TharidiaThings;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

/**
 * Registers custom entities - Dice only
 */
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = 
        DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, TharidiaThings.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<DiceEntity>> DICE =
        ENTITIES.register("dice", () -> EntityType.Builder
            .<DiceEntity>of(DiceEntity::new, MobCategory.MISC)
            .sized(0.35f, 0.35f)
            .clientTrackingRange(8)
            .updateInterval(2)
            .build("dice"));
}
