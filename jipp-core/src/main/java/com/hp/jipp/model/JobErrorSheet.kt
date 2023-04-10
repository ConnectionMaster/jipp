// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2023-03-07
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-error-sheet" collection as defined in:
 * [PWG5100.3](https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf),
 * [PWG5100.3-2023](https://ftp.pwg.org/pub/pwg/candidates/cs-ippppx20-20230131-5100.3.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobErrorSheet
constructor(
    /** May contain any keyword from [JobErrorSheetType] or a name. */
    var jobErrorSheetType: KeywordOrName? = null,
    /** May contain any keyword from [JobErrorSheetWhen]. */
    var jobErrorSheetWhen: String? = null,
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null,
) : AttributeCollection {

    /** Construct an empty [JobErrorSheet]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            jobErrorSheetType?.let { JobErrorSheet.jobErrorSheetType.of(it) },
            jobErrorSheetWhen?.let { JobErrorSheet.jobErrorSheetWhen.of(it) },
            media?.let { JobErrorSheet.media.of(it) },
            mediaCol?.let { JobErrorSheet.mediaCol.of(it) },
        )

    /** Defines types for each member of [JobErrorSheet]. */
    companion object : AttributeCollection.Converter<JobErrorSheet> {
        override fun convert(attributes: List<Attribute<*>>): JobErrorSheet =
            JobErrorSheet(
                extractOne(attributes, jobErrorSheetType),
                extractOne(attributes, jobErrorSheetWhen),
                extractOne(attributes, media),
                extractOne(attributes, mediaCol),
            )
        override val cls = JobErrorSheet::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val jobErrorSheetType = KeywordOrNameType("job-error-sheet-type")
        @JvmField val jobErrorSheetWhen = KeywordType("job-error-sheet-when")
        @JvmField val media = KeywordOrNameType("media")
        @JvmField val mediaCol = AttributeCollection.Type("media-col", MediaCol)
    }
    override fun toString() = "JobErrorSheet(${attributes.joinToString()})"
}
