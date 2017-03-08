/**
 * Copyright (C) 2014 DANS - Data Archiving and Networked Services (info@dans.knaw.nl) Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package nl.knaw.dans.pf.language.emd.binding;

import nl.knaw.dans.pf.language.emd.EmdBean;
import nl.knaw.dans.pf.language.xml.binding.JiBXMarshaller;

public class EmdMarshaller extends JiBXMarshaller {
    public static final String BINDING_NAME = "easymetadata_binding";

    public EmdMarshaller(EmdBean bean) {
        super(BINDING_NAME, bean);
    }

}