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

import com.alaric.norris.aars.bulltip.GodMode;

/**
 * ClassName:      BulLog
 * Function:       BulLog
 * Contact:        Norris.sly@gmail.com
 * @author AlaricNorris
 * @version Ver 1.0
 * @since I used to be a programmer like you, then I took an arrow in the knee
 * ****************************************************************************************************
 * Modified By     AlaricNorris     2015/11/19    11:01
 * Modifications:  ${TODO}
 * ***************************************************************************************************
 */
public class BulLog {

    /**
     * Default config
     */
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
        throw new UnsupportedOperationException( "BulLog class cannot be instantiated" );
    }
    /**
     * Smart way to Log V
     * @param logInfo   info to log
     */
    public static void v ( String logInfo ) {
        v( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log V
     * @param logInfo   info to log
     * @param tagSuffix tag suffix
     */
    public static void v ( String logInfo, String tagSuffix ) {
        v( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log V
     * @param logInfo       info to log
     * @param inStrategy    strategy to use
     */
    public static void v ( String logInfo, int inStrategy ) {
        v( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    /**
     * Smart way to Log V
     * @param logInfo       info to log
     * @param tagSuffix     tag suffix
     * @param inStrategy    strategy to use
     */
    public static void v ( String logInfo, String tagSuffix, int inStrategy ) {
        String mixedTag = mConfig.DefaultTag + tagSuffix;
        if ( mConfig.getGodMode() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.v( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.v( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.v( mixedTag, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.v( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.v( mixedTag, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getGodMode().Mode) {
                case GodMode.ZEUS_ENABLE_ALL:
                    Log.v( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.v( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_DISABLE_ALL:
                    return;
            }
    }

    /**
     * Smart way to Log D
     * @param logInfo   info to log
     */
    public static void d ( String logInfo ) {
        d( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log D
     * @param logInfo   info to log
     * @param tagSuffix tag suffix
     */
    public static void d ( String logInfo, String tagSuffix ) {
        d( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log D
     * @param logInfo       info to log
     * @param inStrategy    strategy to use
     */
    public static void d ( String logInfo, int inStrategy ) {
        d( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    /**
     * Smart way to Log D
     * @param logInfo       info to log
     * @param tagSuffix     tag suffix
     * @param inStrategy    strategy to use
     */
    public static void d ( String logInfo, String tagSuffix, int inStrategy ) {
        String mixedTag = mConfig.DefaultTag + tagSuffix;
        if ( mConfig.getGodMode() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.d( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.d( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.d( mixedTag, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.d( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.d( mixedTag, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getGodMode().Mode) {
                case GodMode.ZEUS_ENABLE_ALL:
                    Log.d( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.d( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_DISABLE_ALL:
                    return;
            }
    }
    /**
     * Smart way to Log I
     * @param logInfo   info to log
     */
    public static void i ( String logInfo ) {
        i( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log I
     * @param logInfo   info to log
     * @param tagSuffix tag suffix
     */
    public static void i ( String logInfo, String tagSuffix ) {
        i( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log I
     * @param logInfo       info to log
     * @param inStrategy    strategy to use
     */
    public static void i ( String logInfo, int inStrategy ) {
        i( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    /**
     * Smart way to Log I
     * @param logInfo       info to log
     * @param tagSuffix     tag suffix
     * @param inStrategy    strategy to use
     */
    public static void i ( String logInfo, String tagSuffix, int inStrategy ) {
        String mixedTag = mConfig.DefaultTag + tagSuffix;
        if ( mConfig.getGodMode() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.i( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.i( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.i( mixedTag, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.i( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.i( mixedTag, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getGodMode().Mode) {
                case GodMode.ZEUS_ENABLE_ALL:
                    Log.i( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.i( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_DISABLE_ALL:
                    return;
            }
    }

    /**
     * Smart way to Log W
     * @param logInfo   info to log
     */
    public static void w ( String logInfo ) {
        w( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log W
     * @param logInfo   info to log
     * @param tagSuffix tag suffix
     */
    public static void w ( String logInfo, String tagSuffix ) {
        w( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log W
     * @param logInfo       info to log
     * @param inStrategy    strategy to use
     */
    public static void w ( String logInfo, int inStrategy ) {
        w( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    /**
     * Smart way to Log W
     * @param logInfo       info to log
     * @param tagSuffix     tag suffix
     * @param inStrategy    strategy to use
     */
    public static void w ( String logInfo, String tagSuffix, int inStrategy ) {
        String mixedTag = mConfig.DefaultTag + tagSuffix;
        if ( mConfig.getGodMode() == null ) {
            if ( mConfig.isMatchMutable( tagSuffix ) )
                return;
            switch (inStrategy) {
                case BullogConfig.TIP_STRATEGY_DEBUG_ONLY:
                    if ( mConfig.BuildConfig_Debug )
                        Log.w( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_RELEASE_ONLY:
                    if ( ! mConfig.BuildConfig_Debug )
                        Log.w( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_SWITCHABLE_RELEASE:
                    if ( mConfig.BuildConfig_Debug )
                        Log.w( mixedTag, logInfo );
                    else if ( mConfig.isReleaseSwitcher() )
                        Log.w( mixedTag, logInfo );
                    return;
                case BullogConfig.TIP_STRATEGY_ALWAYS:
                    Log.w( mixedTag, logInfo );
                    return;

            }
        }
        else
            switch (mConfig.getGodMode().Mode) {
                case GodMode.ZEUS_ENABLE_ALL:
                    Log.w( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.w( mixedTag, logInfo );
                    return;
                case GodMode.ZEUS_DISABLE_ALL:
                    return;
            }
    }

    /**
     * Smart way to Log E
     * @param logInfo   info to log
     */
    public static void e ( String logInfo ) {
        e( logInfo, mConfig.DefaultSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log E
     * @param logInfo   info to log
     * @param tagSuffix tag suffix
     */
    public static void e ( String logInfo, String tagSuffix ) {
        e( logInfo, tagSuffix, mConfig.DefaultStrategy );
    }
    /**
     * Smart way to Log E
     * @param logInfo       info to log
     * @param inStrategy    strategy to use
     */
    public static void e ( String logInfo, int inStrategy ) {
        e( logInfo, mConfig.DefaultSuffix, inStrategy );
    }
    /**
     * Smart way to Log E
     * @param logInfo       info to log
     * @param tagSuffix     tag suffix
     * @param inStrategy    strategy to use
     */
    public static void e ( String logInfo, String tagSuffix, int inStrategy ) {
        if ( mConfig.getGodMode() == null ) {
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
            switch (mConfig.getGodMode().Mode) {
                case GodMode.ZEUS_ENABLE_ALL:
                    Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case GodMode.ZEUS_ENABLE_ALL_BUT_MUTE:
                    if ( mConfig.isMatchMutable( tagSuffix ) )
                        return;
                    Log.e( mConfig.DefaultTag + tagSuffix, logInfo );
                    return;
                case GodMode.ZEUS_DISABLE_ALL:
                    return;
            }
    }
}
