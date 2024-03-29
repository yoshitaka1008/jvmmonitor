/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 *
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jvmmonitor.internal.agent;

/**
 * The messages.
 */
@SuppressWarnings("nls")
public class Messages {

    /** The error message that registering CpuProfilerMXBean failed. */
    static final String CANNOT_REGISTER_CPU_PROFILER_MXBEAN = "Cannot register CpuBciProfilerMXBean.";

    /** The error message that opening configuration file failed. */
    static final String CANNOT_OPEN_CONFIG_FILE = "Cannot open the specified configuration file:\n\t%s\n";

    /** The error message that getting dump failed. */
    static final String CANNOT_GET_DUMP = "Cannot get the CPU profiling data.";

    /** The error message that clearing profile data failed. */
    static final String CANNOT_CLEAR = "Cannot clear the CPU profiling data.";

    /** The error message that getting profiler state failed. */
    static final String CANNOT_GET_RUNNING_STATE = "Cannot get the profiler running state.";

    /** The error message that suspending profiler failed. */
    static final String CANNOT_SUSPEND = "Cannot suspend the CPU profiler.";

    /** The error message that resuming profiler failed. */
    static final String CANNOT_RESUME = "Cannot resume the CPU profiler.";

    /** The error message that transforming classes failed. */
    static final String CANNOT_TRANSFORM_CLASSES = "Cannot transform the classes.";

    /** The error message that dumping to file failed. */
    static final String CANNOT_DUMP_TO_FILE = "Cannot dump the CPU profiling data to file.";

    /** the error message that creating dump file failed. */
    static final String CANNOT_CREATE_DUMP_FILE = "Writing into a dump file failed.\n"
            + "Please check the output directory \"%s\" specified in configuration file.\n";

    /** The error message that re-transforming class failed. */
    static final String CANNOT_RETRANSFORM_CLASS = "Cannot retransform class: %s";

    /** The error message that reading file failed. */
    static final String CANNOT_READ_FILE = "Cannot read file: %s";

    /** The error message that setting SWT resource tracking state failed. */
    static final String CANNOT_SET_RESOURCE_TRACKING_STATE = "Cannot set SWT resource tracking state.";

    /** The error message that getting SWT resource tracking state failed. */
    static final String CANNOT_GET_RESOURCE_TRACKING_STATE = "Cannot get SWT resource tracking state.";

    /** The error message that getting SWT resources failed. */
    static final String CANNOT_GET_RESOURCES = "Cannot get SWT resources.";

    /** The error message that clearing SWT resource tracking data failed. */
    static final String CANNOT_CLEAR_RESOURCE_TRACKING_DATA = "Cannot clear SWT resource tracking data";

    /** The error message that getting eclipse scheduling rules failed. */
    static final String CANNOT_GET_ECLIPSE_SCHEDULING_RULES = "Cannot get eclipse scheduling rules.";

    /** The error message that getting eclipse jobs failed. */
    static final String CANNOT_GET_ECLIPSE_JOBS = "Cannot get eclipse jobs.";

    /** The error message that logging eclipse job manager data failed. */
    static final String CANNOT_LOG_ECLIPSE_JOB_MANAGER_DATA = "Cannot log Eclipse job manager data.";

    /** The info message that agent got loaded. */
    static final String AGENT_LOADED = "Agent has been loaded.";

    /** The info message that agent has been already loaded. */
    static final String AGENT_ALREADY_LOADED = "Agent has been already loaded.";

    /** The info message that class has been instrumented. */
    static final String INSTRUMENTED_CLASS = "Instrumented class: %s";

    /** The info message that class has been re-transformed. */
    static final String RETRANSFORMED_CLASS = "Retransformed class: %s";

    /** The message that no thread is currently using eclipse scheduling rule. */
    static final String NO_THREAD_USNIG_ECLIPSE_SCHEDULING_RULE = "No thread is currently using scheduling rule.";

    /**
     * The message that no eclipse job is currently running, waiting or sleeping.
     */
    static final String NO_ECLIPSE_JOB_RUNNING_WAITING_OR_SLEEPING = "No eclipse job is currently running, waiting or sleeping.";

    /** The message showing eclipse scheduling rule. */
    static final String ECLIPSE_SCHEDULING_RULE_LOG_MESSAGE = "Thread: %s\n        holds scheduling rule(s):    %s\n"
            + "        waiting for scheduling rule: %s\n";

    /** The message showing eclipse job. */
    static final String ECLIPSE_JOB_LOG_MESSAGE = "Job: %s (%s)\n        in state: %s\n        runs in thread: %s\n"
            + "        runs with scheduling rule: %s\n        canceled: %b\n";
}
