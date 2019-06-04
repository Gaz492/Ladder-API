package uk.gaz492.ladderapi.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import uk.gaz492.ladderapi.LadderAPI;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {

	@Inject(method = "isClimbing", at = @At(value = "RETURN", ordinal = 2), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
	public void canClimb(CallbackInfoReturnable<Boolean> cir, final BlockState state, final Block block) {
		if (block.matches(LadderAPI.CLIMBABLE)) {
			cir.setReturnValue(true);
		}
	}
}