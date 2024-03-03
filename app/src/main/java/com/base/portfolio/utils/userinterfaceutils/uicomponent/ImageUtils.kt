package com.base.portfolio.utils.userinterfaceutils.uicomponent

import android.content.Context
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.base.portfolio.utils.apputils.RealPathUtil
import id.zelory.compressor.Compressor
import id.zelory.compressor.constraint.quality
import id.zelory.compressor.constraint.resolution
import id.zelory.compressor.constraint.size
import kotlinx.coroutines.launch
import java.io.File

object ImageUtils {
    @Composable
    fun rememberGalleryLauncher(
        context: Context
    ): ActivityResultLauncher<String> {
        val coroutineScope = rememberCoroutineScope()

        return rememberLauncherForActivityResult(
            contract = ActivityResultContracts.GetContent(),
            onResult = { uri: Uri? ->
                uri?.let {

                    val path = RealPathUtil.getRealPath(context, uri)
                    val file = File(path)
                    var compressedFile = file
//                             compressedFile = compressProfileImage(file, context)

                    coroutineScope.launch {
//                        postProfilePicture(context, compressProfileImage(file, context), uri)
                    }
                }
            }
        )
    }

    suspend fun compressProfileImage(file: File, context: Context): File {
        val compressedImageFile = Compressor.compress(context, file) {
            resolution(1280, 720)
            quality(80)
//                format(Bitmap.CompressFormat.JPEG)
            size(2_097_152) // 2 MB
        }

        return compressedImageFile
    }
}