// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "power-state-monitor-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PowerStateMonitorCol
constructor(
    var currentMonthKwh: Int? = null,
    var currentWatts: Int? = null,
    var lifetimeKwh: Int? = null,
    var metersAreActual: Boolean? = null,
    var powerState: String? = null,
    var powerStateMessage: String? = null,
    var powerUsageIsRmsWatts: Boolean? = null
) : AttributeCollection {

    /** Construct an empty [PowerStateMonitorCol]. */
    constructor() : this(null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            currentMonthKwh?.let { Types.currentMonthKwh.of(it) },
            currentWatts?.let { Types.currentWatts.of(it) },
            lifetimeKwh?.let { Types.lifetimeKwh.of(it) },
            metersAreActual?.let { Types.metersAreActual.of(it) },
            powerState?.let { Types.powerState.of(it) },
            powerStateMessage?.let { Types.powerStateMessage.of(it) },
            powerUsageIsRmsWatts?.let { Types.powerUsageIsRmsWatts.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val currentMonthKwh = IntType("current-month-kwh")
        @JvmField val currentWatts = IntType("current-watts")
        @JvmField val lifetimeKwh = IntType("lifetime-kwh")
        @JvmField val metersAreActual = BooleanType("meters-are-actual")
        @JvmField val powerState = KeywordType("power-state")
        @JvmField val powerStateMessage = TextType("power-state-message")
        @JvmField val powerUsageIsRmsWatts = BooleanType("power-usage-is-rms-watts")
    }

    /** Defines types for each member of [PowerStateMonitorCol] */
    companion object : AttributeCollection.Converter<PowerStateMonitorCol> {
        override fun convert(attributes: List<Attribute<*>>): PowerStateMonitorCol =
            PowerStateMonitorCol(
                extractOne(attributes, Types.currentMonthKwh),
                extractOne(attributes, Types.currentWatts),
                extractOne(attributes, Types.lifetimeKwh),
                extractOne(attributes, Types.metersAreActual),
                extractOne(attributes, Types.powerState),
                extractOne(attributes, Types.powerStateMessage)?.value,
                extractOne(attributes, Types.powerUsageIsRmsWatts)
            )
    }
    override fun toString() = "PowerStateMonitorCol(${attributes.joinToString()})"
}