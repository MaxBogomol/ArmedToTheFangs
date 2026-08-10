package mod.maxbogomol.armed_to_the_fangs.registry.common.item;

import mod.maxbogomol.armed_to_the_fangs.ArmedFangs;
import mod.maxbogomol.fluffy_fur.client.render.item.LargeItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

public class ArmedFangsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArmedFangs.MOD_ID);

    public static final RegistryObject<Item> WOODEN_SCYTHE = ITEMS.register("wooden_scythe", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_BATTLE_KNIFE = ITEMS.register("wooden_battle_knife", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_RAPIER = ITEMS.register("wooden_rapier", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_KATANA = ITEMS.register("wooden_katana", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_LONGSWORD = ITEMS.register("wooden_longsword", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_TWINBLADE = ITEMS.register("wooden_twinblade", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HALBERD = ITEMS.register("wooden_halberd", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_FRYING_PAN = ITEMS.register("wooden_frying_pan", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SPOON = ITEMS.register("wooden_spoon", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_FORK = ITEMS.register("wooden_fork", () -> new SwordItem(Tiers.WOOD, -1, -1f, new Item.Properties()));

    public static final RegistryObject<Item> STONE_SCYTHE = ITEMS.register("stone_scythe", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_BATTLE_KNIFE = ITEMS.register("stone_battle_knife", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_RAPIER = ITEMS.register("stone_rapier", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_KATANA = ITEMS.register("stone_katana", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_LONGSWORD = ITEMS.register("stone_longsword", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_GLAIVE = ITEMS.register("stone_glaive", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_TWINBLADE = ITEMS.register("stone_twinblade", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_HALBERD = ITEMS.register("stone_halberd", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_FRYING_PAN = ITEMS.register("stone_frying_pan", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SPOON = ITEMS.register("stone_spoon", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_FORK = ITEMS.register("stone_fork", () -> new SwordItem(Tiers.STONE, -1, -1f, new Item.Properties()));

    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BATTLE_KNIFE = ITEMS.register("iron_battle_knife", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register("iron_rapier", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register("iron_katana", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register("iron_glaive", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_TWINBLADE = ITEMS.register("iron_twinblade", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HALBERD = ITEMS.register("iron_halberd", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_FRYING_PAN = ITEMS.register("iron_frying_pan", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SPOON = ITEMS.register("iron_spoon", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_FORK = ITEMS.register("iron_fork", () -> new SwordItem(Tiers.IRON, -1, -1f, new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BATTLE_KNIFE = ITEMS.register("golden_battle_knife", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_RAPIER = ITEMS.register("golden_rapier", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_KATANA = ITEMS.register("golden_katana", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_LONGSWORD = ITEMS.register("golden_longsword", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_TWINBLADE = ITEMS.register("golden_twinblade", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HALBERD = ITEMS.register("golden_halberd", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_FRYING_PAN = ITEMS.register("golden_frying_pan", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_SPOON = ITEMS.register("golden_spoon", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_FORK = ITEMS.register("golden_fork", () -> new SwordItem(Tiers.GOLD, -1, -1f, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BATTLE_KNIFE = ITEMS.register("diamond_battle_knife", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_RAPIER = ITEMS.register("diamond_rapier", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register("diamond_katana", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_TWINBLADE = ITEMS.register("diamond_twinblade", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_FRYING_PAN = ITEMS.register("diamond_frying_pan", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPOON = ITEMS.register("diamond_spoon", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_FORK = ITEMS.register("diamond_fork", () -> new SwordItem(Tiers.DIAMOND, -1, -1f, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BATTLE_KNIFE = ITEMS.register("netherite_battle_knife", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_RAPIER = ITEMS.register("netherite_rapier", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register("netherite_katana", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_TWINBLADE = ITEMS.register("netherite_twinblade", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_FRYING_PAN = ITEMS.register("netherite_frying_pan", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_SPOON = ITEMS.register("netherite_spoon", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_FORK = ITEMS.register("netherite_fork", () -> new SwordItem(Tiers.NETHERITE, -1, -1f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    @Mod.EventBusSubscriber(modid = ArmedFangs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientRegistryEvents {
        @SubscribeEvent
        public static void modelRegistryItems(ModelEvent.RegisterAdditional event) {
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_scythe"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_katana"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_greatsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_longsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_spear"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_glaive"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_twinblade"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_halberd"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_spoon"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "wooden_fork"));

            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_scythe"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_katana"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_greatsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_longsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_spear"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_glaive"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_twinblade"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_halberd"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_spoon"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "stone_fork"));

            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_scythe"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_katana"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_greatsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_longsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_spear"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_glaive"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_twinblade"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_halberd"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_spoon"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "iron_fork"));

            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_scythe"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_katana"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_greatsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_longsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_spear"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_glaive"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_twinblade"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_halberd"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_spoon"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "golden_fork"));

            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_scythe"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_katana"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_greatsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_longsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_spear"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_glaive"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_twinblade"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_halberd"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_spoon"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "diamond_fork"));

            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_scythe"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_katana"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_greatsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_longsword"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_spear"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_glaive"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_twinblade"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_halberd"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_spoon"));
            event.register(LargeItemRenderer.getModelResourceLocation(ArmedFangs.MOD_ID, "netherite_fork"));
        }

        @SubscribeEvent
        public static void modelBakeItems(ModelEvent.ModifyBakingResult event) {
            Map<ResourceLocation, BakedModel> map = event.getModels();

            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_scythe");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_katana");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_greatsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_longsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_spear");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_glaive");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_twinblade");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_halberd");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_spoon");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "wooden_fork");

            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_scythe");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_katana");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_greatsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_longsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_spear");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_glaive");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_twinblade");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_halberd");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_spoon");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "stone_fork");

            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_scythe");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_katana");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_greatsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_longsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_spear");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_glaive");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_twinblade");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_halberd");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_spoon");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "iron_fork");

            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_scythe");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_katana");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_greatsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_longsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_spear");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_glaive");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_twinblade");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_halberd");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_spoon");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "golden_fork");

            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_scythe");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_katana");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_greatsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_longsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_spear");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_glaive");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_twinblade");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_halberd");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_spoon");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "diamond_fork");

            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_scythe");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_katana");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_greatsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_longsword");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_spear");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_glaive");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_twinblade");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_halberd");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_spoon");
            LargeItemRenderer.bakeModel(map, ArmedFangs.MOD_ID, "netherite_fork");
        }
    }
}
