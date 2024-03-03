package com.base.portfolio.utils.userinterfaceutils.uicomponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.base.portfolio.R
import com.base.portfolio.theme.theme.BlackColor
import com.base.portfolio.theme.theme.BorderStokeColor
import com.base.portfolio.theme.theme.Primary30Color
import com.base.portfolio.theme.theme.PrimaryColor
import com.base.portfolio.theme.theme.WhiteColor
import com.base.portfolio.theme.theme.PrimaryTextColor
import com.base.portfolio.theme.theme.SecondaryDarkColor
import com.base.portfolio.theme.theme.SecondaryTextColor
import com.base.portfolio.theme.theme.typography.MyTypography
import com.base.portfolio.utils.userinterfaceutils.addColon
import com.base.portfolio.utils.userinterfaceutils.addComma
import com.base.portfolio.utils.userinterfaceutils.addDotWithExclamation
import com.base.portfolio.utils.userinterfaceutils.addQuestionMark
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.TitleTextWithCommaAndExclamation
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.TitleTextWithInputBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyBasicText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyButtonTextLarge
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyButtonTextSmall
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyDisabledTextInputField
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyDisabledTrailingIconInputField
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyEmailInputBoxSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyFormText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyHeadlineText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyIconTextInputField
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyInputText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyNameAndValue
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyPasswordInputBoxSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyPasswordInputTextField
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyPhoneNumberInputBoxSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyQuestionMarkTxtWithPrimaryTxt
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MySimpleTextInputField
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithDisabledInputBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithInputTextSet
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTitleWithSimpleInputBox
import com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent.MyTopBarTitleText
import com.base.portfolio.utils.userinterfaceutils.uicomponent.UIComponents.MyDropDownView

/**
 * Reusable TextStyle Components sMyh as Title Text, Button Text
 * user is currently using in the application.
 *
 * @author Shweta Fulzele
 */
object TextStyleComponent {

