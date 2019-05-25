package com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.smlnskgmail.jaman.hashchecker.R;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.BaseBottomSheet;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base.adapter.BaseBottomSheetListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public abstract class BaseListBottomSheet extends BaseBottomSheet {

    @BindView(R.id.rv_bottom_sheet_list_items)
    protected RecyclerView bottomSheetItems;

    private List<ListItemMarker> items = new ArrayList<>();

    @Override
    public void initUI() {
        bottomSheetItems.setLayoutManager(new LinearLayoutManager(getContext()));
        bottomSheetItems.setAdapter(getItemsAdapter());
    }

    public abstract BaseBottomSheetListAdapter getItemsAdapter();

    @NonNull
    public List<ListItemMarker> getItems() {
        return items;
    }

    public void setItems(@NonNull List<ListItemMarker> listItemMarkers) {
        this.items.addAll(listItemMarkers);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.bottom_sheet_list_items;
    }

}