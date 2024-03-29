/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 *
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jvmmonitor.internal.ui;

import org.eclipse.osgi.util.NLS;

/**
 * The messages.
 */
public final class Messages extends NLS {

    /** The bundle name. */
    private static final String BUNDLE_NAME = "org.jvmmonitor.internal.ui.messages";//$NON-NLS-1$

    static {
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    /**
     * The constructor.
     */
    private Messages() {
        // do not instantiate
    }

    // preference page labels

    /** */
    public static String searchJvmPeriodLabel;

    /** */
    public static String updatePeriodLabel;

    /** */
    public static String showLegendLabel;

    /** */
    public static String timelineGroupLabel;

    /** */
    public static String threadsGroupLabel;

    /** */
    public static String wideScopeThreadFilterLabel;

    /** */
    public static String memoryGroupLabel;

    /** */
    public static String maxNumberOfClassesLabel;

    /** */
    public static String wideScopeSWTResourceFilterLabel;

    // preference page messages

    /** */
    public static String serachJvmPeriodNotEnteredMsg;

    /** */
    public static String illegalSearchJvmPeriodMsg;

    /** */
    public static String searchJvmPeriodOutOfRangeMsg;

    /** */
    public static String updatePeriodNotEnteredMsg;

    /** */
    public static String illegalUpdatePeriodMsg;

    /** */
    public static String updatePeriodOutOfRangeMsg;

    /** */
    public static String enterMaxNumberOfClassesMsg;

    /** */
    public static String maxNumberOfClassesInvalidMsg;

    /** */
    public static String maxNumberOfClassesOutOfRangeMsg;

}
