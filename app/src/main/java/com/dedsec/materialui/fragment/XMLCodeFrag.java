package com.dedsec.materialui.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dedsec.materialui.R;
import com.dedsec.materialui.ZoomTextView;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.classifier.CodeProcessor;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.Font;

public class XMLCodeFrag extends Fragment {

    private CodeView codeView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_xml_code, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void setData(View view, Context ctx, String code) {
        CodeProcessor.init(ctx);
        codeView = view.findViewById(R.id.codeview_xml);
        codeView.setOptions(Options.Default.get(ctx)
                .withLanguage("xml")
                .withCode(code)
                .withTheme(ColorTheme.MONOKAI)
                .withFont(Font.DroidSansMonoSlashed));
    }

    public CodeView getCodeLytXml(View view) {
        codeView = view.findViewById(R.id.codeview_xml);
        return codeView;
    }

}