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
 * "status" enum as defined in:
 * [PWG5100.13](https://ftp.pwg.org/pub/pwg/candidates/cs-ippnodriver20-20230301-5100.13.pdf),
 * [PWG5100.16](https://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf),
 * [PWG5100.18-2015](https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf),
 * [PWG5100.7-2019](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext20-20190816-5100.7.pdf),
 * [RFC3380](http://www.iana.org/go/rfc3380),
 * [RFC3995](http://www.iana.org/go/rfc3995),
 * [RFC3996](http://www.iana.org/go/rfc3996),
 * [RFC3998](http://www.iana.org/go/rfc3998),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class Status(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [Status] attribute. */
    class Type(name: String) : EnumType<Status>(name, { get(it) })

    /** An [AttributeType] for multiple [Status] attributes. */
    class SetType(name: String) : EnumType.Set<Status>(name, { get(it) })

    object Code {
        const val successfulOk = 0x0000
        const val successfulOkIgnoredOrSubstitutedAttributes = 0x0001
        const val successfulOkConflictingAttributes = 0x0002
        const val successfulOkIgnoredSubscriptions = 0x0003
        const val successfulOkTooManyEvents = 0x0005
        const val successfulOkEventsComplete = 0x0007
        const val clientErrorBadRequest = 0x0400
        const val clientErrorForbidden = 0x0401
        const val clientErrorNotAuthenticated = 0x0402
        const val clientErrorNotAuthorized = 0x0403
        const val clientErrorNotPossible = 0x0404
        const val clientErrorTimeout = 0x0405
        const val clientErrorNotFound = 0x0406
        const val clientErrorGone = 0x0407
        const val clientErrorRequestEntityTooLarge = 0x0408
        const val clientErrorRequestValueTooLong = 0x0409
        const val clientErrorDocumentFormatNotSupported = 0x040A
        const val clientErrorAttributesOrValuesNotSupported = 0x040B
        const val clientErrorUriSchemeNotSupported = 0x040C
        const val clientErrorCharsetNotSupported = 0x040D
        const val clientErrorConflictingAttributes = 0x040E
        const val clientErrorCompressionNotSupported = 0x040F
        const val clientErrorCompressionError = 0x0410
        const val clientErrorDocumentFormatError = 0x0411
        const val clientErrorDocumentAccessError = 0x0412
        const val clientErrorAttributesNotSettable = 0x0413
        const val clientErrorIgnoredAllSubscriptions = 0x0414
        const val clientErrorTooManySubscriptions = 0x0415
        const val clientErrorDocumentPasswordError = 0x0418
        const val clientErrorDocumentPermissionError = 0x0419
        const val clientErrorDocumentSecurityError = 0x041A
        const val clientErrorDocumentUnprintableError = 0x041B
        const val clientErrorAccountInfoNeeded = 0x041C
        const val clientErrorAccountClosed = 0x041D
        const val clientErrorAccountLimitReached = 0x041E
        const val clientErrorAccountAuthorizationFailed = 0x041F
        const val clientErrorNotFetchable = 0x0420
        const val serverErrorInternalError = 0x0500
        const val serverErrorOperationNotSupported = 0x0501
        const val serverErrorServiceUnavailable = 0x0502
        const val serverErrorVersionNotSupported = 0x0503
        const val serverErrorDeviceError = 0x0504
        const val serverErrorTemporaryError = 0x0505
        const val serverErrorNotAcceptingJobs = 0x0506
        const val serverErrorBusy = 0x0507
        const val serverErrorJobCanceled = 0x0508
        const val serverErrorMultipleDocumentJobsNotSupported = 0x0509
        const val serverErrorPrinterIsDeactivated = 0x050A
        const val serverErrorTooManyJobs = 0x050B
        const val serverErrorTooManyDocuments = 0x050C
    }

    companion object {
        @JvmField val successfulOk = Status(Code.successfulOk, "successful-ok")
        @JvmField val successfulOkIgnoredOrSubstitutedAttributes = Status(Code.successfulOkIgnoredOrSubstitutedAttributes, "successful-ok-ignored-or-substituted-attributes")
        @JvmField val successfulOkConflictingAttributes = Status(Code.successfulOkConflictingAttributes, "successful-ok-conflicting-attributes")
        @JvmField val successfulOkIgnoredSubscriptions = Status(Code.successfulOkIgnoredSubscriptions, "successful-ok-ignored-subscriptions")
        @JvmField val successfulOkTooManyEvents = Status(Code.successfulOkTooManyEvents, "successful-ok-too-many-events")
        @JvmField val successfulOkEventsComplete = Status(Code.successfulOkEventsComplete, "successful-ok-events-complete")
        @JvmField val clientErrorBadRequest = Status(Code.clientErrorBadRequest, "client-error-bad-request")
        @JvmField val clientErrorForbidden = Status(Code.clientErrorForbidden, "client-error-forbidden")
        @JvmField val clientErrorNotAuthenticated = Status(Code.clientErrorNotAuthenticated, "client-error-not-authenticated")
        @JvmField val clientErrorNotAuthorized = Status(Code.clientErrorNotAuthorized, "client-error-not-authorized")
        @JvmField val clientErrorNotPossible = Status(Code.clientErrorNotPossible, "client-error-not-possible")
        @JvmField val clientErrorTimeout = Status(Code.clientErrorTimeout, "client-error-timeout")
        @JvmField val clientErrorNotFound = Status(Code.clientErrorNotFound, "client-error-not-found")
        @JvmField val clientErrorGone = Status(Code.clientErrorGone, "client-error-gone")
        @JvmField val clientErrorRequestEntityTooLarge = Status(Code.clientErrorRequestEntityTooLarge, "client-error-request-entity-too-large")
        @JvmField val clientErrorRequestValueTooLong = Status(Code.clientErrorRequestValueTooLong, "client-error-request-value-too-long")
        @JvmField val clientErrorDocumentFormatNotSupported = Status(Code.clientErrorDocumentFormatNotSupported, "client-error-document-format-not-supported")
        @JvmField val clientErrorAttributesOrValuesNotSupported = Status(Code.clientErrorAttributesOrValuesNotSupported, "client-error-attributes-or-values-not-supported")
        @JvmField val clientErrorUriSchemeNotSupported = Status(Code.clientErrorUriSchemeNotSupported, "client-error-uri-scheme-not-supported")
        @JvmField val clientErrorCharsetNotSupported = Status(Code.clientErrorCharsetNotSupported, "client-error-charset-not-supported")
        @JvmField val clientErrorConflictingAttributes = Status(Code.clientErrorConflictingAttributes, "client-error-conflicting-attributes")
        @JvmField val clientErrorCompressionNotSupported = Status(Code.clientErrorCompressionNotSupported, "client-error-compression-not-supported")
        @JvmField val clientErrorCompressionError = Status(Code.clientErrorCompressionError, "client-error-compression-error")
        @JvmField val clientErrorDocumentFormatError = Status(Code.clientErrorDocumentFormatError, "client-error-document-format-error")
        @JvmField val clientErrorDocumentAccessError = Status(Code.clientErrorDocumentAccessError, "client-error-document-access-error")
        @JvmField val clientErrorAttributesNotSettable = Status(Code.clientErrorAttributesNotSettable, "client-error-attributes-not-settable")
        @JvmField val clientErrorIgnoredAllSubscriptions = Status(Code.clientErrorIgnoredAllSubscriptions, "client-error-ignored-all-subscriptions")
        @JvmField val clientErrorTooManySubscriptions = Status(Code.clientErrorTooManySubscriptions, "client-error-too-many-subscriptions")
        @JvmField val clientErrorDocumentPasswordError = Status(Code.clientErrorDocumentPasswordError, "client-error-document-password-error")
        @JvmField val clientErrorDocumentPermissionError = Status(Code.clientErrorDocumentPermissionError, "client-error-document-permission-error")
        @JvmField val clientErrorDocumentSecurityError = Status(Code.clientErrorDocumentSecurityError, "client-error-document-security-error")
        @JvmField val clientErrorDocumentUnprintableError = Status(Code.clientErrorDocumentUnprintableError, "client-error-document-unprintable-error")
        @JvmField val clientErrorAccountInfoNeeded = Status(Code.clientErrorAccountInfoNeeded, "client-error-account-info-needed")
        @JvmField val clientErrorAccountClosed = Status(Code.clientErrorAccountClosed, "client-error-account-closed")
        @JvmField val clientErrorAccountLimitReached = Status(Code.clientErrorAccountLimitReached, "client-error-account-limit-reached")
        @JvmField val clientErrorAccountAuthorizationFailed = Status(Code.clientErrorAccountAuthorizationFailed, "client-error-account-authorization-failed")
        @JvmField val clientErrorNotFetchable = Status(Code.clientErrorNotFetchable, "client-error-not-fetchable")
        @JvmField val serverErrorInternalError = Status(Code.serverErrorInternalError, "server-error-internal-error")
        @JvmField val serverErrorOperationNotSupported = Status(Code.serverErrorOperationNotSupported, "server-error-operation-not-supported")
        @JvmField val serverErrorServiceUnavailable = Status(Code.serverErrorServiceUnavailable, "server-error-service-unavailable")
        @JvmField val serverErrorVersionNotSupported = Status(Code.serverErrorVersionNotSupported, "server-error-version-not-supported")
        @JvmField val serverErrorDeviceError = Status(Code.serverErrorDeviceError, "server-error-device-error")
        @JvmField val serverErrorTemporaryError = Status(Code.serverErrorTemporaryError, "server-error-temporary-error")
        @JvmField val serverErrorNotAcceptingJobs = Status(Code.serverErrorNotAcceptingJobs, "server-error-not-accepting-jobs")
        @JvmField val serverErrorBusy = Status(Code.serverErrorBusy, "server-error-busy")
        @JvmField val serverErrorJobCanceled = Status(Code.serverErrorJobCanceled, "server-error-job-canceled")
        @JvmField val serverErrorMultipleDocumentJobsNotSupported = Status(Code.serverErrorMultipleDocumentJobsNotSupported, "server-error-multiple-document-jobs-not-supported")
        @JvmField val serverErrorPrinterIsDeactivated = Status(Code.serverErrorPrinterIsDeactivated, "server-error-printer-is-deactivated")
        @JvmField val serverErrorTooManyJobs = Status(Code.serverErrorTooManyJobs, "server-error-too-many-jobs")
        @JvmField val serverErrorTooManyDocuments = Status(Code.serverErrorTooManyDocuments, "server-error-too-many-documents")

        @JvmField val all = listOf(
            successfulOk,
            successfulOkIgnoredOrSubstitutedAttributes,
            successfulOkConflictingAttributes,
            successfulOkIgnoredSubscriptions,
            successfulOkTooManyEvents,
            successfulOkEventsComplete,
            clientErrorBadRequest,
            clientErrorForbidden,
            clientErrorNotAuthenticated,
            clientErrorNotAuthorized,
            clientErrorNotPossible,
            clientErrorTimeout,
            clientErrorNotFound,
            clientErrorGone,
            clientErrorRequestEntityTooLarge,
            clientErrorRequestValueTooLong,
            clientErrorDocumentFormatNotSupported,
            clientErrorAttributesOrValuesNotSupported,
            clientErrorUriSchemeNotSupported,
            clientErrorCharsetNotSupported,
            clientErrorConflictingAttributes,
            clientErrorCompressionNotSupported,
            clientErrorCompressionError,
            clientErrorDocumentFormatError,
            clientErrorDocumentAccessError,
            clientErrorAttributesNotSettable,
            clientErrorIgnoredAllSubscriptions,
            clientErrorTooManySubscriptions,
            clientErrorDocumentPasswordError,
            clientErrorDocumentPermissionError,
            clientErrorDocumentSecurityError,
            clientErrorDocumentUnprintableError,
            clientErrorAccountInfoNeeded,
            clientErrorAccountClosed,
            clientErrorAccountLimitReached,
            clientErrorAccountAuthorizationFailed,
            clientErrorNotFetchable,
            serverErrorInternalError,
            serverErrorOperationNotSupported,
            serverErrorServiceUnavailable,
            serverErrorVersionNotSupported,
            serverErrorDeviceError,
            serverErrorTemporaryError,
            serverErrorNotAcceptingJobs,
            serverErrorBusy,
            serverErrorJobCanceled,
            serverErrorMultipleDocumentJobsNotSupported,
            serverErrorPrinterIsDeactivated,
            serverErrorTooManyJobs,
            serverErrorTooManyDocuments,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): Status =
            all[value] ?: Status(value, "???")
    }
}
