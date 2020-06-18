/**
 * Copyright Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.firebase.udacity.friendlychat;

public class FriendlyMessage {

    private String code;
    private String name;
    private String photoUrl;
    private int currentprice;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String code, String name, String photoUrl, int currentprice) {
        this.code = code;
        this.name = name;
        this.photoUrl = photoUrl;
        this.currentprice = currentprice;
    }

    public void setcurrentprice(int currentprice) {
        this.currentprice = currentprice;
    }

    public int getcurrentprice() {
        return currentprice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
