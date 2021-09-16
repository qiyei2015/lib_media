package com.qiyei.android.media.lib.codec;

import com.qiyei.android.media.api.IEncoder;

public abstract class AbsEncoder implements IEncoder {


    protected long prevOutputPTSUs;

//    protected long getPTSUs() {
//        long result = System.nanoTime() / 1000L;
//        // presentationTimeUs should be monotonic
//        // otherwise muxer fail to write
//        if (result < prevOutputPTSUs)
//            result = (prevOutputPTSUs - result) + result;
//        return result;
//    }

    protected long getPTSUs() {
        return System.currentTimeMillis();
    }
}
