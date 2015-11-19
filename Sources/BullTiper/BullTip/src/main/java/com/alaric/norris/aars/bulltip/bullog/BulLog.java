/**
 *  BulLog
 *  com.alaric.norris.aars.bulltip.bullog
 * 	Function:       BulLog
 *  date            author
 *  *****************************************************
 *  2015/10/29      AlaricNorris
 *  Copyright (c) 2015, TNT All Rights Reserved.
 */
package com.alaric.norris.aars.bulltip.bullog;

import android.support.annotation.NonNull;
import android.util.Log;

import com.alaric.norris.aars.bulltip.Zeus;

/**
 ClassName:      BulLog
 Function:       BulLog
 Contact:        Norris.sly@gmail.com
 @author AlaricNorris
 @version Ver 1.0
 @since I used to be a programmer like you, then I took an arrow in the knee
  ****************************************************************************************************
 Modified By     AlaricNorris     2015/11/19    11:01
 Modifications:  ${TODO}
 ***************************************************************************************************
 */
public class BulLog {

    @NonNull
    public static BullogConfig mConfig =
            new BullogConfig.Builder( true, BullogConfig.TIP_STRATEGY_DEBUG_ONLY ).defaultTag(
                    BullogConfig.OX_TAG
            ).defaultSuffix(
                    BullogConfig.OX_SUFFIX
            ).releaseSwitcher(
                    false
            ).build().muteSuffix( "" ).deMute();
    /**
     * private constructor
     */
    private BulLog () {
        /* cannot be instantiated */
        throw new UnsupportedOperationException( "OxLog class cannot be instantiated" );
    }
    // Smart way to Log V
    public static void v ( String logInfo ) {
        v( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    public static void v ( String logInfo, String tagSuffix ) {
        v( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    public static void v ( String logInfo, int inStrategy ) {
        v( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    public static void v ( String logInfo, String tagSuffix, int inStrategy ) {
        if ( mConfig.getZeus() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getZeus().Mode) {
                case Zeus.ZEUS_ENABLE_ALL:
                    Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.v( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_DISABLE_ALL:
                    return;
            }
    }

    // Smart way to Log D
    public static void d ( String logInfo ) {
        d( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    public static void d ( String logInfo, String tagSuffix ) {
        d( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    public static void d ( String logInfo, int inStrategy ) {
        d( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    public static void d ( String logInfo, String tagSuffix, int inStrategy ) {
        if ( mConfig.getZeus() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getZeus().Mode) {
                case Zeus.ZEUS_ENABLE_ALL:
                    Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.d( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_DISABLE_ALL:
                    return;
            }
    }
    // Smart way to Log I
    public static void i ( String logInfo ) {
        i( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    public static void i ( String logInfo, String tagSuffix ) {
        i( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    public static void i ( String logInfo, int inStrategy ) {
        i( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    public static void i ( String logInfo, String tagSuffix, int inStrategy ) {
        if ( mConfig.getZeus() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getZeus().Mode) {
                case Zeus.ZEUS_ENABLE_ALL:
                    Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.i( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_DISABLE_ALL:
                    return;
            }
    }

    // Smart way to Log W
    public static void w ( String logInfo ) {
        w( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    public static void w ( String logInfo, String tagSuffix ) {
        w( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    public static void w ( String logInfo, int inStrategy ) {
        w( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    public static void w ( String logInfo, String tagSuffix, int inStrategy ) {
        if ( mConfig.getZeus() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getZeus().Mode) {
                case Zeus.ZEUS_ENABLE_ALL:
                    Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.w( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_DISABLE_ALL:
                    return;
            }
    }

    // Smart way to Log E
    public static void e ( String logInfo ) {
        e( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    public static void e ( String logInfo, String tagSuffix ) {
        e( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    public static void e ( String logInfo, int inStrategy ) {
        e( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    public static void e ( String logInfo, String tagSuffix, int inStrategy ) {
        if ( mConfig.getZeus() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getZeus().Mode) {
                case Zeus.ZEUS_ENABLE_ALL:
                    Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case Zeus.ZEUS_DISABLE_ALL:
                    return;
            }
    }
}
