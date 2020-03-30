// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-pages-col" collection as defined in:
 * [APRIL2015F2F](https://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobPagesCol
constructor(
    var fullColor: Int? = null,
    var monochrome: Int? = null
) : AttributeCollection {

    /** Construct an empty [JobPagesCol]. */
    constructor() : this(null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            fullColor?.let { Types.fullColor.of(it) },
            monochrome?.let { Types.monochrome.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val fullColor = IntType("full-color")
        @JvmField val monochrome = IntType("monochrome")
    }

    /** Defines types for each member of [JobPagesCol] */
    companion object : AttributeCollection.Converter<JobPagesCol> {
        override fun convert(attributes: List<Attribute<*>>): JobPagesCol =
            JobPagesCol(
                extractOne(attributes, Types.fullColor),
                extractOne(attributes, Types.monochrome)
            )
    }
    override fun toString() = "JobPagesCol(${attributes.joinToString()})"
}
