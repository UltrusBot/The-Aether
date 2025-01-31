package net.id.aether.tag;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.id.aether.Aether;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class AetherFluidTags {
    public static final Tag<Fluid> SWET_TRANSFORMERS_BLUE = TagRegistry.fluid(new Identifier(Aether.MOD_ID, "swet_transformers/blue"));
    public static final Tag<Fluid> SWET_TRANSFORMERS_GOLDEN = TagRegistry.fluid(new Identifier(Aether.MOD_ID, "swet_transformers/golden"));
    public static final Tag<Fluid> SWET_TRANSFORMERS_PURPLE = TagRegistry.fluid(new Identifier(Aether.MOD_ID, "swet_transformers/purple"));
    public static final Tag<Fluid> SWET_TRANSFORMERS_VERMILION = TagRegistry.fluid(new Identifier(Aether.MOD_ID, "swet_transformers/vermilion"));
}
