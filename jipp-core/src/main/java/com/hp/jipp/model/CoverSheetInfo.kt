// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "cover-sheet-info" collection as defined in:
 * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class CoverSheetInfo
@JvmOverloads constructor(
    var fromName: String? = null,
    var logo: java.net.URI? = null,
    var message: String? = null,
    var organizationName: String? = null,
    var subject: String? = null,
    var toName: String? = null
) : AttributeCollection {

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            fromName?.let { Types.fromName.of(it) },
            logo?.let { Types.logo.of(it) },
            message?.let { Types.message.of(it) },
            organizationName?.let { Types.organizationName.of(it) },
            subject?.let { Types.subject.of(it) },
            toName?.let { Types.toName.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<CoverSheetInfo>(CoverSheetInfo)

    /** All member names as strings. */
    object Name {
        /** "from-name" member name */
        const val fromName = "from-name"
        /** "logo" member name */
        const val logo = "logo"
        /** "message" member name */
        const val message = "message"
        /** "organization-name" member name */
        const val organizationName = "organization-name"
        /** "subject" member name */
        const val subject = "subject"
        /** "to-name" member name */
        const val toName = "to-name"
    }

    /** Types for each member attribute. */
    object Types {
        val fromName = TextType(Name.fromName)
        val logo = UriType(Name.logo)
        val message = TextType(Name.message)
        val organizationName = TextType(Name.organizationName)
        val subject = TextType(Name.subject)
        val toName = TextType(Name.toName)
    }

    /** Defines types for each member of [CoverSheetInfo] */
    companion object : AttributeCollection.Converter<CoverSheetInfo> {
        override fun convert(attributes: List<Attribute<*>>): CoverSheetInfo =
            CoverSheetInfo(
                extractOne(attributes, Types.fromName)?.value,
                extractOne(attributes, Types.logo),
                extractOne(attributes, Types.message)?.value,
                extractOne(attributes, Types.organizationName)?.value,
                extractOne(attributes, Types.subject)?.value,
                extractOne(attributes, Types.toName)?.value
            )
    }
}