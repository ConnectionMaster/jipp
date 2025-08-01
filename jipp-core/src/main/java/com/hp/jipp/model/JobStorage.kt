// Copyright 2025 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2025-05-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-storage" collection as defined in:
 * [PWG5100.11](https://ftp.pwg.org/pub/pwg/candidates/cs-ippepx20-20240315-5100.11.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobStorage
constructor(
    /** May contain any keyword from [JobStorageAccessSupported]. */
    var jobStorageAccess: String? = null,
    /** May contain any keyword from [JobStorageDispositionSupported]. */
    var jobStorageDisposition: String? = null,
    var jobStorageGroup: String? = null,
) : AttributeCollection {

    /** Construct an empty [JobStorage]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            jobStorageAccess?.let { JobStorage.jobStorageAccess.of(it) },
            jobStorageDisposition?.let { JobStorage.jobStorageDisposition.of(it) },
            jobStorageGroup?.let { JobStorage.jobStorageGroup.of(it) },
        )

    /** Defines types for each member of [JobStorage]. */
    companion object : AttributeCollection.Converter<JobStorage> {
        override fun convert(attributes: List<Attribute<*>>): JobStorage =
            JobStorage(
                extractOne(attributes, jobStorageAccess),
                extractOne(attributes, jobStorageDisposition),
                extractOne(attributes, jobStorageGroup)?.value,
            )
        override val cls = JobStorage::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val jobStorageAccess = KeywordType("job-storage-access")
        @JvmField val jobStorageDisposition = KeywordType("job-storage-disposition")
        @JvmField val jobStorageGroup = NameType("job-storage-group")
    }
    override fun toString() = "JobStorage(${attributes.joinToString()})"
}
