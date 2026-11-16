/*
 * Copyright (C) 2026 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package android.hardware.display;

/**
 * Stub of the ColorOS/OPlus display extension loaded reflectively by
 * com.oplus.camera (ScreenBrightnessController).
 *
 * The AOSP/LineageOS display stack has no environment-nit API, so this is a
 * no-op that only prevents a ClassNotFoundException warning. It does not
 * restore the max-nit boost feature.
 */
public class OplusDisplayManager {
    private static final OplusDisplayManager INSTANCE = new OplusDisplayManager();

    private OplusDisplayManager() {
    }

    public static OplusDisplayManager getInstance() {
        return INSTANCE;
    }

    public void setSpecEnvironmentNit(int type, int nit, int mode) {
        // No-op: not supported by the AOSP display stack.
    }
}
