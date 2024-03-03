package com.base.portfolio.utils.userinterfaceutils.uicomponent;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.base.portfolio.R;
import com.base.portfolio.theme.theme.typography.MyTypography;

/**
 * Reusable TextStyle Components sMyh as Title Text, Button Text
 * user is currently using in the application.
 *
 * @author Shweta Fulzele
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ;\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016Jc\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001f\u0010 J}\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\bH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\'\u0010(J$\u0010)\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+H\u0007J;\u0010,\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b-\u0010.J;\u0010/\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b0\u0010\u000eJ\u00a1\u0001\u00101\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u00102\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u0002092\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b:\u0010;J8\u0010<\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+2\b\b\u0002\u00102\u001a\u00020\bH\u0003J1\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b>\u0010\u0016J>\u0010?\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u00102\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0003J\u0018\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0007J.\u0010B\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+H\u0007J.\u0010C\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+H\u0003J\u00b3\u0001\u0010D\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+2\b\b\u0002\u0010E\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020\f2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010F\u001a\u00020\f2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u00107\u001a\u00020\bH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bG\u0010HJ8\u0010I\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+2\b\b\u0002\u00102\u001a\u00020\bH\u0003J$\u0010J\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+H\u0007J&\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040OH\u0007J\u0085\u0001\u0010P\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u00102\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00105\u001a\u0002062\u0006\u00108\u001a\u0002092\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bQ\u0010RJ;\u0010S\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bT\u0010\u000eJ;\u0010U\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bV\u0010\u000eJC\u0010W\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bY\u0010ZJM\u0010[\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\\\u0010]JQ\u0010^\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040OH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b_\u0010`JQ\u0010a\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010X\u001a\u00020\f2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0cH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bd\u0010eJ<\u0010f\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+H\u0007JU\u0010g\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040+H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bh\u0010iJ;\u0010j\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bk\u0010\u000eJ\"\u0010l\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\b2\u0006\u0010n\u001a\u00020\bH\u0007JD\u0010o\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010q\u001a\r\u0012\u0004\u0012\u00020\u00040O\u00a2\u0006\u0002\brH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bs\u0010t\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006u"}, d2 = {"Lcom/base/portfolio/utils/userinterfaceutils/uicomponent/TextStyleComponent;", "", "()V", "MyBasicText", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textColor", "Landroidx/compose/ui/graphics/Color;", "MyBasicText-FFjenbQ", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;IJ)V", "MyButtonTextLarge", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "MyButtonTextLarge-g2O1Hgs", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;J)V", "MyButtonTextSmall", "MyButtonTextSmall-mxwnekA", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;J)V", "MyDisabledTextInputField", "value", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "borderColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "MyDisabledTextInputField-ietOq1Y", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/graphics/Shape;JJFJI)V", "MyDisabledTrailingIconInputField", "title", "trailingIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "trailingIconColor", "contentDesc", "MyDisabledTrailingIconInputField-Stn0UuQ", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/graphics/Shape;JJFJILandroidx/compose/ui/graphics/vector/ImageVector;JLjava/lang/String;)V", "MyEmailInputBoxSet", "onValueChange", "Lkotlin/Function1;", "MyFormText", "MyFormText-fXLI1ps", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;JI)V", "MyHeadlineText", "MyHeadlineText-FFjenbQ", "MyIconTextInputField", "hint", "leadingIcon", "iconTint", "singleLine", "", "contentDescIcon", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "MyIconTextInputField-glQ6XXk", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLandroidx/compose/ui/graphics/Shape;JJFZLjava/lang/String;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/ui/text/TextStyle;)V", "MyInputEmailField", "MyInputText", "MyInputText-mxwnekA", "MyInputTextField", "MyNameAndValue", "name", "MyPasswordInputBoxSet", "MyPasswordInputField", "MyPasswordInputTextField", "placeholder", "cursorColor", "MyPasswordInputTextField-qOAs8JY", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JJFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/vector/ImageVector;JZJLandroidx/compose/foundation/text/KeyboardOptions;Ljava/lang/String;)V", "MyPhoneInputField", "MyPhoneNumberInputBoxSet", "MyQuestionMarkTxtWithPrimaryTxt", "textWithQuestionMark", "primaryText", "onClick", "Lkotlin/Function0;", "MySimpleTextInputField", "MySimpleTextInputField-Rx1qByU", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/graphics/Shape;JJFZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/ui/text/TextStyle;)V", "MySubTitleText", "MySubTitleText-FFjenbQ", "MyTitleText", "MyTitleText-FFjenbQ", "MyTitleWithDisabledInputBox", "inputTextColor", "MyTitleWithDisabledInputBox-f1JAnFk", "(Ljava/lang/String;JJJLjava/lang/Object;)V", "MyTitleWithDisabledInputBoxDropDownIcon", "MyTitleWithDisabledInputBoxDropDownIcon-w8G5akk", "(Ljava/lang/String;JJJJLjava/lang/Object;)V", "MyTitleWithDisabledInputBoxWithTrailingIcon", "MyTitleWithDisabledInputBoxWithTrailingIcon-aQc6oBg", "(Ljava/lang/String;Ljava/lang/Object;JJJLkotlin/jvm/functions/Function0;)V", "MyTitleWithDropDownInputBox", "dropDownList", "", "MyTitleWithDropDownInputBox-aQc6oBg", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/util/List;)V", "MyTitleWithInputTextSet", "MyTitleWithSimpleInputBox", "MyTitleWithSimpleInputBox-BQnUqu0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLkotlin/jvm/functions/Function1;)V", "MyTopBarTitleText", "MyTopBarTitleText-FFjenbQ", "TitleTextWithCommaAndExclamation", "textWithComma", "textWithExclamation", "TitleTextWithInputBox", "titleText", "inputTextBox", "Landroidx/compose/runtime/Composable;", "TitleTextWithInputBox-9LQNqLg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", "app_developmentDebug"})
public final class TextStyleComponent {
    @org.jetbrains.annotations.NotNull
    public static final com.base.portfolio.utils.userinterfaceutils.uicomponent.TextStyleComponent INSTANCE = null;
    
    private TextStyleComponent() {
        super();
    }
    
    /**
     * OTP verification UI with custom number of input from the user
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyQuestionMarkTxtWithPrimaryTxt(@org.jetbrains.annotations.NotNull
    java.lang.String textWithQuestionMark, @org.jetbrains.annotations.NotNull
    java.lang.String primaryText, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    /**
     * Text with Comma : Text,
     * Text with Exclamation : Text..!!
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void TitleTextWithCommaAndExclamation(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.lang.String textWithComma, @org.jetbrains.annotations.NotNull
    java.lang.String textWithExclamation) {
    }
    
    /**
     * Email Input Text Box with Outline and leading email icon
     * User can Enter Email
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    private final void MyInputEmailField(androidx.compose.ui.Modifier modifier, java.lang.String value, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, java.lang.String hint) {
    }
    
    /**
     * Email Input Text Box with Email Title on Top
     * User can Enter Email in Input Text Box
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyEmailInputBoxSet(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
    
    /**
     * Phone Number Input Number Box with Outline and leading phone icon
     * User can Enter Phone Number
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    private final void MyPhoneInputField(androidx.compose.ui.Modifier modifier, java.lang.String value, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, java.lang.String hint) {
    }
    
    /**
     * Phone Number title above Phone Input Text Box
     * User can Enter Phone number below Phone Title
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyPhoneNumberInputBoxSet(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
    
    /**
     * Text Input Box with Outline and leading User icon
     * User can Enter Text as per Requirement
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    private final void MyInputTextField(androidx.compose.ui.Modifier modifier, java.lang.String value, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, java.lang.String hint, java.lang.String contentDesc) {
    }
    
    /**
     * Title Text above Input Text Box
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyTitleWithInputTextSet(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    java.lang.String contentDesc, @org.jetbrains.annotations.NotNull
    java.lang.String hint, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
    
    /**
     * Password Input Text Box with
     * lock leading icon and password visibility and non-visibility trailing icon
     * User can Enter Password
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    private final void MyPasswordInputField(androidx.compose.ui.Modifier modifier, java.lang.String value, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
    
    /**
     * Password title above Password Input Text Box
     * User can Enter Password below Password Title
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyPasswordInputBoxSet(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange) {
    }
    
    /**
     * Name : Value
     * Text with name : Text,
     * Text with value : Text
     *
     *
     * @author Shweta Fulzele
     */
    @androidx.compose.runtime.Composable
    public final void MyNameAndValue(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
}