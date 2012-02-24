/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package org.appcelerator.titanium;

import android.app.Activity;


public class TiLifecycle
{
	public static final int LIFECYCLE_ON_START = 0;
	public static final int LIFECYCLE_ON_RESUME = 1;
	public static final int LIFECYCLE_ON_PAUSE = 2;
	public static final int LIFECYCLE_ON_STOP = 3;
	public static final int LIFECYCLE_ON_DESTROY = 4;

	public interface OnLifecycleEvent {
		
		/**
		 * Implementing classes should use this to receive native Android onStart life cycle event.
		 * @param activity the activity attached to this module.
		 */
		public void onStart(Activity activity);
		
		/**
		 * Implementing classes should use this to receive native Android onResume life cycle event.
		 * @param activity the activity attached to this module.
		 */
		public void onResume(Activity activity);
		
		/**
		 * Implementing classes should use this to receive native Android onPause life cycle event.
		 * @param activity the activity attached to this module.
		 */
		public void onPause(Activity activity);
		
		/**
		 * Implementing classes should use this to receive native Android onStop life cycle event.
		 * @param activity the activity attached to this module.
		 */
		public void onStop(Activity activity);
		
		/**
		 * Implementing classes should use this to receive native Android onDestroy life cycle event.
		 * @param activity the activity attached to this module.
		 */
		public void onDestroy(Activity activity);
	}

	public static void fireLifecycleEvent(Activity activity, OnLifecycleEvent listener, int which)
	{
		switch (which) {
			case LIFECYCLE_ON_START: listener.onStart(activity); break;
			case LIFECYCLE_ON_RESUME: listener.onResume(activity); break;
			case LIFECYCLE_ON_PAUSE: listener.onPause(activity); break;
			case LIFECYCLE_ON_STOP: listener.onStop(activity); break;
			case LIFECYCLE_ON_DESTROY: listener.onDestroy(activity); break;
		}
	}
}

