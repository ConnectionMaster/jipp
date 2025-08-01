// Copyright 2018 - 2025 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2025-05-13
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "finishings" enum as defined in:
 * [CANON-PUNCHING](https://www.pwg.org/pipermail/ipp/2016/018825.html),
 * [IPP-JOG-OFFSET](https://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20170214.pdf),
 * [PWG5100.1](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf),
 * [PWG5100.1-2022](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings30-20220527-5100.1.pdf),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class Finishing(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [Finishing] attribute. */
    class Type(name: String) : EnumType<Finishing>(name, { get(it) })

    /** An [AttributeType] for multiple [Finishing] attributes. */
    class SetType(name: String) : EnumType.Set<Finishing>(name, { get(it) })

    object Code {
        const val none = 3
        const val staple = 4
        const val punch = 5
        const val cover = 6
        const val bind = 7
        const val saddleStitch = 8
        const val edgeStitch = 9
        const val fold = 10
        const val trim = 11
        const val bale = 12
        const val bookletMaker = 13
        const val jogOffset = 14
        const val coat = 15
        const val laminate = 16
        const val stapleTopLeft = 20
        const val stapleBottomLeft = 21
        const val stapleTopRight = 22
        const val stapleBottomRight = 23
        const val edgeStitchLeft = 24
        const val edgeStitchTop = 25
        const val edgeStitchRight = 26
        const val edgeStitchBottom = 27
        const val stapleDualLeft = 28
        const val stapleDualTop = 29
        const val stapleDualRight = 30
        const val stapleDualBottom = 31
        const val stapleTripleLeft = 32
        const val stapleTripleTop = 33
        const val stapleTripleRight = 34
        const val stapleTripleBottom = 35
        const val bindLeft = 50
        const val bindTop = 51
        const val bindRight = 52
        const val bindBottom = 53
        const val trimAfterPages = 60
        const val trimAfterDocuments = 61
        const val trimAfterCopies = 62
        const val trimAfterJob = 63
        const val punchTopLeft = 70
        const val punchBottomLeft = 71
        const val punchTopRight = 72
        const val punchBottomRight = 73
        const val punchDualLeft = 74
        const val punchDualTop = 75
        const val punchDualRight = 76
        const val punchDualBottom = 77
        const val punchTripleLeft = 78
        const val punchTripleTop = 79
        const val punchTripleRight = 80
        const val punchTripleBottom = 81
        const val punchQuadLeft = 82
        const val punchQuadTop = 83
        const val punchQuadRight = 84
        const val punchQuadBottom = 85
        const val punchMultipleLeft = 86
        const val punchMultipleTop = 87
        const val punchMultipleRight = 88
        const val punchMultipleBottom = 89
        const val foldAccordion = 90
        const val foldDoubleGate = 91
        const val foldGate = 92
        const val foldHalf = 93
        const val foldHalfZ = 94
        const val foldLeftGate = 95
        const val foldLetter = 96
        const val foldParallel = 97
        const val foldPoster = 98
        const val foldRightGate = 99
        const val foldZ = 100
        const val foldEngineeringZ = 101
    }

    companion object {
        @JvmField val none = Finishing(Code.none, "none")
        @JvmField val staple = Finishing(Code.staple, "staple")
        @JvmField val punch = Finishing(Code.punch, "punch")
        @JvmField val cover = Finishing(Code.cover, "cover")
        @JvmField val bind = Finishing(Code.bind, "bind")
        @JvmField val saddleStitch = Finishing(Code.saddleStitch, "saddle-stitch")
        @JvmField val edgeStitch = Finishing(Code.edgeStitch, "edge-stitch")
        @JvmField val fold = Finishing(Code.fold, "fold")
        @JvmField val trim = Finishing(Code.trim, "trim")
        @JvmField val bale = Finishing(Code.bale, "bale")
        @JvmField val bookletMaker = Finishing(Code.bookletMaker, "booklet-maker")
        @JvmField val jogOffset = Finishing(Code.jogOffset, "jog-offset")
        @JvmField val coat = Finishing(Code.coat, "coat")
        @JvmField val laminate = Finishing(Code.laminate, "laminate")
        @JvmField val stapleTopLeft = Finishing(Code.stapleTopLeft, "staple-top-left")
        @JvmField val stapleBottomLeft = Finishing(Code.stapleBottomLeft, "staple-bottom-left")
        @JvmField val stapleTopRight = Finishing(Code.stapleTopRight, "staple-top-right")
        @JvmField val stapleBottomRight = Finishing(Code.stapleBottomRight, "staple-bottom-right")
        @JvmField val edgeStitchLeft = Finishing(Code.edgeStitchLeft, "edge-stitch-left")
        @JvmField val edgeStitchTop = Finishing(Code.edgeStitchTop, "edge-stitch-top")
        @JvmField val edgeStitchRight = Finishing(Code.edgeStitchRight, "edge-stitch-right")
        @JvmField val edgeStitchBottom = Finishing(Code.edgeStitchBottom, "edge-stitch-bottom")
        @JvmField val stapleDualLeft = Finishing(Code.stapleDualLeft, "staple-dual-left")
        @JvmField val stapleDualTop = Finishing(Code.stapleDualTop, "staple-dual-top")
        @JvmField val stapleDualRight = Finishing(Code.stapleDualRight, "staple-dual-right")
        @JvmField val stapleDualBottom = Finishing(Code.stapleDualBottom, "staple-dual-bottom")
        @JvmField val stapleTripleLeft = Finishing(Code.stapleTripleLeft, "staple-triple-left")
        @JvmField val stapleTripleTop = Finishing(Code.stapleTripleTop, "staple-triple-top")
        @JvmField val stapleTripleRight = Finishing(Code.stapleTripleRight, "staple-triple-right")
        @JvmField val stapleTripleBottom = Finishing(Code.stapleTripleBottom, "staple-triple-bottom")
        @JvmField val bindLeft = Finishing(Code.bindLeft, "bind-left")
        @JvmField val bindTop = Finishing(Code.bindTop, "bind-top")
        @JvmField val bindRight = Finishing(Code.bindRight, "bind-right")
        @JvmField val bindBottom = Finishing(Code.bindBottom, "bind-bottom")
        @JvmField val trimAfterPages = Finishing(Code.trimAfterPages, "trim-after-pages")
        @JvmField val trimAfterDocuments = Finishing(Code.trimAfterDocuments, "trim-after-documents")
        @JvmField val trimAfterCopies = Finishing(Code.trimAfterCopies, "trim-after-copies")
        @JvmField val trimAfterJob = Finishing(Code.trimAfterJob, "trim-after-job")
        @JvmField val punchTopLeft = Finishing(Code.punchTopLeft, "punch-top-left")
        @JvmField val punchBottomLeft = Finishing(Code.punchBottomLeft, "punch-bottom-left")
        @JvmField val punchTopRight = Finishing(Code.punchTopRight, "punch-top-right")
        @JvmField val punchBottomRight = Finishing(Code.punchBottomRight, "punch-bottom-right")
        @JvmField val punchDualLeft = Finishing(Code.punchDualLeft, "punch-dual-left")
        @JvmField val punchDualTop = Finishing(Code.punchDualTop, "punch-dual-top")
        @JvmField val punchDualRight = Finishing(Code.punchDualRight, "punch-dual-right")
        @JvmField val punchDualBottom = Finishing(Code.punchDualBottom, "punch-dual-bottom")
        @JvmField val punchTripleLeft = Finishing(Code.punchTripleLeft, "punch-triple-left")
        @JvmField val punchTripleTop = Finishing(Code.punchTripleTop, "punch-triple-top")
        @JvmField val punchTripleRight = Finishing(Code.punchTripleRight, "punch-triple-right")
        @JvmField val punchTripleBottom = Finishing(Code.punchTripleBottom, "punch-triple-bottom")
        @JvmField val punchQuadLeft = Finishing(Code.punchQuadLeft, "punch-quad-left")
        @JvmField val punchQuadTop = Finishing(Code.punchQuadTop, "punch-quad-top")
        @JvmField val punchQuadRight = Finishing(Code.punchQuadRight, "punch-quad-right")
        @JvmField val punchQuadBottom = Finishing(Code.punchQuadBottom, "punch-quad-bottom")
        @JvmField val punchMultipleLeft = Finishing(Code.punchMultipleLeft, "punch-multiple-left")
        @JvmField val punchMultipleTop = Finishing(Code.punchMultipleTop, "punch-multiple-top")
        @JvmField val punchMultipleRight = Finishing(Code.punchMultipleRight, "punch-multiple-right")
        @JvmField val punchMultipleBottom = Finishing(Code.punchMultipleBottom, "punch-multiple-bottom")
        @JvmField val foldAccordion = Finishing(Code.foldAccordion, "fold-accordion")
        @JvmField val foldDoubleGate = Finishing(Code.foldDoubleGate, "fold-double-gate")
        @JvmField val foldGate = Finishing(Code.foldGate, "fold-gate")
        @JvmField val foldHalf = Finishing(Code.foldHalf, "fold-half")
        @JvmField val foldHalfZ = Finishing(Code.foldHalfZ, "fold-half-z")
        @JvmField val foldLeftGate = Finishing(Code.foldLeftGate, "fold-left-gate")
        @JvmField val foldLetter = Finishing(Code.foldLetter, "fold-letter")
        @JvmField val foldParallel = Finishing(Code.foldParallel, "fold-parallel")
        @JvmField val foldPoster = Finishing(Code.foldPoster, "fold-poster")
        @JvmField val foldRightGate = Finishing(Code.foldRightGate, "fold-right-gate")
        @JvmField val foldZ = Finishing(Code.foldZ, "fold-z")
        @JvmField val foldEngineeringZ = Finishing(Code.foldEngineeringZ, "fold-engineering-z")

        @JvmField val all = listOf(
            none,
            staple,
            punch,
            cover,
            bind,
            saddleStitch,
            edgeStitch,
            fold,
            trim,
            bale,
            bookletMaker,
            jogOffset,
            coat,
            laminate,
            stapleTopLeft,
            stapleBottomLeft,
            stapleTopRight,
            stapleBottomRight,
            edgeStitchLeft,
            edgeStitchTop,
            edgeStitchRight,
            edgeStitchBottom,
            stapleDualLeft,
            stapleDualTop,
            stapleDualRight,
            stapleDualBottom,
            stapleTripleLeft,
            stapleTripleTop,
            stapleTripleRight,
            stapleTripleBottom,
            bindLeft,
            bindTop,
            bindRight,
            bindBottom,
            trimAfterPages,
            trimAfterDocuments,
            trimAfterCopies,
            trimAfterJob,
            punchTopLeft,
            punchBottomLeft,
            punchTopRight,
            punchBottomRight,
            punchDualLeft,
            punchDualTop,
            punchDualRight,
            punchDualBottom,
            punchTripleLeft,
            punchTripleTop,
            punchTripleRight,
            punchTripleBottom,
            punchQuadLeft,
            punchQuadTop,
            punchQuadRight,
            punchQuadBottom,
            punchMultipleLeft,
            punchMultipleTop,
            punchMultipleRight,
            punchMultipleBottom,
            foldAccordion,
            foldDoubleGate,
            foldGate,
            foldHalf,
            foldHalfZ,
            foldLeftGate,
            foldLetter,
            foldParallel,
            foldPoster,
            foldRightGate,
            foldZ,
            foldEngineeringZ,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): Finishing =
            all[value] ?: Finishing(value, "???")
    }
}
