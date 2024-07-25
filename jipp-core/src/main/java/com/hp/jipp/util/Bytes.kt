// Copyright 2017 - 2021 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.util

import kotlin.math.min

// Used to convert bytes to hex
private val hexChars = "0123456789abcdef".toCharArray()
private const val BITS_IN_NYBBLE = 4
private const val NYBBLE_MASK = 0x0f

/** Return a byte in hex form */
fun Byte.toHexString(): String {
    val i = toInt()
    val char1 = hexChars[i shr BITS_IN_NYBBLE and NYBBLE_MASK]
    val char2 = hexChars[i and NYBBLE_MASK]
    return "$char1$char2"
}

/** Return a byte array in hex form */
fun ByteArray.toHexString(): String = joinToString(separator = "") { it.toHexString() }

@JvmOverloads
@Suppress("MagicNumber")
fun ByteArray.toWrappedHexString(chunk: Int = 32) =
    (0..(size / chunk)).joinToString("\n") { at ->
        copyOfRange(at * chunk, min(size, (at + 1) * chunk)).let { bytes ->
            bytes.toHexString() + " " + bytes.map {
                if (it in 32..127) it.toInt().toChar() else '.'
            }.joinToString("")
        }
    }
