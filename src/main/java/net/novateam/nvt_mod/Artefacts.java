package net.novateam.nvt_mod;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Artefacts {
    public static final Item USELESSMIAOU_ITEM = new Item(new Settings());

    public static void register(ModContainer mod) {
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "uselessmiaou"), USELESSMIAOU_ITEM);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addItem(USELESSMIAOU_ITEM);
        });
    }
}