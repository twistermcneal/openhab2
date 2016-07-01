/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.systeminfo;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link SysteminfoBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Svilen Valkanov - Initial contribution
 */
public class SysteminfoBindingConstants {

    public static final String BINDING_ID = "systeminfo";

    public final static ThingTypeUID THING_TYPE_COMPUTER = new ThingTypeUID(BINDING_ID, "computer");

    // Thing properties
    /**
     * Number of CPU logical cores
     */
    public final static String PROPERTY_CPU_LOGICAL_CORES = "cpu_logicalCores";

    /**
     * Number of CPU physical cores
     */
    public final static String PROPERTY_CPU_PHYSICAL_CORES = "cpu_physicalCores";

    /**
     * Contains information about the family /Windows, Linux, OS X etc/ of the operation system
     */
    public final static String PROPERTY_OS_FAMILY = "os_family";

    /**
     * Name of the manufacturer of the operation system
     */
    public final static String PROPERTY_OS_MANUFACTURER = "os_manufacturer";

    /**
     * Version of the operation system
     */
    public final static String PROPERTY_OS_VERSION = "os_version";

    // List of all Channel IDs

    /**
     * Size of the available memory
     */
    public final static String CHANNEL_MEMORY_AVAILABLE = "memory#available";

    /**
     * Size of the used memory
     */
    public final static String CHANNEL_MEMORY_USED = "memory#used";

    /**
     * Total size of the memory
     */
    public final static String CHANNEL_MEMORY_TOTAL = "memory#total";

    /**
     * Percents of the available memory
     */
    public final static String CHANNEL_MEMORY_AVAILABLE_PERCENT = "memory#availablePercent";

    /**
     * Total size of swap memory
     */
    public final static String CHANNEL_SWAP_TOTAL = "swap#total";

    /**
     * Size of the available swap memory
     */
    public final static String CHANNEL_SWAP_AVAILABLE = "swap#available";

    /**
     * Size of the used swap memory
     */
    public final static String CHANNEL_SWAP_USED = "swap#used";

    /**
     * Percents of the available swap memory
     */
    public final static String CHANNEL_SWAP_AVAILABLE_PERCENT = "swap#availablePercent";

    /**
     * Physical storage drive name
     */
    public final static String CHANNEL_DRIVE_NAME = "drive#name";

    /**
     * Physical storage drive model
     */
    public final static String CHANNEL_DRIVE_MODEL = "drive#model";

    /**
     * Physical storage drive serial number
     */
    public final static String CHANNEL_DRIVE_SERIAL = "drive#serial";

    /**
     * Name of the logical volume storage
     */
    public final static String CHANNEL_STORAGE_NAME = "storage#name";

    /**
     * Logical storage volume type -(e.g. NTFS, FAT32 ..)
     */
    public final static String CHANNEL_STORAGE_TYPE = "storage#type";

    /**
     * Description of the logical volume storage
     */
    public final static String CHANNEL_STORAGE_DESCRIPTION = "storage#description";

    /**
     * Size of the available storage space
     */
    public final static String CHANNEL_STORAGE_AVAILABLE = "storage#available";

    /**
     * Size of the used storage space
     */
    public final static String CHANNEL_STORAGE_USED = "storage#used";

    /**
     * Total storage space
     */
    public final static String CHANNEL_STORAGE_TOTAL = "storage#total";

    /**
     * Percents of the available storage space
     */
    public final static String CHANNEL_STORAGE_AVAILABLE_PERCENT = "storage#availablePercent";

    /**
     * Temperature of the CPU measured from the sensors.
     */
    public final static String CHANNEL_SENSORS_CPU_TEMPERATURE = "sensors#cpuTemp";

    /**
     * Voltage of the CPU core.
     */
    public final static String CHANNEL_SENOSRS_CPU_VOLTAGE = "sensors#cpuVoltage";

    /**
     * Fan speed
     */
    public final static String CHANNEL_SENSORS_FAN_SPEED = "sensors#fanSpeed";

