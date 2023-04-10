// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2023-03-07
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "job-sheets" keywords.
 *
 * Also used by: "job-sheets-default", "job-sheets-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf">PWG5100.3</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext21-20230210-5100.7.pdf">PWG5100.7</a>
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class JobSheet {
    public static final String firstPrintStreamPage = "first-print-stream-page";
    public static final String jobBothSheet = "job-both-sheet";
    public static final String jobBothSheets = "job-both-sheets";
    public static final String jobEndSheet = "job-end-sheet";
    public static final String jobStartSheet = "job-start-sheet";
    public static final String none = "none";
    public static final String standard = "standard";
}