    /**
     * Text displayed upon User Input Box
     * Body 5 Regular
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyFormText(
        modifier: Modifier = Modifier,
        text: Any,
        textColor: Color = PrimaryTextColor,
        textAlign: TextAlign = TextAlign.Center
    ) {
        Text(
            text = "$text",
            style = TextStyle(
                fontFamily = MyTypography.body5Regular.fontFamily,
                fontSize = MyTypography.body5Regular.fontSize,
                letterSpacing = MyTypography.body5Regular.letterSpacing,
                fontWeight = MyTypography.body5Regular.fontWeight,
                lineHeight = MyTypography.body5Regular.lineHeight,
                textAlign = textAlign
            ),
            color = textColor,
            modifier = modifier.wrapContentSize()
        )
    }

    /**
     * Text displayed upon User Input Box
     * Body 5 Regular
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyBasicText(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Center,
        textColor: Color = PrimaryTextColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.body5Medium.fontFamily,
                fontSize = MyTypography.body5Medium.fontSize,
                letterSpacing = MyTypography.body5Medium.letterSpacing,
                fontWeight = MyTypography.body5Medium.fontWeight,
                lineHeight = MyTypography.body5Medium.lineHeight
            ),
            color = textColor,
            modifier = modifier.wrapContentSize(),
            textAlign = textAlign
        )
    }

    /**
     * Text displayed as Title
     * Title Text with h5
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyTitleText(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Center,
        textColor: Color = PrimaryTextColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.h5.fontFamily,
                fontSize = MyTypography.h5.fontSize,
                letterSpacing = MyTypography.h5.letterSpacing,
                fontWeight = MyTypography.h5.fontWeight,
                lineHeight = MyTypography.h5.lineHeight
            ),
            color = textColor,
            modifier = modifier.wrapContentSize(),
            textAlign = textAlign
        )
    }

    /**
     * Text displayed as Title
     * Sub Title Text with h3
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MySubTitleText(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Center,
        textColor: Color = PrimaryTextColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.h4.fontFamily,
                fontSize = MyTypography.h4.fontSize,
                letterSpacing = MyTypography.h4.letterSpacing,
                fontWeight = MyTypography.h4.fontWeight,
                lineHeight = MyTypography.h4.lineHeight
            ),
            color = textColor,
            modifier = modifier.wrapContentSize(),
            textAlign = textAlign
        )
    }

    /**
     * Text displayed inside User Input Box
     * Title 3 Medium
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyInputText(
        modifier: Modifier = Modifier,
        text: String,
        textColor: Color = SecondaryTextColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight
            ),
            color = textColor,
            modifier = modifier.wrapContentSize()
        )
    }


    /**
     * Title Text displayed as Headline on a screen
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyHeadlineText(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Start,
        textColor: Color = SecondaryTextColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.h6.fontFamily,
                fontSize = MyTypography.h6.fontSize,
                letterSpacing = MyTypography.h6.letterSpacing,
                fontWeight = MyTypography.h6.fontWeight,
                lineHeight = MyTypography.h6.lineHeight,
                textAlign = textAlign
            ),
            color = textColor,
            modifier = modifier.wrapContentSize()
        )
    }


    /**
     * Title Text displayed on Top Bar as Headline
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyTopBarTitleText(
        modifier: Modifier = Modifier,
        text: String,
        textAlign: TextAlign = TextAlign.Start,
        textColor: Color = SecondaryTextColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.body2.fontFamily,
                fontSize = MyTypography.body2.fontSize,
                letterSpacing = MyTypography.body2.letterSpacing,
                fontWeight = MyTypography.body2.fontWeight,
                lineHeight = MyTypography.body2.lineHeight,
                textAlign = textAlign
            ),
            color = textColor,
            modifier = modifier.wrapContentSize()
        )
    }

    /**
     * Button Text Small Size displayed as Text on Buttons
     * Also used as Text as Buttons
     * Example: Remember me, Forgot Password
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyButtonTextSmall(
        modifier: Modifier = Modifier,
        text: String,
        textColor: Color = WhiteColor
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontFamily = MyTypography.buttonSmall.fontFamily,
                fontSize = MyTypography.buttonSmall.fontSize,
                letterSpacing = MyTypography.buttonSmall.letterSpacing,
                fontWeight = MyTypography.buttonSmall.fontWeight,
                lineHeight = MyTypography.buttonSmall.lineHeight
            ),
            color = textColor,
            modifier = modifier.wrapContentSize()
        )
    }

    /**
     * Button Text Large Size displayed as Text on Buttons
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyButtonTextLarge(
        modifier: Modifier = Modifier,
        text: String,
        textStyle: TextStyle = TextStyle(
            fontFamily = MyTypography.buttonCTALarge.fontFamily,
            fontSize = MyTypography.buttonCTALarge.fontSize,
            letterSpacing = MyTypography.buttonCTALarge.letterSpacing,
            fontWeight = MyTypography.buttonCTALarge.fontWeight,
            lineHeight = MyTypography.buttonCTALarge.lineHeight
        ),
        textColor: Color = WhiteColor
    ) {
        Text(
            text = text,
            style = textStyle,
            color = textColor,
            modifier = modifier.wrapContentSize()
        )
    }

    /**
     * Input text box with curve border and Icon on Start
     * User can enter test as input
     *
     * @author Shweta Fulzele
     */
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyIconTextInputField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String,
        leadingIcon: ImageVector = Icons.Outlined.AccountCircle,
        iconTint: Color = WhiteColor,
        shape: Shape = RoundedCornerShape(8.dp),
        backgroundColor: Color = Color.Transparent,
        borderColor: Color = BorderStokeColor,
        borderWidth: Dp = 1.dp,
        singleLine: Boolean = true,
        contentDescIcon: String,
        keyboardOptions: KeyboardOptions,
        textStyle: TextStyle
    ) {
        var error by remember {
            mutableStateOf(false)
        }
        TextField(
            value = value,
            onValueChange = {
                onValueChange(it)
                error = it.isBlank()
            },
            leadingIcon = {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = contentDescIcon,
                    tint = iconTint
                )
            },
            modifier = modifier
                .border(
                    border = BorderStroke(
                        borderWidth,
                        borderColor
                    ),
                    shape = shape
                )
                .wrapContentHeight()
                .fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = backgroundColor
            ),
            textStyle = textStyle,
            singleLine = singleLine,
            placeholder = {
                MyInputText(text = hint, textColor = WhiteColor)
            },
            keyboardOptions = keyboardOptions, keyboardActions = KeyboardActions()
        )
    }

    /**
     * Simple Input text box with corner border
     * User can enter test as input
     *
     * @author Shweta Fulzele
     */
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MySimpleTextInputField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String,
        shape: Shape = RoundedCornerShape(8.dp),
        backgroundColor: Color = Color.Transparent,
        borderColor: Color = BorderStokeColor,
        borderWidth: Dp = 1.dp,
        singleLine: Boolean = true,
        keyboardOptions: KeyboardOptions,
        textStyle: TextStyle
    ) {
        var error by remember {
            mutableStateOf(false)
        }
        TextField(
            value = value,
            onValueChange = {
                onValueChange(it)
                error = it.isBlank()
            },
            modifier = modifier
                .border(
                    border = BorderStroke(
                        borderWidth,
                        borderColor
                    ),
                    shape = shape
                )
                .wrapContentHeight()
                .fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                containerColor = backgroundColor
            ),
            textStyle = textStyle,
            singleLine = singleLine,
            placeholder = {
                MyInputText(text = hint, textColor = WhiteColor)
            },
            keyboardOptions = keyboardOptions, keyboardActions = KeyboardActions()
        )
    }

    @Composable
    fun MyTitleWithSimpleInputBox(
        title: String,
        value: String,
        hint: String,
        textColor: Color = PrimaryTextColor,
        borderColor: Color = PrimaryTextColor,
        onValueChange: (String) -> Unit
    ) {
        TitleTextWithInputBox(titleText = title, textColor = textColor) {
            MySimpleTextInputField(
                value = value,
                onValueChange = onValueChange,
                hint = hint,
                borderColor = borderColor,
                modifier = Modifier.padding(bottom = 8.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                textStyle = TextStyle(
                    fontFamily = MyTypography.title3Medium.fontFamily,
                    fontSize = MyTypography.title3Medium.fontSize,
                    letterSpacing = MyTypography.title3Medium.letterSpacing,
                    fontWeight = MyTypography.title3Medium.fontWeight,
                    lineHeight = MyTypography.title3Medium.lineHeight,
                    color = SecondaryTextColor
                )
            )
        }
    }

    @Composable
    fun MyTitleWithDropDownInputBox(
        title: String,
        hint: String,
        textColor: Color = PrimaryTextColor,
        borderColor: Color = PrimaryTextColor,
        inputTextColor: Color = SecondaryTextColor,
        dropDownList: List<String>
    ) {
        TitleTextWithInputBox(titleText = title, textColor = textColor) {
            MyDropDownView(dropdownList = dropDownList, hint = hint, borderColor = borderColor, inputTextColor = inputTextColor)
        }
    }

    /**
     * Disabled Input text box with corner border
     * User cannot edit input
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyDisabledTextInputField(
        modifier: Modifier = Modifier,
        value: Any,
        shape: Shape = RoundedCornerShape(8.dp),
        backgroundColor: Color = WhiteColor,
        borderColor: Color = BorderStokeColor,
        borderWidth: Dp = 1.dp,
        textColor: Color = SecondaryTextColor,
        textAlign: TextAlign = TextAlign.Start
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(backgroundColor)
                .shadow(0.dp, shape = shape)
                .border(width = borderWidth, shape = shape, color = borderColor)
        ) {

            MyFormText(
                text = value,
                textColor = textColor,
                textAlign = textAlign,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
            )
        }
    }


    @Composable
    fun MyTitleWithDisabledInputBox(
        title: String,
        textColor: Color = PrimaryTextColor,
        borderColor: Color = PrimaryColor,
        inputTextColor: Color = SecondaryDarkColor,
        value: Any
    ) {
        TitleTextWithInputBox(titleText = title, textColor = textColor) {
            MyDisabledTextInputField(
                value = value,
                modifier = Modifier.padding(bottom = 8.dp),
                borderColor = borderColor,
                textColor = inputTextColor
            )
        }
    }

    /**
     * Disabled Input text box with Trailing Icon
     * User cannot edit input
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyDisabledTrailingIconInputField(
        modifier: Modifier = Modifier,
        title: Any,
        shape: Shape = RoundedCornerShape(8.dp),
        backgroundColor: Color = WhiteColor,
        borderColor: Color = BorderStokeColor,
        borderWidth: Dp = 1.dp,
        textColor: Color = SecondaryTextColor,
        textAlign: TextAlign = TextAlign.Start,
        trailingIcon: ImageVector,
        trailingIconColor: Color = BlackColor,
        contentDesc: String
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(backgroundColor)
                .shadow(0.dp, shape = shape)
                .border(width = borderWidth, shape = shape, color = borderColor)
        ) {

            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MyFormText(
                    text = title,
                    textColor = textColor,
                    textAlign = textAlign,
                )

                Icon(
                    imageVector = trailingIcon,
                    contentDescription = contentDesc,
                    tint = trailingIconColor
                )
            }

        }
    }


    /**
     * Disabled Input text box with Title and DropDown Icon
     * User cannot edit input
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyTitleWithDisabledInputBoxDropDownIcon(
        title: String,
        textColor: Color = PrimaryTextColor,
        trailingIconColor: Color = PrimaryColor,
        inputTextColor: Color = SecondaryDarkColor,
        borderColor: Color = Primary30Color,
        value: Any
    ) {
        TitleTextWithInputBox(titleText = title, textColor = textColor) {
            MyDisabledTrailingIconInputField(
                title = value,
                trailingIcon = Icons.Outlined.KeyboardArrowDown,
                contentDesc = "User Gender",
                trailingIconColor = trailingIconColor,
                borderColor = borderColor,
                textColor = inputTextColor
            )

        }
    }

    /**
     * Disabled Input text box with Title and Trailing Icon
     * User cannot edit input
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyTitleWithDisabledInputBoxWithTrailingIcon(
        title: String,
        value: Any,
        textColor: Color = PrimaryTextColor,
        borderColor: Color = Primary30Color,
        inputTextColor: Color = SecondaryDarkColor,
        onClick: () -> Unit
    ) {
        TitleTextWithInputBox(titleText = title, textColor = textColor) {
            MyDisabledTrailingIconInputField(
                title = value,
                trailingIcon = Icons.Outlined.CalendarMonth,
                contentDesc = "User Date of Birth",
                borderColor = borderColor,
                textColor = inputTextColor
            )
        }
    }

    /**
     * Password as Input
     *
     * @author Shweta Fulzele
     */
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MyPasswordInputTextField(
        modifier: Modifier = Modifier,
        value: String = "",
        onValueChange: (String) -> Unit,
        placeholder: String = stringResource(id = R.string.password),
        textStyle: TextStyle,
        backgroundColor: Color = Color.Transparent,
        borderColor: Color = BorderStokeColor,
        borderWidth: Dp = 1.dp,
        shape: Shape = RoundedCornerShape(8.dp),
        leadingIcon: ImageVector = Icons.Outlined.Lock,
        iconTint: Color = WhiteColor,
        singleLine: Boolean = false,
        cursorColor: Color = BlackColor,
        keyboardOptions: KeyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            autoCorrect = false
        ),
        contentDescIcon: String = "Password Icon"
    ) {
        val passVisible = remember {
            mutableStateOf(false)
        }
        val keyboardController = LocalSoftwareKeyboardController.current
        val focusManager = LocalFocusManager.current

        OutlinedTextField(
            keyboardActions = KeyboardActions(onAny = {
                keyboardController?.hide()
                focusManager.clearFocus(true)
            }),
            value = value, onValueChange = onValueChange,
            placeholder = { MyInputText(text = placeholder, textColor = WhiteColor) },
            keyboardOptions = keyboardOptions,
            singleLine = singleLine,
            textStyle = textStyle,
            shape = shape,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = backgroundColor,
                focusedIndicatorColor = WhiteColor,
                focusedLabelColor = WhiteColor,
                unfocusedIndicatorColor = WhiteColor,
                unfocusedLabelColor = WhiteColor,
                cursorColor = cursorColor,
                focusedTextColor = SecondaryTextColor,
            ),
            modifier = modifier
                .border(
                    border = BorderStroke(borderWidth, borderColor),
                    shape = shape
                ),
            visualTransformation = if (!passVisible.value) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            trailingIcon = {
                Icon(
                    imageVector = if (!passVisible.value) {
                        Icons.Outlined.VisibilityOff
                    } else {
                        Icons.Outlined.Visibility
                    }, contentDescription = contentDescIcon,
                    modifier = Modifier.clickable(
                        interactionSource = remember {
                            MutableInteractionSource()
                        },
                        indication = null
                    ) {
                        passVisible.value = !passVisible.value
                    }, tint = iconTint
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = contentDescIcon,
                    tint = iconTint
                )
            },

            )
    }

    /**
     * Title to any type od Input Text Field
     * User can enter data type as per above title
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun TitleTextWithInputBox(
        modifier: Modifier = Modifier,
        titleText: String,
        textColor: Color = PrimaryTextColor,
        inputTextBox: @Composable() () -> Unit
    ) {

        Box(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                MyFormText(
                    modifier = Modifier.padding(vertical = 8.dp),
                    text = titleText,
                    textColor = textColor
                )
                inputTextBox()
            }
        }
    }

    /**
     * OTP verification UI with custom number of input from the user
     *
     * @author Shweta Fulzele
     */

    @Composable
    fun MyQuestionMarkTxtWithPrimaryTxt(
        textWithQuestionMark: String,
        primaryText: String,
        onClick: () -> Unit
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clickable {
                    onClick
                }
        ) {

            MyFormText(
                text = textWithQuestionMark.addQuestionMark(),
                textColor = WhiteColor
            )

            Spacer(modifier = Modifier.width(8.dp))
            MyFormText(
                text = primaryText,
                textColor = SecondaryTextColor
            )
        }
    }

    /**
     * Text with Comma : Text,
     * Text with Exclamation : Text..!!
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun TitleTextWithCommaAndExclamation(
        modifier: Modifier = Modifier,
        textWithComma: String,
        textWithExclamation: String
    ) {
        Column(modifier = modifier.padding(vertical = 16.dp)) {
            MyHeadlineText(text = textWithComma.addComma())
            MyHeadlineText(text = textWithExclamation.addDotWithExclamation())
        }
    }

    /**
     * Email Input Text Box with Outline and leading email icon
     * User can Enter Email
     *
     * @author Shweta Fulzele
     */
    @Composable
    private fun MyInputEmailField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String = stringResource(id = R.string.email)
    ) {
        MyIconTextInputField(
            value = value,
            onValueChange = onValueChange,
            hint = hint,
            leadingIcon = Icons.Outlined.Email,
            contentDescIcon = "Email Icon",
            modifier = modifier
                .padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )
    }

    /**
     * Email Input Text Box with Email Title on Top
     * User can Enter Email in Input Text Box
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyEmailInputBoxSet(
        value: String,
        onValueChange: (String) -> Unit
    ) {
        TitleTextWithInputBox(
            titleText = stringResource(id = R.string.email_address),
            inputTextBox = {
                MyInputEmailField(
                    value = value,
                    onValueChange = onValueChange
                )
            })
    }
/////////////////////////----End of Email Input Field-----/////////////////////////////////////////////////////////////////////

/////////////////////////----Start of Phone Number Input Field-----/////////////////////////////////////////////////////////////////////

    /**
     * Phone Number Input Number Box with Outline and leading phone icon
     * User can Enter Phone Number
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    private fun MyPhoneInputField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String = stringResource(id = R.string.mobile_number),
    ) {
        MyIconTextInputField(
            value = value,
            onValueChange = onValueChange,
            hint = hint,
            leadingIcon = Icons.Outlined.Call,
            contentDescIcon = stringResource(id = R.string.mobile_number),
            modifier = modifier.padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )
    }


    /**
     * Phone Number title above Phone Input Text Box
     * User can Enter Phone number below Phone Title
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyPhoneNumberInputBoxSet(
        value: String,
        onValueChange: (String) -> Unit
    ) {
        TitleTextWithInputBox(
            titleText = stringResource(id = R.string.mobile_number),
            inputTextBox = {
                MyPhoneInputField(
                    value = value,
                    onValueChange = onValueChange
                )

            }
        )
    }

/////////////////////////----End of Phone Number Input Field-----/////////////////////////////////////////////////////////////////////

/////////////////////////----Start of First Name Input Field-----/////////////////////////////////////////////////////////////////////

    /**
     * Text Input Box with Outline and leading User icon
     * User can Enter Text as per Requirement
     *
     * @author Shweta Fulzele
     */
    @Composable
    private fun MyInputTextField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String,
        contentDesc: String,
    ) {
        MyIconTextInputField(
            value = value,
            onValueChange = onValueChange,
            hint = hint,
            leadingIcon = Icons.Outlined.AccountCircle,
            contentDescIcon = contentDesc,
            modifier = modifier.padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )
    }

    /**
     * Title Text above Input Text Box
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyTitleWithInputTextSet(
        title: String,
        value: String,
        contentDesc: String,
        hint: String,
        onValueChange: (String) -> Unit
    ) {
        TitleTextWithInputBox(
            titleText = title,
            inputTextBox = {
                MyInputTextField(
                    value = value,
                    onValueChange = onValueChange,
                    contentDesc = contentDesc,
                    hint = hint,
                )

            }
        )
    }

/////////////////////////----End of First Name Input Field-----/////////////////////////////////////////////////////////////////////


/////////////////////////----Start of Password Input Field-----/////////////////////////////////////////////////////////////////////

    /**
     * Password Input Text Box with
     * lock leading icon and password visibility and non-visibility trailing icon
     * User can Enter Password
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    private fun MyPasswordInputField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit
    ) {
        MyPasswordInputTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            value = value,
            onValueChange = onValueChange,
            placeholder = "**********",
            singleLine = true,
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            ),
            contentDescIcon = "Password Icon"
        )
    }


    /**
     * Password title above Password Input Text Box
     * User can Enter Password below Password Title
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyPasswordInputBoxSet(
        title: String = stringResource(id = R.string.password),
        value: String,
        onValueChange: (String) -> Unit
    ) {
        TitleTextWithInputBox(
            titleText = title,
            inputTextBox = {
                MyPasswordInputField(
                    value = value,
                    onValueChange = onValueChange
                )
            })
    }

    /**
     * Name : Value
     * Text with name : Text,
     * Text with value : Text
     *
     *
     * @author Shweta Fulzele
     */
    @Composable
    fun MyNameAndValue(name: String, value: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
        ) {

            Text(
                text = name.addColon(), modifier = Modifier.fillMaxWidth(0.5f),
                style = TextStyle(
                    fontFamily = MyTypography.body5Regular.fontFamily,
                    fontSize = MyTypography.body5Regular.fontSize,
                    letterSpacing = MyTypography.body5Regular.letterSpacing,
                    fontWeight = MyTypography.body5Regular.fontWeight,
                    lineHeight = MyTypography.body5Regular.lineHeight
                ),
                color = WhiteColor
            )

            Text(
                text = value, modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontFamily = MyTypography.body5Regular.fontFamily,
                    fontSize = MyTypography.body5Regular.fontSize,
                    letterSpacing = MyTypography.body5Regular.letterSpacing,
                    fontWeight = MyTypography.body5Regular.fontWeight,
                    lineHeight = MyTypography.body5Regular.lineHeight
                ),
                color = WhiteColor
            )
        }
    }