    /**
     * Name of the battery
     */
    public final static String CHANNEL_BATTERY_NAME = "battery#name";

    /**
     * Remaining capacity of the battery.
     */
    public final static String CHANNEL_BATTERY_REMAINING_CAPACITY = "battery#remainingCapacity";

    /**
     * Estimated remaining time of the battery
     */
    public final static String CHANNEL_BATTERY_REMAINING_TIME = "battery#remainingTime";

    /**
     * Detailed description about the CPU
     */
    public final static String CHANNEL_CPU_DESCRIPTION = "cpu#description";

    /**
     * Average recent CPU load
     */
    public final static String CHANNEL_CPU_LOAD = "cpu#load";

    /**
     * Average CPU load for the last minute
     */
    public final static String CHANNEL_CPU_LOAD_1 = "cpu#load1";

    /**
     * Average CPU load for the last 5 minutes
     */
    public final static String CHANNEL_CPU_LOAD_5 = "cpu#load5";

    /**
     * Average CPU load for the last 15 minutes
     */
    public final static String CHANNEL_CPU_LOAD_15 = "cpu#load15";

    /**
     * CPU name
     */
    public final static String CHANNEL_CPU_NAME = "cpu#name";

    /**
     * CPU uptime in minutes
     */
    public final static String CHANNEL_CPU_UPTIME = "cpu#uptime";

    /**
     * CPU running threads count
     */
    public final static String CHANNEL_CPU_THREADS = "cpu#threads";

    /**
     * Information about the display device
     */
    public final static String CHANNEL_DISPLAY_INFORMATION = "display#information";

    /**
     * Host IP address of the network
     */
    public final static String CHANNEL_NETWORK_IP = "network#ip";

    /**
     * Network display name
     */
    public final static String CHANNEL_NETWORK_ADAPTER_NAME = "network#networkName";

    /**
     * Network data sent
     */
    public final static String CHANNEL_NETWORK_DATA_SENT = "network#dataSent";

    /**
     * Network data received
     */
    public final static String CHANNEL_NETWORK_DATA_RECEIVED = "network#dataReceived";

    /**
     * Network packages sent
     */
    public final static String CHANNEL_NETWORK_PACKAGES_SENT = "network#packagesSent";

    /**
     * Network packages received
     */
    public final static String CHANNEL_NETWORK_PACKAGES_RECEIVED = "network#packagesReceived";

    /**
     * Network name
     */
    public final static String CHANNEL_NETWORK_NAME = "network#networkDisplayName";

    /**
     * Network mac address
     */
    public final static String CHANNEL_NETWORK_MAC = "network#mac";

    /**
     * Name of the channel group for process information
     */
    public final static String CHANNEL_GROUP_PROCESS = "process";

    /**
     * CPU load used from a process
     */

    public final static String CHANNEL_PROCESS_LOAD = "process#load";

    /**
     * Size of memory used from a process in MB
     */
    public final static String CHANNEL_PROCESS_MEMORY = "process#used";

    /**
     * Name of the process
     */
    public final static String CHANNEL_PROCESS_NAME = "process#name";

    /**
     * Number of threads, used form the process
     */
    public final static String CHANNEL_PROCESS_THREADS = "process#threads";

    /**
     * The full path of the process
     */
    public final static String CHANNEL_PROCESS_PATH = "process#path";

    // Thing configuraion
    /**
     * Name of the configuration parameter of the thing that defines refresh time for High priority channels
     */
    public final static String HIGH_PRIORITY_REFRESH_TIME = "interval_high";

    /**
     * Name of the configuration parameter of the thing that defines refresh time for Medium priority channels
     */
    public final static String MEDIUM_PRIORITY_REFRESH_TIME = "interval_medium";

    // Channel configuration

    /**
     * Name of the channel configuration parameter priority
     */
    public final static String PRIOIRITY_PARAM = "priority";

    /**
     * Name of the channel configuration parameter pid
     *
     */
    public final static String PID_PARAM = "pid";

}
