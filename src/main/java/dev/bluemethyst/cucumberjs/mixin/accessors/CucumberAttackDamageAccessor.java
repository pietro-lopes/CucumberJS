package dev.bluemethyst.cucumberjs.mixin.accessors;

import com.blakebr0.cucumber.item.tool.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = {BaseAxeItem.class, BaseHoeItem.class, BasePickaxeItem.class, BaseShovelItem.class, BaseSwordItem.class}, remap = false)
public interface CucumberAttackDamageAccessor {

    @Mutable
    @Accessor("attackDamage")
    void kjs_ccmbr$setAttackDamage(float dmg);
}