/////////////////////////----End of Password Input Field-----/////////////////////////////////////////////////////////////////////


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreviewTextStyleComponent() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        MyFormText(text = "MyFormText")
        MyBasicText(text = "MyBasicText")
        MyInputText(text = "MyInputText")
        MyHeadlineText(text = "MyHeadlineText")
        MyTopBarTitleText(text = "MyTopBarTitleText")
        MyButtonTextSmall(text = "MyButtonTextSmall")
        MyButtonTextLarge(text = "MyButtonTextLarge")
        MyIconTextInputField(
            value = "MyIconTextInputField",
            onValueChange = {},
            hint = "hint",
            leadingIcon = Icons.Outlined.Search,
            contentDescIcon = "contentDesc",
            modifier = Modifier.padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )

        MySimpleTextInputField(
            value = "MySimpleTextInputField",
            onValueChange = {},
            hint = "hint",
            modifier = Modifier.padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )

        MyTitleWithSimpleInputBox(
            title = "MyTitleWithSimpleInputBox",
            value = "",
            onValueChange = {}, hint = ""
        )

        MyDisabledTextInputField(value = "MyDisabledTextInputField")

        MyTitleWithDisabledInputBox(
            title = "MyTitleWithDisabledInputBox",
            value = "MyTitleWithDisabledInputBox"
        )

        MyDisabledTrailingIconInputField(
            title = "MyDisabledTrailingIconInputField",
            trailingIcon = Icons.Outlined.CalendarMonth,
            contentDesc = ""
        )

        MyPasswordInputTextField(
            value = "MyPasswordInputTextField",
            onValueChange = {},
            contentDescIcon = "contentDesc",
            modifier = Modifier.padding(bottom = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle(
                fontFamily = MyTypography.title3Medium.fontFamily,
                fontSize = MyTypography.title3Medium.fontSize,
                letterSpacing = MyTypography.title3Medium.letterSpacing,
                fontWeight = MyTypography.title3Medium.fontWeight,
                lineHeight = MyTypography.title3Medium.lineHeight,
                color = SecondaryTextColor
            )
        )

        TitleTextWithInputBox(
            titleText = "TitleTextWithInputBox",
            inputTextBox = {
                MyIconTextInputField(
                    value = "MyIconTextInputField",
                    onValueChange = {},
                    hint = "hint",
                    leadingIcon = Icons.Outlined.Search,
                    contentDescIcon = "contentDesc",
                    modifier = Modifier.padding(bottom = 8.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done
                    ),
                    textStyle = TextStyle(
                        fontFamily = MyTypography.title3Medium.fontFamily,
                        fontSize = MyTypography.title3Medium.fontSize,
                        letterSpacing = MyTypography.title3Medium.letterSpacing,
                        fontWeight = MyTypography.title3Medium.fontWeight,
                        lineHeight = MyTypography.title3Medium.lineHeight,
                        color = SecondaryTextColor
                    )
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        MyQuestionMarkTxtWithPrimaryTxt(
            textWithQuestionMark = "QuestionMarkText",
            primaryText = "Primary text"
        ) {

        }

        TitleTextWithCommaAndExclamation(
            textWithComma = "TextWithComma",
            textWithExclamation = "TextWithExcla"
        )

        MyEmailInputBoxSet(value = "EmailInputBox") {}
        MyPhoneNumberInputBoxSet(value = "PhoneNumberInputBox") {}
        MyTitleWithInputTextSet(
            value = "TitleWithInputTextSet",
            title = "Simple text",
            contentDesc = "",
            hint = ""
        ) {}

        MyPasswordInputBoxSet(value = "Password") {}

        MyNameAndValue(name = "Name", value = "Value")
    }
}