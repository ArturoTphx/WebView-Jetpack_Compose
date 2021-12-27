package com.example.webview.main

import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.webview.R
import com.example.webview.presentation.components.CustomButton
import com.example.webview.presentation.components.CustomTextField
import com.example.webview.ui.theme.WebViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebViewTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {

        val siteName = rememberSaveable { mutableStateOf("")}
        var isSearching by remember { mutableStateOf(false) }

        Box(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.surface)
            ) {
                if ( isSearching ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Row(modifier = Modifier
                            .weight(9f)
                        ) {
                            WebViewScreen(siteName = siteName.value)
                        }

                        CustomButton(
                            modifier = Modifier
                                .height(100.dp)
                                .padding(10.dp),
                            text = stringResource(R.string.back),
                            onClick = { isSearching = !isSearching; siteName.value = ""}
                        )
                    }
                } else {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CustomTextField(
                            textFieldValue = siteName,
                            textLabel = stringResource(R.string.site_name),
                            keyboardType = KeyboardType.Uri,
                            keyboardActions = KeyboardActions(
                                onDone = { isSearching = !isSearching}
                            ),
                            imeAction = ImeAction.Done
                        )

                        Spacer(modifier = Modifier.height(15.dp))

                        CustomButton(
                            text = stringResource(R.string.search),
                            onClick = { isSearching = !isSearching }
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun WebViewScreen(siteName: String) {
        AndroidView(factory = { context->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = WebViewClient()
                loadUrl("http://www.${siteName}.com")
            }
        }, update = { webView->
            webView.loadUrl("http://www.${siteName}.com")
        })
    }

}