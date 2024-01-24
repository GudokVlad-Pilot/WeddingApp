package com.example.weddingself.navigation

import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

/**This file consists of composable function which will display the video in the created video player
 * the user of the app can control the media in the player*/
@Composable
fun VideoPlayer(
  videoUri: Uri
) {
    AndroidView(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .border(
                BorderStroke(2.dp, Color(0xFFC9CBD5)),
                RoundedCornerShape(16.dp)
            ),
        factory = { context ->
        VideoView(context).apply {
            setVideoURI(videoUri)

            val mediaController = MediaController(context)
            mediaController.setAnchorView(this)

            setMediaController(mediaController)


            setOnPreparedListener {
//                start()
            }
        }
    })
}