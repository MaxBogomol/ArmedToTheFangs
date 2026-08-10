package mod.maxbogomol.armed_to_the_fangs.registry.common.item;

import mod.maxbogomol.armed_to_the_fangs.ArmedFangs;
import mod.maxbogomol.fluffy_fur.common.creativetab.MultiCreativeTab;
import mod.maxbogomol.fluffy_fur.common.creativetab.SubCreativeTab;
import mod.maxbogomol.fluffy_fur.common.creativetab.SubCreativeTabStack;
import mod.maxbogomol.fluffy_fur.util.ColorUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ArmedFangs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArmedFangsCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArmedFangs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARMED_TO_THE_FANGS = CREATIVE_MODE_TABS.register("tab",
            () -> MultiCreativeTab.builder().icon(() -> new ItemStack(ArmedFangsItems.GOLDEN_GREATSWORD.get()))
                    .title(Component.translatable("creative_tab.armed_to_the_fangs"))
                    .withLabelColor(ColorUtil.packColor(255, 55, 48, 54))
                    .withBackgroundLocation(new ResourceLocation(ArmedFangs.MOD_ID, "textures/gui/armed_to_the_fangs_item_tab.png"))
                    .withTabsImage(new ResourceLocation(ArmedFangs.MOD_ID, "textures/gui/armed_to_the_fangs_tabs.png"))
                    .withSubArrowsImage(new ResourceLocation(ArmedFangs.MOD_ID, "textures/gui/armed_to_the_fangs_sub_arrows.png"))
                    .multiBuild());

    public static final SubCreativeTabStack ALL =
            SubCreativeTabStack.create()
                    .subTitle(Component.translatable("creative_tab.armed_to_the_fangs"))
                    .withSubTabImage(new ResourceLocation(ArmedFangs.MOD_ID, "textures/gui/armed_to_the_fangs_sub_tab.png"));

    public static final SubCreativeTab WEAPONS =
            SubCreativeTab.create().subIcon(() -> new ItemStack(ArmedFangsItems.WOODEN_GREATSWORD.get()))
                    .title(Component.translatable("creative_tab.armed_to_the_fangs.sub").append(": ").append(Component.translatable("creative_tab.armed_to_the_fangs.sub.weapons")))
                    .subTitle(Component.translatable("creative_tab.armed_to_the_fangs.sub.weapons"))
                    .withSubTabImage(new ResourceLocation(ArmedFangs.MOD_ID, "textures/gui/armed_to_the_fangs_sub_tab.png"));

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static void init() {
        if (ARMED_TO_THE_FANGS.get() instanceof MultiCreativeTab multiCreativeTab) {
            multiCreativeTab.addSubTab(ALL);
            multiCreativeTab.addSubTab(WEAPONS);
        }
    }

    public static void addCreativeTabContent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == ARMED_TO_THE_FANGS.getKey()) {
            addInSub(event, WEAPONS, () -> Items.WOODEN_SWORD);
            addInSub(event, WEAPONS, () -> Items.WOODEN_PICKAXE);
            addInSub(event, WEAPONS, () -> Items.WOODEN_AXE);
            addInSub(event, WEAPONS, () -> Items.WOODEN_SHOVEL);
            addInSub(event, WEAPONS, () -> Items.WOODEN_HOE);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_SCYTHE);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_BATTLE_KNIFE);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_RAPIER);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_KATANA);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_GREATSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_LONGSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_SPEAR);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_GLAIVE);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_TWINBLADE);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_HALBERD);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_FRYING_PAN);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_SPOON);
            addInSub(event, WEAPONS, ArmedFangsItems.WOODEN_FORK);

            addInSub(event, WEAPONS, () -> Items.STONE_SWORD);
            addInSub(event, WEAPONS, () -> Items.STONE_PICKAXE);
            addInSub(event, WEAPONS, () -> Items.STONE_AXE);
            addInSub(event, WEAPONS, () -> Items.STONE_SHOVEL);
            addInSub(event, WEAPONS, () -> Items.STONE_HOE);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_SCYTHE);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_BATTLE_KNIFE);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_RAPIER);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_KATANA);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_GREATSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_LONGSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_SPEAR);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_GLAIVE);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_TWINBLADE);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_HALBERD);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_FRYING_PAN);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_SPOON);
            addInSub(event, WEAPONS, ArmedFangsItems.STONE_FORK);

            addInSub(event, WEAPONS, () -> Items.IRON_SWORD);
            addInSub(event, WEAPONS, () -> Items.IRON_PICKAXE);
            addInSub(event, WEAPONS, () -> Items.IRON_AXE);
            addInSub(event, WEAPONS, () -> Items.IRON_SHOVEL);
            addInSub(event, WEAPONS, () -> Items.IRON_HOE);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_SCYTHE);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_BATTLE_KNIFE);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_RAPIER);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_KATANA);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_GREATSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_LONGSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_SPEAR);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_GLAIVE);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_TWINBLADE);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_HALBERD);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_FRYING_PAN);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_SPOON);
            addInSub(event, WEAPONS, ArmedFangsItems.IRON_FORK);

            addInSub(event, WEAPONS, () -> Items.GOLDEN_SWORD);
            addInSub(event, WEAPONS, () -> Items.GOLDEN_PICKAXE);
            addInSub(event, WEAPONS, () -> Items.GOLDEN_AXE);
            addInSub(event, WEAPONS, () -> Items.GOLDEN_SHOVEL);
            addInSub(event, WEAPONS, () -> Items.GOLDEN_HOE);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_SCYTHE);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_BATTLE_KNIFE);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_RAPIER);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_KATANA);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_GREATSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_LONGSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_SPEAR);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_GLAIVE);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_TWINBLADE);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_HALBERD);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_FRYING_PAN);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_SPOON);
            addInSub(event, WEAPONS, ArmedFangsItems.GOLDEN_FORK);

            addInSub(event, WEAPONS, () -> Items.DIAMOND_SWORD);
            addInSub(event, WEAPONS, () -> Items.DIAMOND_PICKAXE);
            addInSub(event, WEAPONS, () -> Items.DIAMOND_AXE);
            addInSub(event, WEAPONS, () -> Items.DIAMOND_SHOVEL);
            addInSub(event, WEAPONS, () -> Items.DIAMOND_HOE);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_SCYTHE);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_BATTLE_KNIFE);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_RAPIER);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_KATANA);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_GREATSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_LONGSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_SPEAR);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_GLAIVE);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_TWINBLADE);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_HALBERD);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_FRYING_PAN);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_SPOON);
            addInSub(event, WEAPONS, ArmedFangsItems.DIAMOND_FORK);

            addInSub(event, WEAPONS, () -> Items.NETHERITE_SWORD);
            addInSub(event, WEAPONS, () -> Items.NETHERITE_PICKAXE);
            addInSub(event, WEAPONS, () -> Items.NETHERITE_AXE);
            addInSub(event, WEAPONS, () -> Items.NETHERITE_SHOVEL);
            addInSub(event, WEAPONS, () -> Items.NETHERITE_HOE);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_SCYTHE);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_BATTLE_KNIFE);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_RAPIER);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_KATANA);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_GREATSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_LONGSWORD);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_SPEAR);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_GLAIVE);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_TWINBLADE);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_HALBERD);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_FRYING_PAN);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_SPOON);
            addInSub(event, WEAPONS, ArmedFangsItems.NETHERITE_FORK);
        }
    }

    public static void addInSub(BuildCreativeModeTabContentsEvent event, SubCreativeTab subTab, Supplier<? extends ItemLike> item) {
        event.accept(item);
        subTab.addDisplayItem(item.get());
    }

    public static void addInSub(BuildCreativeModeTabContentsEvent event, SubCreativeTab subTab, ItemStack item) {
        event.accept(item);
        subTab.addDisplayItem(item);
    }

    public static void addInSub(BuildCreativeModeTabContentsEvent event, SubCreativeTab subTab, Collection<ItemStack> items) {
        event.acceptAll(items);
        subTab.addDisplayItems(items);
    }
}
