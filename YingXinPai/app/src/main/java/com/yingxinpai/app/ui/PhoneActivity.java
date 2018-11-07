package com.yingxinpai.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.Permission;
import com.yanzhenjie.permission.PermissionListener;
import com.yanzhenjie.permission.Rationale;
import com.yanzhenjie.permission.RationaleListener;
import com.yingxinpai.app.R;
import com.yingxinpai.app.adapter.ContactsAdapter;

import java.util.List;

public class PhoneActivity extends BaseActivity implements View.OnClickListener {

    private ImageView backIV;
    private EditText phoneET;
    private TextView numKey0LL;
    private TextView numKey1LL;
    private TextView numKey2LL;
    private TextView numKey3LL;
    private TextView numKey4LL;
    private TextView numKey5LL;
    private TextView numKey6LL;
    private TextView numKey7LL;
    private TextView numKey8LL;
    private TextView numKey9LL;
    private TextView numKey10LL;
    private TextView numKey11LL;

    private LinearLayout mLocationLL;
    private LinearLayout mCallLL;
    private LinearLayout mDeleteLL;

    private ListView mListView;
    private ContactsAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        initViews();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iv_back) {
            finish();

        } else if (view.getId() == R.id.ll_num0) {
            String contentStr = phoneET.getText().toString();
            contentStr += "0";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num1) {
            String contentStr = phoneET.getText().toString();
            contentStr += "1";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num2) {
            String contentStr = phoneET.getText().toString();
            contentStr += "2";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num3) {
            String contentStr = phoneET.getText().toString();
            contentStr += "3";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num4) {
            String contentStr = phoneET.getText().toString();
            contentStr += "4";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num5) {
            String contentStr = phoneET.getText().toString();
            contentStr += "5";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num6) {
            String contentStr = phoneET.getText().toString();
            contentStr += "6";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num7) {
            String contentStr = phoneET.getText().toString();
            contentStr += "7";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num8) {
            String contentStr = phoneET.getText().toString();
            contentStr += "8";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num9) {
            String contentStr = phoneET.getText().toString();
            contentStr += "9";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num10) {
            String contentStr = phoneET.getText().toString();
            contentStr += "*";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_num11) {
            String contentStr = phoneET.getText().toString();
            contentStr += "#";
            phoneET.setText(contentStr);

        } else if (view.getId() == R.id.ll_location) {

        } else if (view.getId() == R.id.ll_call) {
            String contentStr = phoneET.getText().toString();
            if (contentStr.length() == 0) return;

            callPhone(contentStr);

        } else if (view.getId() == R.id.ll_delete) {
            String contentStr = phoneET.getText().toString();
            if (contentStr.length() == 0) return;
            contentStr = contentStr.substring(0, contentStr.length() - 1);
            phoneET.setText(contentStr);
        }

        phoneET.setSelection(phoneET.getText().toString().length());
    }

    private void callPhone(final String phone) {
        AndPermission.with(this)
                .permission(Permission.PHONE)
                .callback(new PermissionListener() {
                    @Override
                    public void onSucceed(int requestCode, @NonNull List<String> grantPermissions) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + phone));
                        startActivity(intent);
                    }

                    @Override
                    public void onFailed(int requestCode, @NonNull List<String> deniedPermissions) {

                    }
                }).rationale(new RationaleListener() {
            @Override
            public void showRequestPermissionRationale(int requestCode, Rationale rationale) {
                AndPermission.rationaleDialog(PhoneActivity.this, rationale).show();
            }
        });
    }

    private void initViews() {
        backIV = findViewById(R.id.iv_back);
        backIV.setOnClickListener(this);

        backIV = findViewById(R.id.iv_back);
        phoneET = findViewById(R.id.et_phone);

        numKey0LL = findViewById(R.id.ll_num0);
        numKey0LL.setOnClickListener(this);

        numKey1LL = findViewById(R.id.ll_num1);
        numKey1LL.setOnClickListener(this);

        numKey2LL = findViewById(R.id.ll_num2);
        numKey2LL.setOnClickListener(this);

        numKey3LL = findViewById(R.id.ll_num3);
        numKey3LL.setOnClickListener(this);

        numKey4LL = findViewById(R.id.ll_num4);
        numKey4LL.setOnClickListener(this);

        numKey5LL = findViewById(R.id.ll_num5);
        numKey5LL.setOnClickListener(this);

        numKey6LL = findViewById(R.id.ll_num6);
        numKey6LL.setOnClickListener(this);

        numKey7LL = findViewById(R.id.ll_num7);
        numKey7LL.setOnClickListener(this);

        numKey8LL = findViewById(R.id.ll_num8);
        numKey8LL.setOnClickListener(this);

        numKey9LL = findViewById(R.id.ll_num9);
        numKey9LL.setOnClickListener(this);

        numKey10LL = findViewById(R.id.ll_num10);
        numKey10LL.setOnClickListener(this);

        numKey11LL = findViewById(R.id.ll_num11);
        numKey11LL.setOnClickListener(this);


        mLocationLL = findViewById(R.id.ll_location);
        mLocationLL.setOnClickListener(this);

        mCallLL = findViewById(R.id.ll_call);
        mCallLL.setOnClickListener(this);

        mDeleteLL = findViewById(R.id.ll_delete);
        mDeleteLL.setOnClickListener(this);

        mListView = findViewById(R.id.lv_contacts);
        mAdapter = new ContactsAdapter(this);
        mListView.setAdapter(mAdapter);
    }

}
