package cc.aoeiuv020.panovel.local

import java.io.File

/**
 * 调用parse方法解析后能拿出其他数据，
 *
 * Created by AoEiuV020 on 2018.06.15-19:06:15.
 */
abstract class LocalNovelParser(
        protected val file: File
) : ContentProvider {

    abstract fun parse(): LocalNovelInfo
}