package com.example.cj.videoeditor.media;

import android.media.MediaExtractor;

/**
 * desc 音频解码的info类 包含了音频path 音频的MediaExtractor
 */

public class MediaCodecInfo {
    public String path;
    public MediaExtractor extractor;
    public int cutPoint;
    public int cutDuration;
    public int duration;
}
