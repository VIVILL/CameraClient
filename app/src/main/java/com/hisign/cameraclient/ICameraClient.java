/*
 *  UVCCamera
 *  library and sample to access to UVC web camera on non-rooted Android device
 *
 * Copyright (c) 2014-2017 saki t_saki@serenegiant.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  All files in the folder are under this Apache License, Version 2.0.
 *  Files in the libjpeg-turbo, libusb, libuvc, rapidjson folder
 *  may have a different license, see the respective files.
 */

package com.hisign.cameraclient;

import android.hardware.usb.UsbDevice;
import android.view.Surface;

public interface ICameraClient {
	public void select(UsbDevice device);
	public void select1(UsbDevice device);

	public void release();
	public void resize(int width, int height);
	public void connect(int pid_0,int pid_1);
	public void disconnect();

	public void addSurface(Surface surface, boolean isRecordable);
	public void addSurface1(Surface surface, boolean isRecordable);

}