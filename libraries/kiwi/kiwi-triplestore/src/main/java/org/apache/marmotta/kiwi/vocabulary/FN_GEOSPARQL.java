/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.marmotta.kiwi.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.Namespace;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.NamespaceImpl;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.model.vocabulary.FN;

/**
 * Implement geof Function from GeoSPARQL standard
 *
 *
 * @author Xavier Zumba (xavier.sumba93@ucuenca.ec))
 */
public class FN_GEOSPARQL {

    public static final String NAMESPACE = "http://www.opengis.net/def/function/geosparql/";

    /**
     * Recommended prefix for the XPath Functions namespace:
     */
    public static final String PREFIX = "geof";

    // Geometry Type's
    public static final String POINT;
    public static final String MULTIPOLYGON;
    public static final String MULTILINESTRING;

    /**
     * An immutable {@link org.openrdf.model.Namespace} constant that represents
     * the XPath Functions namespace.
     */
    public static final Namespace NS = new NamespaceImpl(PREFIX, NAMESPACE);

    //BOOLEAN FUNCTIONS
    public static final URI SF_INTERSECTS;

    //SPATIAL FUNCTION ( ejm: buffer )  
    //DISTANCE FUNCTION ( ejm: distance )
    static {
        ValueFactory f = new ValueFactoryImpl();

        SF_INTERSECTS = f.createURI(NAMESPACE, "sfIntersects");

        POINT = "POINT";
        MULTIPOLYGON = "MULTIPOLYGON";
        MULTILINESTRING = "MULTILINESTRING";

    }
}
