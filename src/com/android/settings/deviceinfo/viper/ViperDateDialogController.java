/*
 * Copyright (C) 2018 ViperOS
 *
 * Licensed under the Apache License, date 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.deviceinfo.viper;

import android.content.Context;
import android.os.SystemProperties;
import android.os.UserManager;

import com.android.settings.R;

public class ViperDateDialogController {

    private static final String VIPER_PROPERTY = "ro.viper.build_date";
    private static final int VIPER_DATE_VALUE_ID = R.id.viper_date_value;
    private static final int VIPER_DATE_LABEL_ID = R.id.viper_date_label;

    private final ViperInfoDialogFragment mDialog;
    private final Context mContext;
    private final UserManager mUserManager;

    public ViperDateDialogController(ViperInfoDialogFragment dialog) {
        mDialog = dialog;
        mContext = dialog.getContext();
        mUserManager = (UserManager) mContext.getSystemService(Context.USER_SERVICE);
    }

    public void initialize() {

        mDialog.setText(VIPER_DATE_VALUE_ID, SystemProperties.get(VIPER_PROPERTY,
                mContext.getResources().getString(R.string.device_info_default)));
    }
}
