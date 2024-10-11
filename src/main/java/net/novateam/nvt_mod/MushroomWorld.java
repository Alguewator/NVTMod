package net.novateam.nvt_mod;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.minecraft.block.MushroomPlantBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;

public class MushroomWorld {

    public static final Block FIREGUARD_MUSHROOM = new MushroomPlantBlock(
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .postProcess(Blocks::solid)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance(state -> 1)
                    .nonOpaque()
                    );

    public static void register(ModContainer mod) {
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "fireguard"), FIREGUARD_MUSHROOM);
    }

    /*
     * public static final Item USELESSMIAOU_ITEM = new Item(new Settings());
     * 
     * 
     * 
     * public static void register(ModContainer mod) {
     * Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(),
     * "uselessmiaou"), USELESSMIAOU_ITEM);
     * 
     * ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries
     * -> {
     * entries.addItem(USELESSMIAOU_ITEM);
     * });
     * }
     * 
     */
}