package codes.wasabi.xplug.struct.world;
/*
  XPlug | A  LUA platform for Spigot
  Copyright 2022 Wasabi Codes

  This Source Code Form is subject to the terms of the Mozilla Public
  License, v. 2.0. If a copy of the MPL was not distributed with this
  file, You can obtain one at http://mozilla.org/MPL/2.0/.
*/

import codes.wasabi.xplug.struct.LuaValueHolder;
import codes.wasabi.xplug.struct.entity.LuaEntity;
import codes.wasabi.xplug.util.func.GetterFunction;
import codes.wasabi.xplug.util.func.OneArgMetaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

import java.util.Collection;

public interface LuaChunk extends LuaValueHolder {

    /**
     * Returns the world that this chunk is in
     * @return A world
     */
     LuaWorld getWorld();

    /**
     * Gets the X coordinate of this chunk
     * @return The X coordinate
     */
     int getX();

    /**
     * Gets the Z coordinate of this chunk
     * @return The Z coordinate
     */
     int getZ();

     Collection<LuaEntity> getEntities();

     boolean isLoaded();

     boolean isForceLoaded();

     boolean canSetForceLoaded();

     void setForceLoaded(boolean forceLoaded);

    @Override
    default LuaValue getLuaValue() {
        LuaTable lt = new LuaTable();
        lt.set("GetWorld", new GetterFunction(this::getWorld));
        lt.set("GetX", new GetterFunction(this::getX));
        lt.set("GetZ", new GetterFunction(this::getZ));
        lt.set("GetEntities", new GetterFunction(this::getEntities));
        lt.set("IsLoaded", new GetterFunction(this::isLoaded));
        lt.set("IsForceLoaded", new GetterFunction(this::isForceLoaded));
        lt.set("CanSetForceLoaded", new GetterFunction(this::canSetForceLoaded));
        lt.set("SetForceLoaded", new OneArgMetaFunction() {
            @Override
            protected LuaValue call(LuaTable self, LuaValue arg) {
                setForceLoaded(arg.toboolean());
                return LuaValue.NIL;
            }
        });
        return lt;
    }

}
