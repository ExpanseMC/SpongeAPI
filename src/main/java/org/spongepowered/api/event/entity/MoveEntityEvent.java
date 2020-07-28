/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.event.entity;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.Cancellable;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.util.annotation.eventgen.AbsoluteSortPosition;
import org.spongepowered.api.util.annotation.eventgen.GenerateFactoryMethod;
import org.spongepowered.api.world.server.ServerWorld;
import org.spongepowered.math.vector.Vector3d;

/**
 * Called when an {@link Entity} performs movement.
 */
public interface MoveEntityEvent extends Event, Cancellable {

    /**
     * Gets the {@link Entity}.
     *
     * @return The entity
     */
    @AbsoluteSortPosition(1)
    Entity getEntity();

    /**
     * Gets the {@link Vector3d position} {@link Entity} came from.
     *
     * @return the previous position
     */
    @AbsoluteSortPosition(5)
    Vector3d getFromPosition();

    /**
     * Gets the new {@link Vector3d position} that the {@link Entity} will move to.
     *
     * @return the new position
     */
    @AbsoluteSortPosition(6)
    Vector3d getToPosition();

    /**
     * Sets the new {@link Vector3d position} that the {@link Entity} will change to.
     *
     * @param position The new position
     */
    void setToPosition(Vector3d position);

    /**
     * Fired when an {@link Entity}'s position changes.
     */
    @GenerateFactoryMethod
    interface Position extends MoveEntityEvent {

    }

    /**
     * Fired when an {@link Entity entity's} position goes across {@link ServerWorld worlds}.
     */
    @GenerateFactoryMethod
    interface Teleport extends MoveEntityEvent, ChangeEntityWorldEvent {
    }
}
