// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2023-03-07
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "print-objects" collection as defined in:
 * [PWG5100.21](https://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d11-20190329-5100.21.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrintObjects
constructor(
    var documentNumber: Int? = null,
    var objectOffset: ObjectOffset? = null,
    var objectSize: ObjectSize? = null,
    var objectUuid: java.net.URI? = null,
) : AttributeCollection {

    /** Construct an empty [PrintObjects]. */
    constructor() : this(null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            documentNumber?.let { PrintObjects.documentNumber.of(it) },
            objectOffset?.let { PrintObjects.objectOffset.of(it) },
            objectSize?.let { PrintObjects.objectSize.of(it) },
            objectUuid?.let { PrintObjects.objectUuid.of(it) },
        )

    /** Defines types for each member of [PrintObjects]. */
    companion object : AttributeCollection.Converter<PrintObjects> {
        override fun convert(attributes: List<Attribute<*>>): PrintObjects =
            PrintObjects(
                extractOne(attributes, documentNumber),
                extractOne(attributes, objectOffset),
                extractOne(attributes, objectSize),
                extractOne(attributes, objectUuid),
            )
        override val cls = PrintObjects::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val documentNumber = IntType("document-number")
        @JvmField val objectOffset = AttributeCollection.Type("object-offset", ObjectOffset)
        @JvmField val objectSize = AttributeCollection.Type("object-size", ObjectSize)
        @JvmField val objectUuid = UriType("object-uuid")
    }

    /**
     * Data object corresponding to a "object-offset" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class ObjectOffset
    constructor(
        var xOffset: Int? = null,
        var yOffset: Int? = null,
        var zOffset: Int? = null,
    ) : AttributeCollection {

        /** Construct an empty [ObjectOffset]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                xOffset?.let { ObjectOffset.xOffset.of(it) },
                yOffset?.let { ObjectOffset.yOffset.of(it) },
                zOffset?.let { ObjectOffset.zOffset.of(it) },
            )

        /** Defines types for each member of [ObjectOffset]. */
        companion object : AttributeCollection.Converter<ObjectOffset> {
            override fun convert(attributes: List<Attribute<*>>): ObjectOffset =
                ObjectOffset(
                    extractOne(attributes, xOffset),
                    extractOne(attributes, yOffset),
                    extractOne(attributes, zOffset),
                )
            override val cls = ObjectOffset::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val xOffset = IntType("x-offset")
            @JvmField val yOffset = IntType("y-offset")
            @JvmField val zOffset = IntType("z-offset")
        }
        override fun toString() = "ObjectOffset(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "object-size" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class ObjectSize
    constructor(
        var xDimension: Int? = null,
        var yDimension: Int? = null,
        var zDimension: Int? = null,
    ) : AttributeCollection {

        /** Construct an empty [ObjectSize]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>>
            get() = listOfNotNull(
                xDimension?.let { ObjectSize.xDimension.of(it) },
                yDimension?.let { ObjectSize.yDimension.of(it) },
                zDimension?.let { ObjectSize.zDimension.of(it) },
            )

        /** Defines types for each member of [ObjectSize]. */
        companion object : AttributeCollection.Converter<ObjectSize> {
            override fun convert(attributes: List<Attribute<*>>): ObjectSize =
                ObjectSize(
                    extractOne(attributes, xDimension),
                    extractOne(attributes, yDimension),
                    extractOne(attributes, zDimension),
                )
            override val cls = ObjectSize::class.java
            @Deprecated("Remove this symbol")
            @JvmField val Types = this
            @JvmField val xDimension = IntType("x-dimension")
            @JvmField val yDimension = IntType("y-dimension")
            @JvmField val zDimension = IntType("z-dimension")
        }
        override fun toString() = "ObjectSize(${attributes.joinToString()})"
    }
    override fun toString() = "PrintObjects(${attributes.joinToString()})"
}
