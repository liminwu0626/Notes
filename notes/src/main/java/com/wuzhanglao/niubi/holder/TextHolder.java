package com.wuzhanglao.niubi.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.wuzhanglao.niubi.R;

/**
 * Created by wuming on 16/10/13.
 */

public class TextHolder extends RecyclerView.ViewHolder {

    public TextView desc;
    public View line;

    public TextHolder(View itemView) {
        super(itemView);
        desc = (TextView) itemView.findViewById(R.id.desc_tv);
        line = itemView.findViewById(R.id.text_holder_line);
    }
}
