package com.hyengra.mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.render.WorldRenderer;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @Inject(method = "render", at = @At("RETURN"))
    private void onRender(CallbackInfo ci) {
        System.out.println("[HYENGRA] Render hook ativo");
    }
}
