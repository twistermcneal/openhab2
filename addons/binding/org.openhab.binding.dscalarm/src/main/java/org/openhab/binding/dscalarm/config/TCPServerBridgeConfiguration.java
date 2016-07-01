/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dscalarm.config;

/**
 * Configuration class for the TCP Server bridge, used to connect to the DSC Alarm system.
 *
 * @author Russell Stephens - Initial contribution
 */

public class TCPServerBridgeConfiguration {

    // TCP Server Bridge Thing constants
    public static final String IP_ADDRESS = "ipAddress";
    public static final String PORT = "port";
    public static final String PASSWORD = "password";
    public static final String CONNECTION_TIMEOUT = "connectionTimeout";
    public static final String POLL_PERIOD = "pollPeriod";

    /**
     * The IP address of the TCP Server
     */
    public String ipAddress;

    /**
     * The port number of the TCP Server
     */
    public Integer port;

    /**
     * The Socket connection timeout for the TCP Server
     */
    public Integer connectionTimeout;

    /**
     * The Panel Poll Period. Can be set in range 1-15 minutes. Default is 1 minute;
     */
    public Integer pollPeriod;
}
