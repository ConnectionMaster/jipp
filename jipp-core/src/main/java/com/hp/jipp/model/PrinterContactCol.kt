// Copyright 2020 - 2025 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2025-05-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "printer-contact-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem11-20250328-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrinterContactCol
constructor(
    var contactName: String? = null,
    var contactUri: java.net.URI? = null,
    var contactVcard: List<String>? = null,
) : AttributeCollection {

    /** Construct an empty [PrinterContactCol]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            contactName?.let { PrinterContactCol.contactName.of(it) },
            contactUri?.let { PrinterContactCol.contactUri.of(it) },
            contactVcard?.let { PrinterContactCol.contactVcard.of(it.map { v -> Text(v) }) },
        )

    /** Defines types for each member of [PrinterContactCol]. */
    companion object : AttributeCollection.Converter<PrinterContactCol> {
        override fun convert(attributes: List<Attribute<*>>): PrinterContactCol =
            PrinterContactCol(
                extractOne(attributes, contactName)?.value,
                extractOne(attributes, contactUri),
                extractAll(attributes, contactVcard)?.map { it.value },
            )
        override val cls = PrinterContactCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val contactName = NameType("contact-name")
        @JvmField val contactUri = UriType("contact-uri")
        @JvmField val contactVcard = TextType.Set("contact-vcard")
    }
    override fun toString() = "PrinterContactCol(${attributes.joinToString()})"
}
