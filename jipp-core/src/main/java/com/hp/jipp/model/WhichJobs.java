// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2023-03-07
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "which-jobs" keywords.
 *
 * Also used by: "which-jobs-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf">PWG5100.11</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf">PWG5100.18</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext21-20230210-5100.7.pdf">PWG5100.7</a>
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class WhichJobs {
    public static final String aborted = "aborted";
    public static final String all = "all";
    public static final String canceled = "canceled";
    public static final String completed = "completed";
    public static final String fetchable = "fetchable";
    public static final String notCompleted = "not-completed";
    public static final String pending = "pending";
    public static final String pendingHeld = "pending-held";
    public static final String processing = "processing";
    public static final String processingStopped = "processing-stopped";
    public static final String proofPrint = "proof-print";
    public static final String saved = "saved";
}