/*******************************************************************************
 * Copyright 2013 UPM - Universidad Politécnica de Madrid
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.unit.system;

import org.universAAL.ontology.unit.MeasurableDimension;
import org.universAAL.ontology.unit.Unit;
import org.universAAL.ontology.unit.UnitOntology;
import org.universAAL.ontology.unit.UnitSystem;;

/**
 * @author amedrano
 *
 */
public class TimeSystem {

        /*
         * STATIC resources
         */
        public static final UnitSystem IND_TS = new UnitSystem(UnitOntology.NAMESPACE+"timeForTimeUnits");
        
        // Units
        public static final Unit IND_UNIT_TS_SECOND = InternationalSystem.IND_UNIT_SI_SECOND;
        public static final Unit IND_UNIT_TS_MINUTE = new Unit("minute", "Minute", "min",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_HOUR = new Unit("hour", "Hour", "h",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_DAY = new Unit("day", "Day", "day",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_WEEK = new Unit("week", "Week", "week",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_MONTH = new Unit("month", "Month", "month",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_YEAR = new Unit("year", "Year", "year",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_LUSTRUM = new Unit("lustrum", "Lustrum", "Lustrum",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_DECADE = new Unit("decade", "Decade", "decade",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_CENTURY = new Unit("century", "Century", "century",
        		MeasurableDimension.Time, IND_TS);
        public static final Unit IND_UNIT_TS_MILENIUM = new Unit("melenium", "Milenium", "milenium",
        		MeasurableDimension.Time, IND_TS);
        //YES uAAL will need this! as its rule will last milenia! MUAhahaha
        
        static{
        	IND_TS.addUnits(IND_UNIT_TS_SECOND);
        	IND_TS.addUnits(IND_UNIT_TS_MINUTE);
        	IND_TS.addUnits(IND_UNIT_TS_HOUR);
        	IND_TS.addUnits(IND_UNIT_TS_DAY);
        	IND_TS.addUnits(IND_UNIT_TS_WEEK);
        	IND_TS.addUnits(IND_UNIT_TS_MONTH);
        	IND_TS.addUnits(IND_UNIT_TS_YEAR);
        	IND_TS.addUnits(IND_UNIT_TS_LUSTRUM);
        	IND_TS.addUnits(IND_UNIT_TS_DECADE);
        	IND_TS.addUnits(IND_UNIT_TS_CENTURY);
        	IND_TS.addUnits(IND_UNIT_TS_MILENIUM);
        }        
}
