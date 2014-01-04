<?xml version="1.0" encoding="UTF-8"?>

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@android:id/widget_frame"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:paddingLeft="8dp"
    android:paddingTop="5dp"
    android:paddingRight="10dp"
    android:paddingBottom="5dp"
    >

    <TextView android:id="@android:id/title"
            android:layout_alignParentLeft="true"
            android:layout_alignParentTop="true"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:textAppearance="?android:attr/textAppearanceMedium" />

    <TextView android:id="@android:id/summary"
            android:layout_alignParentLeft="true"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:layout_below="@android:id/title"
            android:textAppearance="?android:attr/textAppearanceSmall"
            android:textColor="?android:attr/textColorSecondary" />

    <TextView android:id="@+id/seekBarPrefUnitsRight"
            android:layout_alignParentRight="true"
            android:layout_below="@android:id/title"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textAppearance="?android:attr/textAppearanceSmall" />

    <TextView android:id="@+id/seekBarPrefValue"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_toLeftOf="@id/seekBarPrefUnitsRight"
            android:layout_below="@android:id/title"
            android:gravity="right"
            android_paddingRight="5dp"
            android:textAppearance="?android:attr/textAppearanceSmall" />

    <TextView android:id="@+id/seekBarPrefUnitsLeft"
            android:layout_below="@android:id/title"
            android:layout_toLeftOf="@id/seekBarPrefValue"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textAppearance="?android:attr/textAppearanceSmall" />

    <LinearLayout android:id="@+id/seekBarPrefBarContainer"
            android:layout_alignParentLeft="true"
            android:layout_alignParentBottom="true"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:layout_below="@android:id/summary">
    </LinearLayout>

</RelativeLayout>
