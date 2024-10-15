package net.novateam.nvt_mod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockItemTracker;
import net.minecraft.client.render.RenderLayer;

public class NVTMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Nova Team Mod");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		Artefacts.register(mod);
		MushroomWorld.register(mod);
		
		// Allows to make the mushrooms or plants transparent or translucent
		BlockRenderLayerMap.INSTANCE.putBlock(MushroomWorld.FIREGUARD_MUSHROOM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MushroomWorld.SHROOZE_MUSHROOM, RenderLayer.getCutout());
	}
}
