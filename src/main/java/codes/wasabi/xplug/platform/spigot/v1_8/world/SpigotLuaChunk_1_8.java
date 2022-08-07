package codes.wasabi.xplug.platform.spigot.v1_8.world;
/*
  XPlug | A  LUA platform for Spigot
  Copyright 2022 Wasabi Codes

  This Source Code Form is subject to the terms of the Mozilla Public
  License, v. 2.0. If a copy of the MPL was not distributed with this
  file, You can obtain one at http://mozilla.org/MPL/2.0/.
*/

import codes.wasabi.xplug.platform.spigot.base.world.SpigotLuaChunk;
import org.bukkit.Chunk;

public class SpigotLuaChunk_1_8 extends SpigotLuaChunk {

    public SpigotLuaChunk_1_8(Chunk chunk) {
        super(chunk);
    }

    @Override
    public boolean isForceLoaded() {
        return false;
    }

    @Override
    public boolean canSetForceLoaded() {
        return false;
    }

    @Override
    public void setForceLoaded(boolean forceLoaded) {
    }

}
