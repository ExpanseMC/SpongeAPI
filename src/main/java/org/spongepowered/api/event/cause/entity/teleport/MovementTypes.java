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
package org.spongepowered.api.event.cause.entity.teleport;

import org.spongepowered.api.Sponge;

import java.util.function.Supplier;

public final class MovementTypes {

    // SORTFIELDS:ON

    public static final Supplier<MovementType> COMMAND = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "COMMAND");

    public static final Supplier<MovementType> END_GATEWAY = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "END_GATEWAY");

    public static final Supplier<MovementType> ENDER_PEARL = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "ENDER_PEARL");

    public static final Supplier<MovementType> ENTITY_TELEPORT = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "ENTITY_TELEPORT");

    public static final Supplier<MovementType> NATURAL = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "NATURAL");

    public static final Supplier<MovementType> PLUGIN = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "PLUGIN");

    public static final Supplier<MovementType> PORTAL = Sponge.getRegistry().getCatalogRegistry().provideSupplier(MovementType.class, "PORTAL");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private MovementTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
