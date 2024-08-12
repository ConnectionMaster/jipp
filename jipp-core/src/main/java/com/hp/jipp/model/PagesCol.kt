// Copyright 2018 - 2024 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2024-06-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "pages-col" collection as defined in:
 * [PWG5100.7](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext21-20230210-5100.7.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PagesCol
constructor(
    var fullColor: Int? = null,
    var monochrome: Int? = null,
) : AttributeCollection {

    /** Construct an empty [PagesCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            fullColor?.let { PagesCol.fullColor.of(it) },
            monochrome?.let { PagesCol.monochrome.of(it) },
        )

    /** Defines types for each member of [PagesCol]. */
    companion object : AttributeCollection.Converter<PagesCol> {
        override fun convert(attributes: List<Attribute<*>>): PagesCol =
            PagesCol(
                extractOne(attributes, fullColor),
                extractOne(attributes, monochrome),
            )
        override val cls = PagesCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val fullColor = IntType("full-color")
        @JvmField val monochrome = IntType("monochrome")
    }
    override fun toString() = "PagesCol(${attributes.joinToString()})"
}
