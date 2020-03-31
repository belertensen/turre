/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.blank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorldController {


    public static void main(String args[]) throws IOException {

        int cantrueda = 4;
        int ruedaaux = 1;
        String marca = "renault";
        String Anio = "2012";
        cargarcantidadderuedas(cantrueda);
        ruedaaux(ruedaaux);
        marca(marca);
        anio(Anio);;
    }

    public static void cargarcantidadderuedas(int cantrueda) throws IOException {

        // BufferedReader reader =
        //           new  BufferedReader(new InputStreamReader(System.in));
        //     String name = reader.readLine();
        System.out.println("variable elegida  " + cantrueda);
    }

    public static void ruedaaux(int ruedaaux) throws IOException {

        // BufferedReader reader =
        //           new  BufferedReader(new InputStreamReader(System.in));
        //     String name = reader.readLine();
        System.out.println("variable elegida  " + ruedaaux);
    }

    public static void marca (String marca) throws IOException {

        // BufferedReader reader =
        //           new  BufferedReader(new InputStreamReader(System.in));
        //     String name = reader.readLine();
        System.out.println("variable elegida  " + marca);
    }
        public static void anio (String anio) throws IOException {

            // BufferedReader reader =
            //           new  BufferedReader(new InputStreamReader(System.in));
            //     String name = reader.readLine();
            System.out.println("variable elegida  " + anio);
        }
    }