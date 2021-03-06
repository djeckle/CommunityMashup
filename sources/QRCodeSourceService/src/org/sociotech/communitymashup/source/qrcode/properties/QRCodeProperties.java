/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.qrcode.properties;

/**
 * This class contains string constants for properties used by the qr code source service.
 * 
 * @author Peter Lachenmaier
 */
public class QRCodeProperties {

    /**
     * This property is used to set the size of the created marker. It is possible to set
     * both dimensions like 150x200, the marker will be quadratic but surrounded with white space. 
     */
    public static final String MARKER_SIZE_PROPERTY = "markerSize";
    public static final String MARKER_SIZE_DEFAULT =  "150";
    
    /**
     * This property is used to enable the load balancing.
     */
    public static final String USE_LOAD_BALANCING_PROPERTY = "loadBalancing";
    public static final String USE_LOAD_BALANCING_DEFAULT  = "false";
}
