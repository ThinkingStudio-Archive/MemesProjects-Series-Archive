
package net.texstudio.memesprojectdisc.item;

import net.minecraft.util.Rarity;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.item.MusicDiscItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class GoyangUburUburRemixedMusicDisc extends MusicDiscItem {
	public GoyangUburUburRemixedMusicDisc() {
			super(0, new SoundEvent(new Identifier("memesprojectdisc:goyang_ubur_ubur_remixed"),
                    new FabricItemSettings().group(MPDItemGroup.get()).maxCount(1).rarity(Rarity.RARE));
    }
}
