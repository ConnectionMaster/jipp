// Copyright 2018 - 2024 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-sheets-col" collection as defined in:
 * [PWG5100.7](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext21-20230210-5100.7.pdf),
 * [XEROX20150505](https://ftp.pwg.org/pub/pwg/ipp/registrations/xerox-counters-20150505.txt).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MediaSheetsCol
constructor(
    var blank: Int? = null,
    var fullColor: Int? = null,
    var highlightColor: Int? = null,
    var monochrome: Int? = null,
) : AttributeCollection {

    /** Construct an empty [MediaSheetsCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            blank?.let { MediaSheetsCol.blank.of(it) },
            fullColor?.let { MediaSheetsCol.fullColor.of(it) },
            highlightColor?.let { MediaSheetsCol.highlightColor.of(it) },
            monochrome?.let { MediaSheetsCol.monochrome.of(it) },
        )

    /** Defines types for each member of [MediaSheetsCol]. */
    companion object : AttributeCollection.Converter<MediaSheetsCol> {
        override fun convert(attributes: List<Attribute<*>>): MediaSheetsCol =
            MediaSheetsCol(
                extractOne(attributes, blank),
                extractOne(attributes, fullColor),
                extractOne(attributes, highlightColor),
                extractOne(attributes, monochrome),
            )
        override val cls = MediaSheetsCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val blank = IntType("blank")
        @JvmField val fullColor = IntType("full-color")
        @JvmField val highlightColor = IntType("highlight-color")
        @JvmField val monochrome = IntType("monochrome")
    }
    override fun toString() = "MediaSheetsCol(${attributes.joinToString()})"
}
