/*
 *  Copyright 2001-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.commons.collections15.bidimap;

import junit.framework.Test;
import junit.textui.TestRunner;
import org.apache.commons.collections15.BidiMap;
import org.apache.commons.collections15.BulkTest;

/**
 * JUnit tests.
 *
 * @author Matthew Hawthorne
 * @author Matt Hall, John Watkinson, Stephen Colebourne
 * @version $Revision: 1.1 $ $Date: 2005/10/11 17:05:44 $
 */
public class TestDualTreeBidiMap extends AbstractTestSortedBidiMap {

    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    public static Test suite() {
        return BulkTest.makeSuite(TestDualTreeBidiMap.class);
    }

    public TestDualTreeBidiMap(String testName) {
        super(testName);
    }

    public BidiMap makeEmptyBidiMap() {
        return new DualTreeBidiMap();
    }

    /**
     * Override to prevent infinite recursion of tests.
     */
    public String[] ignoredTests() {
        return new String[]{"TestDualTreeBidiMap.bulkTestInverseMap.bulkTestInverseMap"};
    }

    //    public void testCreate() throws Exception {
    //        resetEmpty();
    //        writeExternalFormToDisk((Serializable) map, "D:/dev/collections15/data/test/DualTreeBidiMap.emptyCollection.version3.obj");
    //        resetFull();
    //        writeExternalFormToDisk((Serializable) map, "D:/dev/collections15/data/test/DualTreeBidiMap.fullCollection.version3.obj");
    //    }
}
