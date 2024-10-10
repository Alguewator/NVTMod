package com.example.example_mod;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PlantsItems {
    public static final Item BELLADONNA_ITEM = new Item(new Settings());
    public static final Item HEMLOCK_ITEM = new Item(new Settings());
    public static final Item BROADLEAF_PLANTAIN_ITEM = new Item(new Settings());
    
    public static void register(ModContainer mod) {
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "belladonna_item"), BELLADONNA_ITEM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "hemlock_item"), HEMLOCK_ITEM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "broadleaf_plantain_item"), BROADLEAF_PLANTAIN_ITEM);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(entries -> {
            entries.addItem(BELLADONNA_ITEM);
            entries.addItem(HEMLOCK_ITEM);
            entries.addItem(BROADLEAF_PLANTAIN_ITEM);
        });
    }
}
