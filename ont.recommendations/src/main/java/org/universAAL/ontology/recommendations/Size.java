/*******************************************************************************
 * Copyright 2013 Universidad PolitĂ©cnica de Madrid
 * Copyright 2013 Ericsson Nikola Tesla d.d.
 *
 * See the NOTICE file distributed with this work for additional 
 * information regarding copyright ownership
 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.recommendations;



/**
 * Ontological representation of Size in the recommendations ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class Size extends VisualRecommendation {
  public static final String MY_URI = RecommendationsOntology.NAMESPACE
    + "Size";
  public static final String PROP_HORIZONTAL = RecommendationsOntology.NAMESPACE
    + "horizontal";
  public static final String PROP_VERTICAL = RecommendationsOntology.NAMESPACE
    + "vertical";


  public Size () {
    super();
  }
  
  public Size (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {
    if (PROP_HORIZONTAL.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    if (PROP_VERTICAL.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    return super.getPropSerializationType(propURI);
  } 

  public boolean isWellFormed() {
	return super.isWellFormed() 
      && hasProperty(PROP_HORIZONTAL)
      && hasProperty(PROP_VERTICAL);
  }

  public int getVertical() {
	Integer i = (Integer) getProperty(PROP_VERTICAL);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setVertical(int newPropValue) {
      changeProperty(PROP_VERTICAL, new Integer(newPropValue));
  }		

  public int getHorizontal() {
	Integer i = (Integer) getProperty(PROP_HORIZONTAL);
	return (i == null) ? 0 : i.intValue();
  }		

  public void setHorizontal(int newPropValue) {
      changeProperty(PROP_HORIZONTAL, new Integer(newPropValue));
  }		

}
