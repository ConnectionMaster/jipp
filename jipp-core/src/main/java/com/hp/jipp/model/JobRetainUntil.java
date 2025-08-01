// Copyright 2018 - 2025 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2025-05-13
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "job-retain-until" keywords (or names).
 *
 * Also used by: "job-retain-until-default", "job-retain-until-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext21-20230210-5100.7.pdf">PWG5100.7</a>
 */
public class JobRetainUntil {
    public static final String endOfDay = "end-of-day";
    public static final String endOfMonth = "end-of-month";
    public static final String endOfWeek = "end-of-week";
    public static final String indefinite = "indefinite";
    public static final String none = "none";
}