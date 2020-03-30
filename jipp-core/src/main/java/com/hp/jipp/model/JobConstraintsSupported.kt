// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-constraints-supported" collection as defined in:
 * [PWG5100.13](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobConstraintsSupported
constructor(
    var resolverName: String? = null
) : AttributeCollection {

    /** Construct an empty [JobConstraintsSupported]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            resolverName?.let { Types.resolverName.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val resolverName = NameType("resolver-name")
    }

    /** Defines types for each member of [JobConstraintsSupported] */
    companion object : AttributeCollection.Converter<JobConstraintsSupported> {
        override fun convert(attributes: List<Attribute<*>>): JobConstraintsSupported =
            JobConstraintsSupported(
                extractOne(attributes, Types.resolverName)?.value
            )
    }
    override fun toString() = "JobConstraintsSupported(${attributes.joinToString()})"
}
