/**
 *  GodMode
 *  alaric.norris.core.library.oxlog
 *  Function:       GodMode
 *  date            author
 *  *****************************************************
 *  2015/10/30         AlaricNorris
 *  Copyright (c) 2015, TNT All Rights Reserved.
 */
package com.alaric.norris.aars.bulltip;

import android.support.annotation.IntDef;
/**
 ClassName:      GodMode
 Function:       GodMode is a class that can enable/disable the OxLog to Log or not.
 Contact:        Norris.sly@gmail.com
 @author AlaricNorris
 @version Ver 1.0
 @since I used to be a programmer like you, then I took an arrow in the knee
  ***************************************************************************************************
 Modified By     AlaricNorris     2015/10/30    10:01
 Modifications:  init
 ***************************************************************************************************
 */
public class GodMode {
    /**
     * In any case, GodMode need tip
     */
    public static final int ZEUS_ENABLE_ALL = 0x8888;
    /**
     * Despite the Mutable, GodMode need tip
     */
    public static final int ZEUS_ENABLE_ALL_BUT_MUTE = 0x4444;
    /**
     * In any case, GodMode doesn't need tip
     */
    public static final int ZEUS_DISABLE_ALL = ~ 0x8888;
    @Mode
    public int Mode;

    public GodMode ( @Mode int mode ) {
        Mode = mode;
    }
    @IntDef ( { ZEUS_ENABLE_ALL , ZEUS_ENABLE_ALL_BUT_MUTE , ZEUS_DISABLE_ALL } )
    public @interface Mode {}
}
