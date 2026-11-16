/*
 * Copyright (C) 2026 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package android.os;

/**
 * Stub of the ColorOS/OPlus performance extension loaded reflectively by
 * com.oplus.camera (com.oplus.camera.performance.statistics.Performance).
 *
 * Only the methods used by the camera app are present, and they return
 * neutral values. This silences the reflection failures; it does not
 * implement OPlus performance monitoring.
 */
public class PerformanceManager {
    private PerformanceManager() {
    }

    public static String getHICpuLoading() {
        return "0";
    }

    public static String readJankCpuInfo() {
        return "";
    }
}
