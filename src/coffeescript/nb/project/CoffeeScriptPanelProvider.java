// Copyright 2011 Denis Stepanov
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package coffeescript.nb.project;

import coffeescript.nb.project.ui.CoffeeScriptActionSettingsPanel;
import javax.swing.JComponent;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;
import org.openide.util.Lookup;

/**
 *
 * @author Denis Stepanov
 */
@ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "coffeescript-nb-project")
public class CoffeeScriptPanelProvider implements ProjectCustomizer.CompositeCategoryProvider {

    public Category createCategory(Lookup context) {
        return ProjectCustomizer.Category.create("Build", " ", null);
    }

    public JComponent createComponent(Category category, Lookup context) {
        return new CoffeeScriptActionSettingsPanel();
    }
}
