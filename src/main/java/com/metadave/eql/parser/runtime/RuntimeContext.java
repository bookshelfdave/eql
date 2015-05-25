/*
 * -------------------------------------------------------------------
 *
 * Copyright (c) 2015 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

package com.metadave.eql.parser.runtime;


import org.elasticsearch.client.Client;

import java.util.ArrayList;
import java.util.List;


public class RuntimeContext {

    private List<Throwable> errors = new ArrayList<Throwable>();
    private boolean parseError = false;
    Client client = null;

    public boolean isParseError() {
        return parseError;
    }

    public void setParseError(boolean parseError) {
        this.parseError = parseError;
    }

    public void appendError(String msg, Throwable e) {
        errors.add(new Exception(msg, e));
    }

    public void appendError(Throwable e) {
        errors.add(e);
    }

    public void appendError(String e) {
        errors.add(new Exception(e));
    }

    public List<Throwable> getErrors() {
        return errors;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void shutdown() {
        System.out.println("Closing connection(s)");
        if(client != null) {
            client.close();
        }
    }
}
