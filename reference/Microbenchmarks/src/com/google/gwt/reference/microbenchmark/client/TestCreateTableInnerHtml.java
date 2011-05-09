/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.reference.microbenchmark.client;

import com.google.gwt.user.client.ui.Widget;

/**
 * Run by {@link WidgetCreation}, see
 * {@link TestCreateTableInnerHtml.Maker#name} for details.
 */
public class TestCreateTableInnerHtml extends Widget {
  public static class Maker extends WidgetCreation.Maker {
    Maker() {
      super(Util.TABLE_ROW_COUNT + "x" + Util.TABLE_COLUMN_COUNT
          + " table via innerHTML built with StringBuilder, no widgets");
    }

    @Override
    public Widget make() {
      return new TestCreateTableInnerHtml();
    }
  }

  private TestCreateTableInnerHtml() {
    setElement(Util.fromHtml(Util.createTableHtml()));
  }
}