package net.novateam.nvt_mod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.novateam.nvt_mod.NVTMod;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void onInit(CallbackInfo ci) {
		NVTMod.LOGGER.info("This line is printed by an example mod (now NVT MOD) mixin!");
	}
}
