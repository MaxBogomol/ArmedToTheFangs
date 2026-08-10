package mod.maxbogomol.armed_to_the_fangs;

import mod.maxbogomol.armed_to_the_fangs.registry.common.item.ArmedFangsCreativeTabs;
import mod.maxbogomol.armed_to_the_fangs.registry.common.item.ArmedFangsItems;
import mod.maxbogomol.fluffy_fur.FluffyFurClient;
import mod.maxbogomol.fluffy_fur.client.gui.screen.FluffyFurMod;
import mod.maxbogomol.fluffy_fur.client.language.LanguageHandler;
import mod.maxbogomol.fluffy_fur.client.splash.SplashHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class ArmedFangsClient {
    public static Random random = new Random();

    public static class ClientOnly {
        public static void clientInit() {
            IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
            IEventBus forgeBus = MinecraftForge.EVENT_BUS;

            eventBus.addListener(ArmedFangsCreativeTabs::addCreativeTabContent);
        }
    }

    public static void clientSetup(final FMLClientSetupEvent event) {
        setupMenu();
        setupSplashes();
    }

    public static FluffyFurMod MOD_INSTANCE;

    public static void setupMenu() {
        MOD_INSTANCE = new FluffyFurMod(ArmedFangs.MOD_ID, ArmedFangs.NAME, ArmedFangs.VERSION).setDev("MaxBogomol").setItem(new ItemStack(ArmedFangsItems.GOLDEN_GREATSWORD.get()))
                .setEdition(ArmedFangs.VERSION_NUMBER).setNameColor(new Color(255, 0, 0)).setVersionColor(new Color(0, 255, 0))
                .setDescription(Component.translatable("mod_description.armed_to_the_fangs"))
                .addFluffyVillageLink("https://fluffy-village.dev/pages/eng/creations/armed_to_the_fangs.html")
                .addGitHubLink("https://github.com/MaxBogomol/ArmedToTheFangs")
                .addCurseForgeLink("https://www.curseforge.com/minecraft/mc-mods/armed-to-the-fangs")
                .addModrinthLink("https://modrinth.com/mod/armed_to_the_fangs")
                .addDiscordLink("https://discord.fluffy-village.dev/");

        FluffyFurClient.registerMod(MOD_INSTANCE);
    }

    public static void setupSplashes() {
        List<String> strings = LanguageHandler.getStringsFromFile(new ResourceLocation(ArmedFangs.MOD_ID, "texts/splashes.txt"));
        for (String string : strings) {
            SplashHandler.addSplash(string);
        }
    }
}
