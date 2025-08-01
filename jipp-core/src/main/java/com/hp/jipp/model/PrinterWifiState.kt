// Copyright 2025 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2025-05-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "printer-wifi-state" enum as defined in:
 * [IPPWIFI](https://ftp.pwg.org/pub/pwg/ipp/registrations/reg-ippwifi10-20240912.pdf).
 */
data class PrinterWifiState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [PrinterWifiState] attribute. */
    class Type(name: String) : EnumType<PrinterWifiState>(name, { get(it) })

    /** An [AttributeType] for multiple [PrinterWifiState] attributes. */
    class SetType(name: String) : EnumType.Set<PrinterWifiState>(name, { get(it) })

    object Code {
        const val off = 3
        const val notConfigured = 4
        const val notVisible = 5
        const val cannotJoin = 6
        const val joining = 7
        const val on = 8
    }

    companion object {
        @JvmField val off = PrinterWifiState(Code.off, "off")
        @JvmField val notConfigured = PrinterWifiState(Code.notConfigured, "not-configured")
        @JvmField val notVisible = PrinterWifiState(Code.notVisible, "not-visible")
        @JvmField val cannotJoin = PrinterWifiState(Code.cannotJoin, "cannot-join")
        @JvmField val joining = PrinterWifiState(Code.joining, "joining")
        @JvmField val on = PrinterWifiState(Code.on, "on")

        @JvmField val all = listOf(
            off,
            notConfigured,
            notVisible,
            cannotJoin,
            joining,
            on,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): PrinterWifiState =
            all[value] ?: PrinterWifiState(value, "???")
    }
}
