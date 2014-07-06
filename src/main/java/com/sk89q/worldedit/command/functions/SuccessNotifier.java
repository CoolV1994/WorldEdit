/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.command.functions;

import com.sk89q.worldedit.entity.Player;
import com.sk89q.worldedit.function.operation.OperationFuture;
import com.sk89q.worldedit.function.util.WEConsumer;

/**
 * Prints a string to a player when an operation finishes.
 */
public class SuccessNotifier implements WEConsumer<OperationFuture> {
    private final Player player;
    private final String message;

    public SuccessNotifier(Player player, String message) {
        this.player = player;
        this.message = message;
    }

    @Override
    public void accept(OperationFuture operationFuture) {
        player.print(message);
    }
}
