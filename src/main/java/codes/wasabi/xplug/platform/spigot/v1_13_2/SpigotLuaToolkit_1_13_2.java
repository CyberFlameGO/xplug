package codes.wasabi.xplug.platform.spigot.v1_13_2;
/*
  XPlug | A  LUA platform for Spigot
  Copyright 2022 Wasabi Codes

  This Source Code Form is subject to the terms of the Mozilla Public
  License, v. 2.0. If a copy of the MPL was not distributed with this
  file, You can obtain one at http://mozilla.org/MPL/2.0/.
*/

import codes.wasabi.xplug.platform.spigot.base.SpigotLuaToolkit;

public class SpigotLuaToolkit_1_13_2 extends SpigotLuaToolkit {

    private final SpigotLuaTypeAdapter_1_13_2 typeAdapter = new SpigotLuaTypeAdapter_1_13_2();
    @Override
    public SpigotLuaTypeAdapter_1_13_2 getTypeAdapter() {
        return typeAdapter;
    }

}
