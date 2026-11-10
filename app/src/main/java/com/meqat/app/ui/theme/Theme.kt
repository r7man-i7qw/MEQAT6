
package com.meqat.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val MeqatLightColors = lightColorScheme(
    primary = SageGreen,
    onPrimary = PureWhite,
    secondary = MutedGold,
    onSecondary = Charcoal,
    background = Ivory,
    onBackground = Charcoal,
    surface = PureWhite,
    onSurface = Charcoal
)

@Composable
fun MeqatTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MeqatLightColors,
        content = content
    )
}
