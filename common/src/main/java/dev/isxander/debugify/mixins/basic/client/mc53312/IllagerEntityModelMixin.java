package dev.isxander.debugify.mixins.basic.client.mc53312;

import dev.isxander.debugify.fixes.BugFix;
import dev.isxander.debugify.fixes.FixCategory;
import net.minecraft.client.render.entity.model.IllagerEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@BugFix(id = "MC-53312", category = FixCategory.BASIC, env = BugFix.Env.CLIENT)
@Mixin(IllagerEntityModel.class)
public class IllagerEntityModelMixin {
    @ModifyConstant(method = "getTexturedModelData", constant = @Constant(floatValue = 18.0F))
    private static float getSizeY(float sizeY) {
        return 20.0F;
    }
}