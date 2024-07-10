package net.jasonyes.nethervillagersmod.datagen;

import net.jasonyes.nethervillagersmod.NetherVillagersMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PoiTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPoiTypeTagsProvider extends PoiTypeTagsProvider {

    public ModPoiTypeTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, NetherVillagersMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE).addOptional(new ResourceLocation(NetherVillagersMod.MODID, "nether_sourcers_table_poi"));
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE).addOptional(new ResourceLocation(NetherVillagersMod.MODID, "nether_gatherers_table_poi"));
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE).addOptional(new ResourceLocation(NetherVillagersMod.MODID, "nether_looters_table_poi"));
    }
}