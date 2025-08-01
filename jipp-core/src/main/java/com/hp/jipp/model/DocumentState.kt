// Copyright 2018 - 2025 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2025-05-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "document-state" enum as defined in:
 * [PWG5100.5](https://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject12-20240517-5100.5.pdf).
 */
data class DocumentState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [DocumentState] attribute. */
    class Type(name: String) : EnumType<DocumentState>(name, { get(it) })

    /** An [AttributeType] for multiple [DocumentState] attributes. */
    class SetType(name: String) : EnumType.Set<DocumentState>(name, { get(it) })

    object Code {
        const val pending = 3
        const val processing = 5
        const val processingStopped = 6
        const val canceled = 7
        const val aborted = 8
        const val completed = 9
    }

    companion object {
        @JvmField val pending = DocumentState(Code.pending, "pending")
        @JvmField val processing = DocumentState(Code.processing, "processing")
        @JvmField val processingStopped = DocumentState(Code.processingStopped, "processing-stopped")
        @JvmField val canceled = DocumentState(Code.canceled, "canceled")
        @JvmField val aborted = DocumentState(Code.aborted, "aborted")
        @JvmField val completed = DocumentState(Code.completed, "completed")

        @JvmField val all = listOf(
            pending,
            processing,
            processingStopped,
            canceled,
            aborted,
            completed,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): DocumentState =
            all[value] ?: DocumentState(value, "???")
    }
}
