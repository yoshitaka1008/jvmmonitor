/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 *
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jvmmonitor.internal.ui;

import org.jvmmonitor.ui.Activator;

/**
 * The constants.
 */
@SuppressWarnings("nls")
public interface IConstants {

    /** The memento key for chart set. */
    static final String CHART_SET = "ChartSet";

    /** The memento key for group. */
    static final String GROUP = "Group";

    /** The memento key for unit. */
    static final String UNIT = "Unit";

    /** The memento key for attribute. */
    static final String ATTRIBUTE = "Attribute";

    /** The memento key for object name. */
    static final String OBJECT_NAME = "ObjectName";

    /** The memento key for color. */
    static final String COLOR = "Color";

    /** The dialog settings key for profiled packages. */
    static final String PACKAGES_KEY = Activator.getDefault().getBundle()
            .getSymbolicName()
            + ".packages";

    /** The dialog settings key for profiler sampling period. */
    static final String PROFILER_SAMPLING_PERIOD_KEY = Activator.getDefault()
            .getBundle().getSymbolicName()
            + ".profilerSampingPeriod";

    /** The dialog settings key for profiler type (BCI or sampling). */
    static final String PROFILER_TYPE_KEY = Activator.getDefault().getBundle()
            .getSymbolicName()
            + ".profilerType";

    /** The separator ID. */
    static final String SEPARATOR_ID = "org.jvmmonitor.separator"; //$NON-NLS-1$
}
