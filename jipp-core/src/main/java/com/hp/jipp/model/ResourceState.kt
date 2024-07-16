// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "resource-state" enum as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
data class ResourceState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [ResourceState] attribute. */
    class Type(name: String) : EnumType<ResourceState>(name, { get(it) })

    /** An [AttributeType] for multiple [ResourceState] attributes. */
    class SetType(name: String) : EnumType.Set<ResourceState>(name, { get(it) })

    object Code {
        const val pending = 3
        const val available = 4
        const val installed = 5
        const val canceled = 6
        const val aborted = 7
    }

    companion object {
        @JvmField val pending = ResourceState(Code.pending, "pending")
        @JvmField val available = ResourceState(Code.available, "available")
        @JvmField val installed = ResourceState(Code.installed, "installed")
        @JvmField val canceled = ResourceState(Code.canceled, "canceled")
        @JvmField val aborted = ResourceState(Code.aborted, "aborted")

        @JvmField val all = listOf(
            pending,
            available,
            installed,
            canceled,
            aborted,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): ResourceState =
            all[value] ?: ResourceState(value, "???")
    }
}
