// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "printer-volume-supported" collection as defined in:
 * [PWG5100.21](https://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d11-20190329-5100.21.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrinterVolumeSupported
constructor(
    var xDimension: Int? = null,
    var yDimension: Int? = null,
    var zDimension: Int? = null
) : AttributeCollection {

    /** Construct an empty [PrinterVolumeSupported]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            xDimension?.let { Types.xDimension.of(it) },
            yDimension?.let { Types.yDimension.of(it) },
            zDimension?.let { Types.zDimension.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val xDimension = IntType("x-dimension")
        @JvmField val yDimension = IntType("y-dimension")
        @JvmField val zDimension = IntType("z-dimension")
    }

    /** Defines types for each member of [PrinterVolumeSupported] */
    companion object : AttributeCollection.Converter<PrinterVolumeSupported> {
        override fun convert(attributes: List<Attribute<*>>): PrinterVolumeSupported =
            PrinterVolumeSupported(
                extractOne(attributes, Types.xDimension),
                extractOne(attributes, Types.yDimension),
                extractOne(attributes, Types.zDimension)
            )
    }
    override fun toString() = "PrinterVolumeSupported(${attributes.joinToString()})"
}
