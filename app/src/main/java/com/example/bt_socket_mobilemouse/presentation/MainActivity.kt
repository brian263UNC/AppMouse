package com.example.bt_socket_mobilemouse.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bt_socket_mobilemouse.presentation.components.DeviceScreen
import com.example.bt_socket_mobilemouse.ui.theme.BT_Socket_MobileMouseTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BT_Socket_MobileMouseTheme {
                val viewModel = hiltViewModel<BluetoothViewModel>()
                val state by viewModel.state.collectAsState()

                Surface (
                    color = MaterialTheme.colorScheme.background
                ) {
                    DeviceScreen(
                        state = state,
                        onStartScan = viewModel::startScan,
                        onStopScan = viewModel::stopScan
                    )

                }
            }
        }
    }
}
