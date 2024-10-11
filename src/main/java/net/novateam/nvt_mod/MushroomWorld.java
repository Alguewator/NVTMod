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

    ////////// Shroom definition

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
                    .nonOpaque());
    // Permet de linker cet objet à un item
    public static final BlockItem FIREGUARD_MUSHROOM_ITEM = new BlockItem(FIREGUARD_MUSHROOM, new Settings());

    public static final Block BLUE_ADAMANTITE_MUSHROOM = new MushroomPlantBlock(
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .postProcess(Blocks::solid)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque());
    public static final BlockItem BLUE_ADAMANTITE_MUSHROOM_ITEM = new BlockItem(BLUE_ADAMANTITE_MUSHROOM,
            new Settings());

    public static final Block SWIRL_TILESHROOM = new MushroomPlantBlock(
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .postProcess(Blocks::solid)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque());
    public static final BlockItem SWIRL_TILESHROOM_ITEM = new BlockItem(SWIRL_TILESHROOM,
            new Settings());

    public static final Block BROWN_TILESHROOM = new MushroomPlantBlock(
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .postProcess(Blocks::solid)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque());
    public static final BlockItem BROWN_TILESHROOM_ITEM = new BlockItem(BROWN_TILESHROOM,
            new Settings());

    public static final Block KINGS_CROWN_MUSHROOM = new MushroomPlantBlock(
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .postProcess(Blocks::solid)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque());
    public static final BlockItem KINGS_CROWN_MUSHROOM_ITEM = new BlockItem(KINGS_CROWN_MUSHROOM,
            new Settings());

    public static final Block SHROOZE_MUSHROOM = new MushroomPlantBlock(
            TreeConfiguredFeatures.HUGE_RED_MUSHROOM,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .postProcess(Blocks::solid)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .nonOpaque());
    public static final BlockItem SHROOZE_MUSHROOM_ITEM = new BlockItem(SHROOZE_MUSHROOM,
            new Settings());

    ///////////////// Register

    public static void register(ModContainer mod) {
        // Fireguard
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "fireguard_mushroom"),
                FIREGUARD_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "fireguard_mushroom"),
                FIREGUARD_MUSHROOM_ITEM);

        // Blue Adamantite

        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "blue_adamantite_mushroom"),
                BLUE_ADAMANTITE_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "blue_adamantite_mushroom"),
                BLUE_ADAMANTITE_MUSHROOM_ITEM);

        // Swirl shroom
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "swirl_tileshroom"),
                SWIRL_TILESHROOM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "swirl_tileshroom"),
                SWIRL_TILESHROOM_ITEM);
        // Brown shroom
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "brown_tileshroom"),
                BROWN_TILESHROOM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "brown_tileshroom"),
                BROWN_TILESHROOM_ITEM);
        // King's Crown Shroom
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "kings_crown_mushroom"),
                KINGS_CROWN_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "kings_crown_mushroom"),
                KINGS_CROWN_MUSHROOM_ITEM);

        // Shrooze Mushroom
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "shrooze_mushroom"),
                SHROOZE_MUSHROOM);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "shrooze_mushroom"),
                SHROOZE_MUSHROOM_ITEM);

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