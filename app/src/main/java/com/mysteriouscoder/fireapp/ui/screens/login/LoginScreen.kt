package com.mysteriouscoder.fireapp.ui.screens.login




import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.fireapp.R
import com.mysteriouscoder.fireapp.ui.theme.Purple40
import com.mysteriouscoder.fireapp.ui.theme.Purple80


@Composable
fun LoginScreen(

    state: LoginUiState=LoginUiState(),
    onEvent: (LoginEvent)->Unit ={}


){

}

//
//@Composable
//fun LoginScreen(navHostController: NavHostController) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                Brush.verticalGradient(
//                    colors = listOf(
//                        MaterialTheme.colorScheme.primary.copy(alpha = .4f),
//                        MaterialTheme.colorScheme.primary.copy(alpha = .2f)
//
//                    )
//                )
//            )
//    ) {
//        Spacer(modifier = Modifier.height(120.dp))
//
//        App_icon_component()
//        Spacer(modifier = Modifier.height(30.dp))
//        Text(
//            text = "Fire App",
//            style = MaterialTheme.typography.headlineMedium,
//            fontFamily = FontFamily.Serif,
////            color = Color.White,
//            fontWeight = FontWeight.Bold
//        )
//        Spacer(modifier = Modifier.height(30.dp))
//
//        var email by remember { mutableStateOf("") }
//        var password by remember { mutableStateOf("") }
//        UserInputField(
//            onValueChange = {email=it},
//            value = email
//        )
//        PasswordInput(
//            label = "Password",
//            icon = Icons.Default.Lock,
//            isfocused = false,
//            onValueChange = {password=it},
//            value = password
//        )
//
//        Button(
//            onClick = {
//
//
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(26.dp, 0.dp)
//                .padding(top = 22.dp)
//                .height(56.dp),
//            colors = ButtonDefaults
//                .buttonColors(
//                    containerColor =
//                    if (isSystemInDarkTheme()) Purple40 else Purple80,
//                    contentColor = Color.White
//                )
//
//        ) {
//            Text(
//                text = "Sign In",
//                fontSize = 16.sp,
//                fontWeight = FontWeight.Bold
//            )
//
//        }
//
//        Spacer(modifier =Modifier.weight(1f) )
//        Row(
//
//        ) {
//            Text(
//                text = "Don't have an account?",
//                fontWeight = FontWeight.Medium,
//                color=MaterialTheme.colorScheme.onSurface.copy(alpha=.8f))
//
//
//            Text(
//                text = "Sign Up",
//                modifier = Modifier
//                    .padding(start = 3.dp)
//                    .clickable {
////                        navHostController.navigate(Navigationitems.acountCreateScreen.route)
//
//                    },
//                fontWeight = FontWeight.Bold,
//                color =  if (isSystemInDarkTheme()) Purple40 else Purple80
//
//            )

//
//        }
//        Spacer(modifier = Modifier.height(60.dp))
//
//    }
//}
//
//@Preview(showSystemUi = true)
//@Composable
//fun LoginScreenprev() {
//
//    LoginScreen(rememberNavController())
//
//
//
//}
//
//@Composable
//fun App_icon_component() {
//
//    Image(
//        painter = painterResource(id = R.drawable.appicon), contentDescription = "",
//        modifier = Modifier
//            .size(130.dp)
//            .clip(CircleShape)
//
//            .border(2.dp, Color.Yellow, shape = CircleShape),
//
//        )
//
//}
//
//@Composable
//fun UserInputField(
//    label: String = "Email",
//    icon: ImageVector = Icons.Default.Email,
//    value: String = "",
//    onValueChange: (String) -> Unit = {},
//    isfocused: Boolean = false,
//    modifier: Modifier = Modifier,
//) {
//
//
//    OutlinedTextField(
//
//        singleLine = true,
//        keyboardOptions =
//        if (Icons.Default.PhoneAndroid == icon) {
//            KeyboardOptions(keyboardType = KeyboardType.Number)
//
//        } else {
//            KeyboardOptions(keyboardType = KeyboardType.Text)
//        }
//        ,
//
//        value = value,
//        onValueChange = onValueChange,
//        label = {
//            Text(
//                text = label,
//                color = if (isfocused) Color.Blue else Color.Black
//            )
//        },
//        leadingIcon = {
//            Icon(
//                icon,
//                contentDescription = null,
//                modifier = Modifier
//                    .padding(start = 24.dp)
//                    .padding(end = 8.dp),
////                tint = if (isfocused) Color.Blue else Color.Gray
//            )
//        },
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(25.dp, 10.dp)
////            .clip(RoundedCornerShape(132.dp)),
//
//
//
//        )
//}
//
//
//@Composable
//fun PasswordInput(
//    label: String = "Email",
//    icon: ImageVector = Icons.Default.Email,
//    value: String = "",
//    onValueChange: (String) -> Unit = {},
//    isfocused: Boolean = false,
//    modifier: Modifier = Modifier,
//) {
//
//
//    val passwordVisible = remember {
//        mutableStateOf(false)
//    }
//
//
//    OutlinedTextField(
//
//        singleLine = true,
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
//
//
//        value = value,
//        onValueChange = onValueChange,
//        label = {
//            Text(
//                text = label,
//                color = if (isfocused) Color.Blue else Color.Black
//            )
//        },
//        leadingIcon = {
//            Icon(
//                icon,
//                contentDescription = null,
//                modifier = Modifier
//                    .padding(start = 24.dp)
//                    .padding(end = 8.dp),
////                tint = if (isfocused) Color.Blue else Color.Gray
//            )
//        },
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(25.dp, 10.dp),
//
//
//        trailingIcon = {
//
//
//            val iconImage = if (passwordVisible.value) {
//                Icons.Filled.Visibility
//            } else {
//                Icons.Filled.VisibilityOff
//            }
//
//            var description = if (passwordVisible.value) {
//                stringResource(id = R.string.hidepassword)
//            } else {
//                stringResource(id = R.string.showpassword)
//            }
//
//            IconButton(onClick = {
//                passwordVisible.value = !passwordVisible.value
//            }) {
//
//                Icon(
//                    imageVector = iconImage,
//                    contentDescription = description
//                )
//            }
//
//        },
//        visualTransformation =
//        if (passwordVisible.value ) VisualTransformation.None
//        else
//            PasswordVisualTransformation()
//    )
//}


//3 20